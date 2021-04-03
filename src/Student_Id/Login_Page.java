package Student_Id;
import Required.DBconnect;
import java.sql.*;
import java.util.*;
import javax.swing.*;
/*
 * @author Vinu_Gawade
 */
public class Login_Page extends javax.swing.JFrame {
    public static ResultSet rs;
    public static PreparedStatement prestmt;
    public static Connection conn;
    public Login_Page() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Img/desktop_logo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login_Icon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Login_Form = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        Login_Button = new javax.swing.JButton();
        Iusername = new javax.swing.JTextField();
        Ipassword = new javax.swing.JPasswordField();
        Heading_Login_Page = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login_Logo.png"))); // NOI18N

        Login_Form.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        username.setText("Username:");

        password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        password.setText("Password:");

        Login_Button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Login_Button.setText("Login");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        Iusername.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Iusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IusernameActionPerformed(evt);
            }
        });

        Ipassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Ipassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Login_FormLayout = new javax.swing.GroupLayout(Login_Form);
        Login_Form.setLayout(Login_FormLayout);
        Login_FormLayout.setHorizontalGroup(
            Login_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_FormLayout.createSequentialGroup()
                .addGroup(Login_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Login_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Ipassword, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Login_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Login_FormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Login_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username)
                                    .addComponent(password)))
                            .addGroup(Login_FormLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Iusername, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Login_FormLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(Login_Button)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        Login_FormLayout.setVerticalGroup(
            Login_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_FormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Iusername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ipassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Login_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Login_IconLayout = new javax.swing.GroupLayout(Login_Icon);
        Login_Icon.setLayout(Login_IconLayout);
        Login_IconLayout.setHorizontalGroup(
            Login_IconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_IconLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Login_Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Login_IconLayout.setVerticalGroup(
            Login_IconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(Login_IconLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Login_Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Heading_Login_Page.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Heading_Login_Page.setText("Admin Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Login_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(Heading_Login_Page)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Heading_Login_Page)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Login_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
   
    private void IpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpasswordActionPerformed
    }//GEN-LAST:event_IpasswordActionPerformed

    private void IusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IusernameActionPerformed
    }//GEN-LAST:event_IusernameActionPerformed

    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed
        try {
            prestmt = DBconnect.getConnect().prepareStatement("SELECT * FROM Admin WHERE username='"+ Iusername.getText() +"' AND password='"+ Ipassword.getText() +"'");
            rs = prestmt.executeQuery();
            
            if(rs.next()){
                       this.setVisible(false);
                       new Home(rs.getString("username")).setVisible(true);
            }else{
            System.out.println("Username/Password is Invalid.");
            JOptionPane.showMessageDialog(null, "Invalid Login Credential...", "Task Viewer", JOptionPane.INFORMATION_MESSAGE);

            }
             rs.close();
        } catch (SQLException e) {
            System.out.println(e+"Login_Page@178"+Arrays.toString(e.getStackTrace()));
        }
                
    }//GEN-LAST:event_Login_ButtonActionPerformed
 
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login_Page().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading_Login_Page;
    public javax.swing.JPasswordField Ipassword;
    public javax.swing.JTextField Iusername;
    private javax.swing.JButton Login_Button;
    private javax.swing.JPanel Login_Form;
    private javax.swing.JPanel Login_Icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel password;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
