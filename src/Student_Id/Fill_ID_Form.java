package Student_Id;
import Required.DBconnect;
import com.sun.glass.events.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.filechooser.*;
/*
 * @author Vinu_Gawade
 */
public class Fill_ID_Form extends javax.swing.JFrame {

public static ResultSet rs=Login_Page.rs;
public static PreparedStatement prestmt=Login_Page.prestmt;
public JFileChooser Image_Selector;
public int index;
    public Fill_ID_Form() {
        initComponents();     
        setIconImage(new ImageIcon(getClass().getResource("/Img/desktop_logo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFileChooser1 = new javax.swing.JFileChooser();
        Back_Button = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Img_File = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        MobNo = new javax.swing.JTextField();
        DOB = new org.jdesktop.swingx.JXDatePicker();
        Enroll_no = new javax.swing.JTextField();
        jLabel8w = new javax.swing.JLabel();
        Show_Img = new javax.swing.JDesktopPane();
        Image_Label = new javax.swing.JLabel();
        Home_Button = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ClgName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Adr = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        Cancel_Form = new javax.swing.JButton();
        Save_Form = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        dept = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ID Registration");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("Fill_ID"); // NOI18N
        setSize(new java.awt.Dimension(515, 400));

        Back_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back2.png"))); // NOI18N
        Back_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_ButtonMouseClicked(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(450, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("ID-Card Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        Img_File.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Img_File.setText("Browse");
        Img_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Img_FileActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Your Photo Attach Here*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Img_File))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Img_File)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Your Full Name*");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Mobile No.*");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Date of Birth*");

        Name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NameKeyTyped(evt);
            }
        });

