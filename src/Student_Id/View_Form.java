package Student_Id;

import Required.DBconnect;
import static Student_Id.Fill_ID_Form.prestmt;
import static Student_Id.Fill_ID_Form.rs;
import com.itextpdf.text.DocumentException;
import com.sun.glass.events.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.*;
import javax.swing.table.*;

/*
 * @author Vinu_Gawade
 */
public class View_Form extends javax.swing.JFrame {
DefaultTableModel model;
BufferedImage img;
Image dimg;
public TableRowSorter sorter;
public JFileChooser Image_Selector;
public int srid;
    public  View_Form() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Img/desktop_logo.png")).getImage());
        
        int[] dim={28,180,80,80,100,250,80,90};
        for(int i=0;i<=7;i++){
        view_table.getColumnModel().getColumn(i).setPreferredWidth(dim[i]);
        }
        try {
            fetchDB();
        } catch (SQLException e) {
            System.out.println(e+"View_Form@39\n"+Arrays.toString(e.getStackTrace()));
        }
         
    }

    public static boolean checkDB(){ 
        if (new View_Form().view_table != null && new View_Form().view_table.getModel() != null) {
            if(new View_Form().view_table.getModel().getRowCount()<=0){
                return true;  
            }
        }
        return false;
    } 
    private void fetchDB() throws SQLException{
        
         model= (DefaultTableModel)view_table.getModel();
            sorter = new TableRowSorter<>(model);    
            view_table.setRowSorter(sorter);
        prestmt = DBconnect.getConnect().prepareStatement("SELECT * FROM Students_ID");
                rs = prestmt.executeQuery();
                while(rs.next()){
                    model.addRow(new Object[]{rs.getInt("srno"),rs.getString("name"),rs.getString("dob"),rs.getString("mobile"),rs.getString("college"),rs.getString("address"),rs.getString("dept"),rs.getString("enroll_no")});
                }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Img_File = new javax.swing.JButton();
        Back_Button1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        view_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        pic = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        dbname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dbnumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dbclg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dbaddress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        Home_Button = new javax.swing.JLabel();
        view_id = new javax.swing.JButton();
        dbenroll_no = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dbdept = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dbdate = new org.jdesktop.swingx.JXDatePicker();
        Img_File1 = new javax.swing.JButton();

        Img_File.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Img_File.setText("Browse");
        Img_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Img_FileActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View_Form");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("View_Form"); // NOI18N

        Back_Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back2.png"))); // NOI18N
        Back_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_Button1MouseClicked(evt);
            }
        });

        view_table.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        view_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Name", "Date of Birth", "Mobile no", "College Name", "Address", "Department", "Enrollment Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        view_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        view_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(view_table);
        if (view_table.getColumnModel().getColumnCount() > 0) {
            view_table.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Students Id");

        jDesktopPane1.setLayer(pic, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );

        id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        dbname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dbname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dbnameKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Date of Birth");

        dbnumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dbnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dbnumberKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Mobile Number");

        dbclg.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dbclg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dbclgKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("College Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Address");

        dbaddress.setColumns(20);
        dbaddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dbaddress.setLineWrap(true);
        dbaddress.setRows(5);
        dbaddress.setLineWrap(true);
        jScrollPane2.setViewportView(dbaddress);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("ID :-");

        update.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        Home_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home.png"))); // NOI18N
        Home_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_ButtonMouseClicked(evt);
            }
        });

        view_id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        view_id.setText("VIEW");
        view_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_idActionPerformed(evt);
            }
        });

        dbenroll_no.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dbenroll_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dbenroll_noKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Enrollment Number");

        dbdept.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dbdept.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dbdeptKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Department");

        Img_File1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Img_File1.setText("Browse");
        Img_File1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Img_File1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back_Button1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Home_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(dbname, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(dbnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dbdate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Img_File1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane2)
                                    .addComponent(dbclg))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dbenroll_no, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(dbdept, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(view_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Home_Button)
                        .addComponent(Back_Button1))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Img_File1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dbenroll_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(view_id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(dbname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dbdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(dbnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(dbclg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(4, 4, 4)
                        .addComponent(dbdept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Back_Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_Button1MouseClicked
        this.setVisible(false);
        new Home(Home.User_Loggedin).setVisible(true);
    }//GEN-LAST:event_Back_Button1MouseClicked
byte[] imageByte;
    private void view_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_tableMouseClicked
       srid=(int) view_table.getValueAt(view_table.getSelectedRow(), 0);
       id.setText(srid+"");
       System.out.println(view_table.getValueAt(view_table.getSelectedRow(), 0).toString());
       try{
       prestmt = DBconnect.getConnect().prepareStatement("SELECT * FROM Students_ID WHERE `srno`=?");
       prestmt.setInt(1, (int) view_table.getValueAt(view_table.getSelectedRow(), 0));
                rs = prestmt.executeQuery();
                while(rs.next()){
  	         imageByte = rs.getBytes("photo");
  	          img=ImageIO.read(new ByteArrayInputStream(imageByte));
                  dimg = img.getScaledInstance(pic.getWidth(), pic.getHeight(),Image.SCALE_SMOOTH);
                  pic.setIcon(new ImageIcon(dimg));
                  dbname.setText(rs.getString("name"));
                  dbdate.setDate(new SimpleDateFormat("dd-MM-yyyy").parse(rs.getString("dob")));
                  dbnumber.setText(rs.getString("mobile"));
                  dbclg.setText(rs.getString("college"));
                  dbaddress.setText(rs.getString("address"));  
                  dbenroll_no.setText(rs.getString("enroll_no"));
                  dbdept.setText(rs.getString("dept"));
                }
                rs.close();
                
       }catch(SQLException e){
        System.out.println(e+"View_Form@405\n"+Arrays.toString(e.getStackTrace()));
        } catch (IOException | ParseException ex) {
        System.out.println(ex+"View_Form@407\n"+Arrays.toString(ex.getStackTrace()));
        }
    }//GEN-LAST:event_view_tableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
    if(View_Form.checkDB()==true){
                    System.out.println("Nothing Exist in Database...");
                    JOptionPane.showMessageDialog(null, "Nothing Exist in Database...", "Task Fail", JOptionPane.INFORMATION_MESSAGE);
                     this.setVisible(false);
                     new Home(Home.User_Loggedin).setVisible(true);
    }else{
        try{
          prestmt = DBconnect.getConnect().prepareStatement("UPDATE \"Students_ID\" SET \"name\"=?, \"dob\"=?, \"mobile\"=?, \"college\"=?, \"address\"=?, \"enroll_no\"=?, \"dept\"=?, \"photo\"=? WHERE `srno`=?");

                                 if(dbname.getText().isEmpty()){
                                     JOptionPane.showMessageDialog(null,"PLEASE ENTER NAME.");
                                 }else{
                                     prestmt.setString(1,dbname.getText());
                                 }

                                 if(dbdate.getDate()==null){
                                     JOptionPane.showMessageDialog(null,"PLEASE SELECT DATE OF BIRTH.");
                                 }else{
                                    prestmt.setString(2,new SimpleDateFormat("dd-MM-yyyy").format(dbdate.getDate()));
                                 }

                                 if(dbnumber.getText().isEmpty()){
                                     JOptionPane.showMessageDialog(null,"PLEASE ENTER MOBILE NUMBER.");
                                 }else{
                                     prestmt.setString(3,dbnumber.getText());   
                                 }

                                 if(dbclg.getText().isEmpty()){
                                     JOptionPane.showMessageDialog(null,"PLEASE ENTER COLLAGE NAME.");
                                 }else{
                                     prestmt.setString(4,dbclg.getText());   
                                 }

                                 if(dbaddress.getText().isEmpty()){
                                     JOptionPane.showMessageDialog(null,"PLEASE ENTER ADDRESS.");
                                 }else{
                                     prestmt.setString(5,dbaddress.getText());
                                 }
                                 
                                 if(dbaddress.getText().isEmpty()){
                                     JOptionPane.showMessageDialog(null,"PLEASE ENTER ENROLLMET NO.");
                                 }else{
                                     prestmt.setString(6,dbenroll_no.getText());
                                 }
                                 
                                 if(dbdept.getText().isEmpty()){
                                     JOptionPane.showMessageDialog(null,"PLEASE ENTER ENROLLMET NO.");
                                 }else{
                                     prestmt.setString(7,dbdept.getText());
                                 }
                                 if(Image_Selector==null){
                                JOptionPane.showMessageDialog(null,"PLEASE SELECT YOUR PICTURE.");                        
                                }else{
                                    prestmt.setBytes(8,Fill_ID_Form.Convert_To_BLOB(Image_Selector.getSelectedFile().getAbsolutePath()));         
                                }
                                 prestmt.setInt(9,srid);
                                 int result=prestmt.executeUpdate();
                                 System.out.println("\n Result:"+result);
                                 if(result==1){
                                     System.out.println("Student Information Updated...");
                                     JOptionPane.showMessageDialog(null, "Student Information Updated...", "Task Complete", JOptionPane.INFORMATION_MESSAGE);
                                     model.setRowCount(0);
                                     fetchDB();
                                 }else{
                                 System.out.println("Something Goes Wrong Please Try Again...");
                                     JOptionPane.showMessageDialog(null, "Something Is Wrong Please Try Again...", "Task Fail", JOptionPane.INFORMATION_MESSAGE);
                                     this.setVisible(false);
                                     new Home(Home.User_Loggedin).setVisible(true);
                                 }
                 rs.close();
             } catch (SQLException ex) {
             System.out.println(ex+"View_Form@478\n"+Arrays.toString(ex.getStackTrace()));
             }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            
             prestmt = DBconnect.getConnect().prepareStatement("DELETE FROM \"Students_ID\" WHERE `srno`=?");
             prestmt.setInt(1,srid);
                int result=prestmt.executeUpdate();
                            System.out.println("\n Result:"+result);
                            if(result==1){
                                System.out.println("Record Deleted Successfully...");
                                JOptionPane.showMessageDialog(null, "Record Deleted Successfully...", "Task Complete", JOptionPane.INFORMATION_MESSAGE);
                                model.setRowCount(0);
                                dbname.setText("");
                                dbdate.setDate(null);
                                dbaddress.setText("");
                                dbclg.setText("");
                                dbnumber.setText("");
                                dbenroll_no.setText("");
                                dbdept.setText("");
                                fetchDB();
                            }else{
                            System.out.println("Something Goes Wrong Please Try Again...");
                                JOptionPane.showMessageDialog(null, "Something Is Wrong Please Try Again...", "Task Fail", JOptionPane.INFORMATION_MESSAGE);
                                this.setVisible(false);
                                new Home(Home.User_Loggedin).setVisible(true);
                            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex+"View_Form@510\n"+Arrays.toString(ex.getStackTrace()));
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void Home_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_ButtonMouseClicked
        this.setVisible(false);
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_Home_ButtonMouseClicked

    private void dbnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dbnameKeyTyped
        // TODO add your handling code here:
        if(!(Character.isAlphabetic(evt.getKeyChar()) || (evt.getKeyChar()==' ') || (evt.getKeyChar()==KeyEvent.VK_BACKSPACE) || evt.getKeyChar()==KeyEvent.VK_DELETE)){
            evt.consume();
            JOptionPane.showMessageDialog(null,"PLEASE ENTER CHARACTERS ONLY.");
            }    
    }//GEN-LAST:event_dbnameKeyTyped

    private void dbnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dbnumberKeyTyped
        if(!(Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar()==KeyEvent.VK_BACKSPACE) || evt.getKeyChar()==KeyEvent.VK_DELETE)){
            evt.consume();
            JOptionPane.showMessageDialog(null,"PLEASE ENTER NUMBERS ONLY.");
            }    
    }//GEN-LAST:event_dbnumberKeyTyped

    private void dbclgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dbclgKeyTyped
        if(!(Character.isAlphabetic(evt.getKeyChar()) || (evt.getKeyChar()==' ') || (evt.getKeyChar()==',')  || (evt.getKeyChar()==KeyEvent.VK_BACKSPACE) || evt.getKeyChar()==KeyEvent.VK_DELETE)){
            evt.consume();
            JOptionPane.showMessageDialog(null,"PLEASE ENTER CHARACTERS ONLY.");
            }    
    }//GEN-LAST:event_dbclgKeyTyped

    private void view_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_idActionPerformed
        try {
            if(!view_table.getSelectionModel().isSelectionEmpty()){
                new Create_PDF(imageByte,srid);
            }else{
            JOptionPane.showMessageDialog(null,"PLEASE SELECT STUDENT.");
            }
        } catch (FileNotFoundException | DocumentException | SQLException ex) {
             System.out.println(ex+"View_Form@549\n"+Arrays.toString(ex.getStackTrace()));
        } catch (IOException ex) { 
            System.out.println(ex+"View_Form@551\n"+Arrays.toString(ex.getStackTrace()));
        }
        
    }//GEN-LAST:event_view_idActionPerformed

    private void dbenroll_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dbenroll_noKeyTyped
        if(!(Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar()==KeyEvent.VK_BACKSPACE) || evt.getKeyChar()==KeyEvent.VK_DELETE)){
                    evt.consume();
                    JOptionPane.showMessageDialog(null,"PLEASE ENTER NUMBERS ONLY.");
                    }    
    }//GEN-LAST:event_dbenroll_noKeyTyped

    private void dbdeptKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dbdeptKeyTyped
       if(!(Character.isAlphabetic(evt.getKeyChar()) || (evt.getKeyChar()==' ') || (evt.getKeyChar()==KeyEvent.VK_BACKSPACE) || evt.getKeyChar()==KeyEvent.VK_DELETE)){
            evt.consume();
            JOptionPane.showMessageDialog(null,"PLEASE ENTER CHARACTERS ONLY.");
            }    
    }//GEN-LAST:event_dbdeptKeyTyped

    private void Img_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Img_FileActionPerformed

        Image_Selector = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        Image_Selector.setFileFilter(new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes()));
        Image_Selector.setFileSelectionMode(JFileChooser.FILES_ONLY);

        if (Image_Selector.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){

            System.out.println("Selected File Image:"+Image_Selector.getSelectedFile().getAbsolutePath());

            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(Image_Selector.getSelectedFile().getAbsolutePath()));
            } catch (IOException e) {
                System.out.println(e+"\nFill_ID_Form@437\n"+Arrays.toString(e.getStackTrace()));
            }
            Image dimg = img.getScaledInstance(pic.getWidth(), pic.getHeight(),Image.SCALE_SMOOTH);
            pic.setIcon(new ImageIcon(dimg));
        }

    }//GEN-LAST:event_Img_FileActionPerformed

    private void Img_File1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Img_File1ActionPerformed

        Image_Selector = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        Image_Selector.setFileFilter(new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes()));
        Image_Selector.setFileSelectionMode(JFileChooser.FILES_ONLY);

        if (Image_Selector.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){

            System.out.println("Selected File Image:"+Image_Selector.getSelectedFile().getAbsolutePath());

            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(Image_Selector.getSelectedFile().getAbsolutePath()));
            } catch (IOException e) {
                System.out.println(e+"\nFill_ID_Form@437\n"+Arrays.toString(e.getStackTrace()));
            }
            Image dimg = img.getScaledInstance(pic.getWidth(), pic.getHeight(),Image.SCALE_SMOOTH);
            pic.setIcon(new ImageIcon(dimg));
        }
    }//GEN-LAST:event_Img_File1ActionPerformed

    
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new View_Form().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_Button1;
    private javax.swing.JLabel Home_Button;
    private javax.swing.JButton Img_File;
    private javax.swing.JButton Img_File1;
    public javax.swing.JTextArea dbaddress;
    public javax.swing.JTextField dbclg;
    private org.jdesktop.swingx.JXDatePicker dbdate;
    public javax.swing.JTextField dbdept;
    public javax.swing.JTextField dbenroll_no;
    public javax.swing.JTextField dbname;
    public javax.swing.JTextField dbnumber;
    private javax.swing.JButton delete;
    private javax.swing.JLabel id;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel pic;
    private javax.swing.JButton update;
    private javax.swing.JButton view_id;
    public javax.swing.JTable view_table;
    // End of variables declaration//GEN-END:variables
}
