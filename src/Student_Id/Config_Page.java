package Student_Id;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.Image;
import javax.imageio.*;
import java.awt.image.*;
import Required.DBconnect;
import static Student_Id.Fill_ID_Form.prestmt;
import static Student_Id.Fill_ID_Form.rs;
import java.sql.SQLException;
import javax.swing.filechooser.*;
import java.text.SimpleDateFormat;
import org.json.simple.*;
import org.json.simple.parser.*;

/**
 *
 * @author Vinu Gawade
 */
public class Config_Page extends javax.swing.JFrame {

    BufferedImage img;
    Image dimg;
    public JFileChooser Image_Selector;
    byte[] imageByte;

    public Config_Page() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Img/desktop_logo.png")).getImage());
        try {
            JSONParser parser = new JSONParser();
            prestmt = DBconnect.getConnect().prepareStatement("SELECT * FROM config");
            rs = prestmt.executeQuery();
            while (rs.next()) {
                if (rs.getString(1).equals("clg_logo")) {
                    imageByte = rs.getBytes(2);
                    img = ImageIO.read(new ByteArrayInputStream(imageByte));
                    dimg = img.getScaledInstance(clg_logo.getWidth(), clg_logo.getHeight(), Image.SCALE_SMOOTH);
                    clg_logo.setIcon(new ImageIcon(dimg)); //.replace("\\", "")
                }
                if (rs.getString(1).equals("config")) {
                    Object DataObj = parser.parse(rs.getString(2));
                    JSONObject Data = (JSONObject) DataObj;
                    clg_name.setText(Data.get("clg_name").toString());
                    clg_addr.setText(Data.get("clg_addr").toString());
                    clg_DTE_code.setText(Data.get("clg_DTE_code").toString());
                    clg_MSBTE_code.setText(Data.get("clg_MSBTE_code").toString());
                    clg_contact.setText(Data.get("clg_contact").toString());
                }
            }
            rs.close();
        } catch (IOException | SQLException | ParseException e) {
            System.out.println(e + "\nConfig_Page@185\n" + Arrays.toString(e.getStackTrace()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Home_Button = new javax.swing.JLabel();
        Back_Button = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Clg_Logo_File = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Show_Img = new javax.swing.JDesktopPane();
        clg_logo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clg_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clg_addr = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Cancel_Form = new javax.swing.JButton();
        Save_Form = new javax.swing.JButton();
        clg_contact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        clg_MSBTE_code = new javax.swing.JTextField();
        clg_DTE_code = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(450, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Configurations");

        Home_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home.png"))); // NOI18N
        Home_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_ButtonMouseClicked(evt);
            }
        });

        Back_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/back.png"))); // NOI18N
        Back_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_ButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Home_Button)
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Back_Button)
                    .addComponent(Home_Button)
                    .addComponent(jLabel1))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        Clg_Logo_File.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Clg_Logo_File.setText("Browse");
        Clg_Logo_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clg_Logo_FileActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText(" College Logo*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Clg_Logo_File, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clg_Logo_File)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        clg_logo.setMaximumSize(new java.awt.Dimension(5, 5));
        clg_logo.setMinimumSize(new java.awt.Dimension(5, 5));
        clg_logo.setName(""); // NOI18N

        Show_Img.setLayer(clg_logo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Show_ImgLayout = new javax.swing.GroupLayout(Show_Img);
        Show_Img.setLayout(Show_ImgLayout);
        Show_ImgLayout.setHorizontalGroup(
            Show_ImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clg_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Show_ImgLayout.setVerticalGroup(
            Show_ImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clg_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("College Name*");

        clg_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Your Address*");

        clg_addr.setColumns(20);
        clg_addr.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        clg_addr.setLineWrap(true);
        clg_addr.setRows(5);
        clg_addr.setLineWrap(true);
        jScrollPane2.setViewportView(clg_addr);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("DTE Code*");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("MSBTE Code*");

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

        clg_contact.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Mobile No.*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Show_Img)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(clg_DTE_code, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(Save_Form)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clg_MSBTE_code, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(Cancel_Form))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clg_name, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(clg_contact))))
                .addGap(12, 15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Show_Img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(clg_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(clg_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clg_MSBTE_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clg_DTE_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel_Form)
                    .addComponent(Save_Form))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 2, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Home_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_ButtonMouseClicked
        this.setVisible(false);
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_Home_ButtonMouseClicked

    private void Back_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_ButtonMouseClicked
        this.setVisible(false);
        new Home(Home.User_Loggedin).setVisible(true);
    }//GEN-LAST:event_Back_ButtonMouseClicked

    private void Clg_Logo_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clg_Logo_FileActionPerformed

        Image_Selector = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        Image_Selector.setFileFilter(new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes()));
        Image_Selector.setFileSelectionMode(JFileChooser.FILES_ONLY);

        if (Image_Selector.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            System.out.println("Selected File Image:" + Image_Selector.getSelectedFile().getAbsolutePath());

            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(Image_Selector.getSelectedFile().getAbsolutePath()));
            } catch (IOException e) {
                System.out.println(e + "\nConfig_Page@185\n" + Arrays.toString(e.getStackTrace()));
            }
            Image dimg = img.getScaledInstance(clg_logo.getWidth(), clg_logo.getHeight(), Image.SCALE_SMOOTH);
            clg_logo.setIcon(new ImageIcon(dimg));
        }
    }//GEN-LAST:event_Clg_Logo_FileActionPerformed

    private void Cancel_FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_FormActionPerformed
        this.setVisible(false);
        new Home(Home.User_Loggedin).setVisible(true);
    }//GEN-LAST:event_Cancel_FormActionPerformed

    private void Save_FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_FormActionPerformed

        if (Image_Selector != null) {
            try {
                String sql = "UPDATE \"main\".\"config\" SET \"value\"=? WHERE \"key\"=\"clg_logo\"";
                prestmt = DBconnect.getConnect().prepareStatement(sql);
                prestmt.setBytes(1, Validator.Convert_To_BLOB(Image_Selector.getSelectedFile().getAbsolutePath()));
                int result = prestmt.executeUpdate();
                System.out.println("\n Result:" + result);
                if (result != 1) {
                    System.out.println("Something Goes Wrong Please Try Again...");
                    JOptionPane.showMessageDialog(null, "Failed To Update Logo.", "Task Fail", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    new Home(Home.User_Loggedin).setVisible(true);
                }
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + "Config_Page@390\n" + Arrays.toString(ex.getStackTrace()));
            }

        } else {
            try {
                Map<String, String> normal_array = new HashMap<>();
                String sql = "UPDATE \"main\".\"config\" SET \"value\"=? WHERE \"key\"=\"config\"";
                prestmt = DBconnect.getConnect().prepareStatement(sql);

                if (clg_name.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Name.");
                } else {
                    if (Validator.isValidText(clg_name.getText())) {
                        normal_array.put("clg_name", clg_name.getText());
                    } else {
                        normal_array.put("clg_name", "");
                        JOptionPane.showMessageDialog(null, "Please Enter Valid Name.");
                    }
                }

                if (clg_addr.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Address.");
                } else {
                    if (Validator.isValidText(clg_addr.getText())) {
                        normal_array.put("clg_addr", clg_addr.getText());
                    } else {
                        normal_array.put("clg_addr", "");
                        JOptionPane.showMessageDialog(null, "Please Enter Valid Address.");
                    }
                }

                if (clg_DTE_code.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter DTE Code.");
                    normal_array.put("clg_DTE_code", "");
                } else {
//                    if (Validator.isValidText(clg_DTE_code.getText())) {
                    normal_array.put("clg_DTE_code", clg_DTE_code.getText());
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Please Enter Valid DTE Code.");
//                    }
                }

                if (clg_MSBTE_code.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter MSBTE Code.");
                    normal_array.put("clg_MSBTE_code", "");
                } else {
//                    if (Validator.isValidText(clg_MSBTE_code.getText())) {
                    normal_array.put("clg_MSBTE_code", clg_MSBTE_code.getText());
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Please Enter Valid MSBTE Code.");
//                    }
                }

                if (clg_contact.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Contact Number.");
                } else {
                    if (Validator.isValidPhoneNo(clg_contact.getText())) {
                        normal_array.put("clg_contact", clg_contact.getText());
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Enter Valid Contact Number.");
                        normal_array.put("clg_contact", clg_MSBTE_code.getText());
                    }
                }

                JSONArray json_data = new JSONArray();
                json_data.add(normal_array);
                prestmt.setString(1, json_data.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
                int result = prestmt.executeUpdate();
                System.out.println("\n Result:" + result);
                if (result == 1) {
                    System.out.println("Configurations Updated...");
                    JOptionPane.showMessageDialog(null, "Configurations Updated...", "Task Complete", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.out.println("Something Goes Wrong Please Try Again...");
                    JOptionPane.showMessageDialog(null, "Something Is Wrong Please Try Again...", "Task Fail", JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    new Home(Home.User_Loggedin).setVisible(true);
                }
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex + "Config_Page@409\n" + Arrays.toString(ex.getStackTrace()));
            }
        }
    }//GEN-LAST:event_Save_FormActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Fill_ID_Form.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fill_ID_Form.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fill_ID_Form.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fill_ID_Form.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Config_Page().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_Button;
    private javax.swing.JButton Cancel_Form;
    private javax.swing.JButton Clg_Logo_File;
    private javax.swing.JLabel Home_Button;
    private javax.swing.JButton Save_Form;
    private javax.swing.JDesktopPane Show_Img;
    private javax.swing.JTextField clg_DTE_code;
    private javax.swing.JTextField clg_MSBTE_code;
    public javax.swing.JTextArea clg_addr;
    public javax.swing.JTextField clg_contact;
    public javax.swing.JLabel clg_logo;
    public javax.swing.JTextField clg_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
