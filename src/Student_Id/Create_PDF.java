package Student_Id;

import Required.DBconnect;
import static Student_Id.Fill_ID_Form.prestmt;
import static Student_Id.Fill_ID_Form.rs;
import com.itextpdf.text.*;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.*;
import java.awt.Desktop;
import java.io.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class Create_PDF  {

    Create_PDF(byte[] img,int id) throws FileNotFoundException, DocumentException, SQLException, IOException {

        Document document = new Document(PageSize.A4);
        document.addTitle("Students ID");
        document.addSubject("Pirnt Students ID");
        document.addAuthor("Developed By TYCO ROLL-NO:1,3,6 ");
        document.addCreator("Vinu_Gawade");
        prestmt = DBconnect.getConnect().prepareStatement("SELECT * FROM \"Students_ID\" WHERE `srno`=?");
             prestmt.setInt(1,id);
        rs = prestmt.executeQuery();
       
        PdfWriter.getInstance(document, new FileOutputStream(FileSystemView.getFileSystemView().getHomeDirectory()+"\\"+rs.getString("name")+" ID.pdf"));
        document.open();
        PdfPTable table = new PdfPTable(4); 
            table.setTotalWidth(new float[]{ 45,50,5, 100 });
            table.getDefaultCell().setBorder(Rectangle.NO_BORDER);
            PdfPCell cell = new PdfPCell(new Phrase(rs.getString("college")));
            cell.setColspan(4);
            cell.setMinimumHeight(25);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
             Image image = Image.getInstance(img);
            image.setScaleToFitHeight(false);
            image.scaleToFit(96f, 124.8f);
        PdfPCell imgcell = new PdfPCell(image);
        imgcell.setBorder(Rectangle.NO_BORDER);
        imgcell.setMinimumHeight(20);
        imgcell.setRowspan(7);
        table.addCell(imgcell);

               table.addCell("Name");table.addCell(":");  table.addCell(rs.getString("name"));     
               table.addCell("DOB"); table.addCell(":"); table.addCell(rs.getString("dob"));
               table.addCell("Enrollment No");table.addCell(":");  table.addCell(rs.getString("enroll_no"));
               table.addCell("Department");table.addCell(":");  table.addCell(rs.getString("dept"));
               table.addCell("Mobile No");table.addCell(":");  table.addCell(rs.getString("mobile"));
               table.addCell("Issued Date"); table.addCell(":"); table.addCell(new SimpleDateFormat("dd-MM-yyyy").format(new Date()).toString());
               table.addCell("Principal Sign");table.addCell(":");  table.addCell("");

            document.add(table);    
            JOptionPane.showMessageDialog(null, "PDF Saved On Your Desktop...", "Task Complete", JOptionPane.INFORMATION_MESSAGE);

        System.out.println("Done");
                if (Desktop.isDesktopSupported()) {
            try { 
                Desktop.getDesktop().open(new File(FileSystemView.getFileSystemView().getHomeDirectory()+"\\"+rs.getString("name")+" ID.pdf"));
            } catch (IOException e) { 
             JOptionPane.showMessageDialog(null, "No Default App To Open PDF Files.", "Task Complete", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(e+"View_Form@66\n"+Arrays.toString(e.getStackTrace()));}
        }
        document.close();
        rs.close();
    }
}