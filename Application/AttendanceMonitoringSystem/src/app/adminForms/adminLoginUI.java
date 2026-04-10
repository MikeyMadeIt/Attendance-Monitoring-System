package app.adminForms;
import app.database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class adminLoginUI extends javax.swing.JFrame {
     
     private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(adminLoginUI.class.getName());

     public adminLoginUI() {
          initComponents();
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          BtnExit = new javax.swing.JButton();
          jLabel2 = new javax.swing.JLabel();
          txtUsername = new javax.swing.JTextField();
          jButton1 = new javax.swing.JButton();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          txtPassword = new javax.swing.JPasswordField();
          jLabel1 = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setUndecorated(true);

          jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          BtnExit.setBackground(new java.awt.Color(204, 204, 204));
          BtnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
          BtnExit.setText("X");
          BtnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
          BtnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
          BtnExit.setMaximumSize(new java.awt.Dimension(30, 30));
          BtnExit.setMinimumSize(new java.awt.Dimension(30, 30));
          BtnExit.setPreferredSize(new java.awt.Dimension(30, 30));
          BtnExit.addActionListener(this::BtnExitActionPerformed);
          jPanel1.add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

          jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/adminLoginHeader.png"))); // NOI18N
          jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
          jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

          txtUsername.setBackground(java.awt.SystemColor.controlShadow);
          txtUsername.addActionListener(this::txtUsernameActionPerformed);
          jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 300, 40));

          jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
          jButton1.setText("LOGIN");
          jButton1.addActionListener(this::jButton1ActionPerformed);
          jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 300, 40));

          jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
          jLabel3.setForeground(new java.awt.Color(255, 255, 255));
          jLabel3.setText("Username or ID Number:");
          jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, -1));

          jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
          jLabel4.setForeground(new java.awt.Color(255, 255, 255));
          jLabel4.setText("Password:");
          jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 140, -1));

          txtPassword.setBackground(new java.awt.Color(204, 204, 204));
          txtPassword.addActionListener(this::txtPasswordActionPerformed);
          jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 300, 40));

          jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/loginBG.png"))); // NOI18N
          jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );

          pack();
          setLocationRelativeTo(null);
     }// </editor-fold>//GEN-END:initComponents

     private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
          System.exit(0);
     }//GEN-LAST:event_BtnExitActionPerformed

     private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_txtUsernameActionPerformed

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String username = txtUsername.getText();
          String password = new String(txtPassword.getPassword());

          if(username.isEmpty() || password.isEmpty()) {
               JOptionPane.showMessageDialog(this, "Please fill in all fields!");
               return;
          }

          try {
               Connection con = DBConnection.getConnection();

               String sql = "SELECT * FROM users WHERE username=? AND password=?";
               PreparedStatement pst = con.prepareStatement(sql);

               pst.setString(1, username);
               pst.setString(2, password);

               ResultSet rs = pst.executeQuery();

               if(rs.next()) {
               JOptionPane.showMessageDialog(this, "Login Successful!");

               app.adminForms.adminDashboardUI admin = new app.adminForms.adminDashboardUI();
               admin.setVisible(true);
               this.dispose();

          } else {
               JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
          }

          con.close();

          } catch (Exception e) {
               JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
          }

     }//GEN-LAST:event_jButton1ActionPerformed

     private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_txtPasswordActionPerformed

     public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(() -> new adminLoginUI().setVisible(true));
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton BtnExit;
     private javax.swing.JButton jButton1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPasswordField txtPassword;
     private javax.swing.JTextField txtUsername;
     // End of variables declaration//GEN-END:variables
}
