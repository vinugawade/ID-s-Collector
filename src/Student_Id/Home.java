package Student_Id;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*
 * @author Vinu_Gawade
 */
public class Home extends javax.swing.JFrame {

    public static String User_Loggedin;

    public Home(String User_Loggedin) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Img/desktop_logo.png")).getImage());
        Home.User_Loggedin = User_Loggedin;
        Head_Home.setText(Head_Home.getText() + User_Loggedin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Head_Home = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        View_ID = new javax.swing.JButton();
        Form_Fill1 = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        Home_Button = new javax.swing.JLabel();
        Config_Page = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(255, 255, 255));

        Head_Home.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Head_Home.setText("Welcome , ");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        View_ID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        View_ID.setText("New ID");
        View_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_IDActionPerformed(evt);
            }
        });

        Form_Fill1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Form_Fill1.setText("View ID's");
        Form_Fill1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_Fill1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(View_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(Form_Fill1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(View_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Form_Fill1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        user.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        Home_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home.png"))); // NOI18N
        Home_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_ButtonMouseClicked(evt);
            }
        });

        Config_Page.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Config_Page.setText("Config");
        Config_Page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Config_PageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Home_Button)
                        .addGap(42, 42, 42)
                        .addComponent(Head_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40)
                        .addComponent(Config_Page, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Head_Home)
                            .addComponent(user)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Config_Page)
                            .addComponent(Home_Button))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void SetHeading(String User_Loggedin) {
        System.out.println("Login By " + Head_Home.getText() + User_Loggedin);
        Head_Home.setText(Head_Home.getText() + User_Loggedin);
    }
    private void View_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_IDActionPerformed
        this.setVisible(false);
        new Fill_ID_Form().setVisible(true);

    }//GEN-LAST:event_View_IDActionPerformed

    private void Form_Fill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_Fill1ActionPerformed

        if (View_Form.checkDB() == true) {
            System.out.println("Nothing Exist in Database...");
            JOptionPane.showMessageDialog(null, "Nothing Exist in Database...", "Task Fail", JOptionPane.INFORMATION_MESSAGE);
        } else {
            this.setVisible(false);
            new View_Form().setVisible(true);
        }
    }//GEN-LAST:event_Form_Fill1ActionPerformed

    private void Home_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_ButtonMouseClicked
        this.setVisible(false);
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_Home_ButtonMouseClicked

    private void Config_PageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Config_PageActionPerformed
        this.setVisible(false);
        new Config_Page().setVisible(true);
    }//GEN-LAST:event_Config_PageActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home("").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Config_Page;
    public javax.swing.JButton Form_Fill1;
    public javax.swing.JLabel Head_Home;
    private javax.swing.JLabel Home_Button;
    public javax.swing.JButton View_ID;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