        MobNo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MobNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MobNoKeyTyped(evt);
            }
        });

        Enroll_no.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Enroll_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Enroll_noKeyTyped(evt);
            }
        });

        jLabel8w.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8w.setText("Enrollment No.*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Name))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MobNo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8w)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Enroll_no, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MobNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8w)
                    .addComponent(Enroll_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Image_Label.setMaximumSize(new java.awt.Dimension(5, 5));
        Image_Label.setMinimumSize(new java.awt.Dimension(5, 5));
        Image_Label.setName(""); // NOI18N

        Show_Img.setLayer(Image_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Show_ImgLayout = new javax.swing.GroupLayout(Show_Img);
        Show_Img.setLayout(Show_ImgLayout);
        Show_ImgLayout.setHorizontalGroup(
            Show_ImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Image_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );
        Show_ImgLayout.setVerticalGroup(
            Show_ImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Image_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );

        Home_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home.png"))); // NOI18N
        Home_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_ButtonMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("College Name*");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Your Address*");

        ClgName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ClgName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ClgNameKeyTyped(evt);
            }
        });

        Adr.setColumns(20);
        Adr.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Adr.setLineWrap(true);
        Adr.setRows(5);
        Adr.setLineWrap(true);
        jScrollPane2.setViewportView(Adr);

        Cancel_Form.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cancel_Form.setText("Cancel");
        Cancel_Form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_FormActionPerformed(evt);
            }
        });

        Save_Form.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Save_Form.setText("Save");
        Save_Form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_FormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(Save_Form)
                .addGap(18, 18, 18)
                .addComponent(Cancel_Form)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Cancel_Form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Save_Form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Deparment *");

        dept.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dept.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                deptKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Home_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Show_Img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(22, 22, 22)
                                                .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(10, 10, 10)
                                                .addComponent(ClgName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Home_Button)
                            .addComponent(Back_Button))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ClgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Show_Img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Back_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_ButtonMouseClicked
        this.setVisible(false);
        new Home(Home.User_Loggedin).setVisible(true);
    }//GEN-LAST:event_Back_ButtonMouseClicked

     private byte[] Convert_To_BLOB(String file) {
        ByteArrayOutputStream bos = null;
        try {
            System.out.println("Input File Image:"+file);
            File f = new File(file);
            FileInputStream fis = new FileInputStream(f);
            byte[] buffer = new byte[500000];
            bos = new ByteArrayOutputStream();
            for (int len; (len = fis.read(buffer)) != -1;) {
                bos.write(buffer, 0, len);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex+"View_Form@412\n"+Arrays.toString(ex.getStackTrace()));
        } catch (IOException ex) {
            System.out.println(ex+"View_Form@414\n"+Arrays.toString(ex.getStackTrace()));
        }
        return bos != null ? bos.toByteArray() : null;
    }
    private void Home_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_ButtonMouseClicked
        this.setVisible(false);
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_Home_ButtonMouseClicked

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
                    Image dimg = img.getScaledInstance(Image_Label.getWidth(), Image_Label.getHeight(),Image.SCALE_SMOOTH);
                    Image_Label.setIcon(new ImageIcon(dimg));                 
        }
    
    }//GEN-LAST:event_Img_FileActionPerformed

    private void Save_FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_FormActionPerformed

        try {
                        prestmt = DBconnect.getConnect().prepareStatement("SELECT COUNT(*) FROM (SELECT * FROM Students_ID)");
                              rs= prestmt.executeQuery();
                              if(rs.getInt("COUNT(*)")<0){
                                  System.out.println("Existing Rows:"+index);
                                  index=1;
                                  System.out.println("Start Rows:"+index);
                              }else{
                                index=rs.getInt("COUNT(*)");
                                System.out.println("Existing Rows:"+index);
                                ++index;
                                System.out.println("Start Rows:"+index);
                              }
                      rs.close();
                            
                      prestmt = DBconnect.getConnect().prepareStatement("INSERT INTO \"Students_ID\" (\"srno\", \"photo\", \"name\", \"dob\", \"mobile\", \"college\", \"address\", \"enroll_no\", \"dept\") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
                          
                            prestmt.setInt(1,index);
                          
                            if(Image_Selector==null){
                                JOptionPane.showMessageDialog(null,"PLEASE SELECT YOUR PICTURE.");                        
                            }else{
                                prestmt.setBytes(2,Convert_To_BLOB(Image_Selector.getSelectedFile().getAbsolutePath()));         
                            }
                            
                            if(Name.getText().isEmpty()){
                                JOptionPane.showMessageDialog(null,"PLEASE ENTER NAME.");
                            }else{
                                prestmt.setString(3,Name.getText());
                            }
                            
                            if(DOB.getDate()==null){
                                JOptionPane.showMessageDialog(null,"PLEASE SELECT DATE OF BIRTH.");
                            }else{
                            prestmt.setString(4,new SimpleDateFormat("dd-MM-yyyy").format(DOB.getDate()));
                            }
                            
                            if(MobNo.getText().isEmpty()){
                                JOptionPane.showMessageDialog(null,"PLEASE ENTER MOBILE NUMBER.");
                            }else{
                                prestmt.setString(5,MobNo.getText());    
                            }
                            
                            if(ClgName.getText().isEmpty()){
                                JOptionPane.showMessageDialog(null,"PLEASE ENTER COLLAGE NAME.");
                            }else{
                                prestmt.setString(6,ClgName.getText());   
                            }
                            
                            if(Adr.getText().isEmpty()){
                                JOptionPane.showMessageDialog(null,"PLEASE ENTER ADDRESS.");
                            }else{
                                prestmt.setString(7,Adr.getText());
                            }
                            
                            if(Enroll_no.getText().isEmpty()){
                                JOptionPane.showMessageDialog(null,"PLEASE ENTER ADDRESS.");
                            }else{
                                prestmt.setString(8,Enroll_no.getText());
                            }
                            
                            if(dept.getText().isEmpty()){
                                JOptionPane.showMessageDialog(null,"PLEASE ENTER ADDRESS.");
                            }else{
                                prestmt.setString(9,dept.getText());
                            }
                            int result=prestmt.executeUpdate();
                            System.out.println("\n Result:"+result);
                            if(result==1){
                                System.out.println("ID Successfully Added...");
                                JOptionPane.showMessageDialog(null, "ID Successfully Added...", "Task Complete", JOptionPane.INFORMATION_MESSAGE);
                                this.setVisible(false);
                                new View_Form().setVisible(true);
                            }else{
                            System.out.println("Something Goes Wrong Please Try Again...");
                                JOptionPane.showMessageDialog(null, "Something Is Wrong Please Try Again...", "Task Fail", JOptionPane.INFORMATION_MESSAGE);
                                this.setVisible(false);
                                new Login_Page().setVisible(true);
                            }
                                rs.close();
                      
                } catch (SQLException e) {
            System.out.println(e+"\nFill_ID_Form@529\n"+Arrays.toString(e.getStackTrace()));
                      try {
                          rs.close();
                      } catch (SQLException ex) {
            System.out.println(ex+"\nFill_ID_Form@533\n"+Arrays.toString(ex.getStackTrace()));
                      }
                }
    }//GEN-LAST:event_Save_FormActionPerformed

    private void Cancel_FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_FormActionPerformed
        this.setVisible(false);
        new Home(Home.User_Loggedin).setVisible(true);
    }//GEN-LAST:event_Cancel_FormActionPerformed

    private void MobNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MobNoKeyTyped
        if(!(Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar()==KeyEvent.VK_BACKSPACE) || evt.getKeyChar()==KeyEvent.VK_DELETE)){
            evt.consume();
            JOptionPane.showMessageDialog(null,"PLEASE ENTER NUMBERS ONLY.");
            }    
    }//GEN-LAST:event_MobNoKeyTyped

    private void NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyTyped
       if(!(Character.isAlphabetic(evt.getKeyChar()) || (evt.getKeyChar()==' ')|| (evt.getKeyChar()==KeyEvent.VK_BACKSPACE) || evt.getKeyChar()==KeyEvent.VK_DELETE)){
            evt.consume();
            JOptionPane.showMessageDialog(null,"PLEASE ENTER CHARACTERS ONLY");
        }
    }//GEN-LAST:event_NameKeyTyped

    private void ClgNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ClgNameKeyTyped
        if(!(Character.isAlphabetic(evt.getKeyChar()) || (evt.getKeyChar()==' ') || (evt.getKeyChar()==',') || (evt.getKeyChar()==KeyEvent.VK_BACKSPACE) || evt.getKeyChar()==KeyEvent.VK_DELETE)){
            evt.consume();
            JOptionPane.showMessageDialog(null,"PLEASE ENTER CHARACTERS ONLY");
        }
    }//GEN-LAST:event_ClgNameKeyTyped

    private void Enroll_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enroll_noKeyTyped
        if(!(Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar()==KeyEvent.VK_BACKSPACE) || evt.getKeyChar()==KeyEvent.VK_DELETE)){
                    evt.consume();
                    JOptionPane.showMessageDialog(null,"PLEASE ENTER NUMBERS ONLY.");
                    } 
    }//GEN-LAST:event_Enroll_noKeyTyped

    private void deptKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deptKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_deptKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fill_ID_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fill_ID_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fill_ID_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fill_ID_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Fill_ID_Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea Adr;
    private javax.swing.JLabel Back_Button;
    private javax.swing.JButton Cancel_Form;
    public javax.swing.JTextField ClgName;
    public org.jdesktop.swingx.JXDatePicker DOB;
    public javax.swing.JTextField Enroll_no;
    private javax.swing.JLabel Home_Button;
    private javax.swing.JLabel Image_Label;
    private javax.swing.JButton Img_File;
    public javax.swing.JTextField MobNo;
    public javax.swing.JTextField Name;
    private javax.swing.JButton Save_Form;
    private javax.swing.JDesktopPane Show_Img;
    public javax.swing.JTextField dept;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel8w;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
