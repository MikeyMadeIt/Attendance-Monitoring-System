package app;
import app.adminForms.adminLoginUI;
import app.userForms.userLoginUI;

public class LoginUI extends javax.swing.JFrame {
     
     private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginUI.class.getName());

     public LoginUI() {
          initComponents();
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          btnAdmin = new javax.swing.JButton();
          btnAdmin1 = new javax.swing.JButton();
          BtnExit = new javax.swing.JButton();
          jLabel1 = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setUndecorated(true);

          jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/adminButtonBG.png"))); // NOI18N
          btnAdmin.addActionListener(this::btnAdminActionPerformed);
          jPanel1.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 230, 70));

          btnAdmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/userButtonBG.png"))); // NOI18N
          btnAdmin1.addActionListener(this::btnAdmin1ActionPerformed);
          jPanel1.add(btnAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 230, 70));

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

          jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/loginBG.png"))); // NOI18N
          jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );

          pack();
          setLocationRelativeTo(null);
     }// </editor-fold>//GEN-END:initComponents

     private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
          adminLoginUI admin = new adminLoginUI();
          admin.setVisible(true);
          this.dispose();
     }//GEN-LAST:event_btnAdminActionPerformed

     private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
          System.exit(0);
     }//GEN-LAST:event_BtnExitActionPerformed

     private void btnAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmin1ActionPerformed
          userLoginUI user = new userLoginUI();
          user.setVisible(true);
          this.dispose();
     }//GEN-LAST:event_btnAdmin1ActionPerformed

     public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(() -> new LoginUI().setVisible(true));
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton BtnExit;
     private javax.swing.JButton btnAdmin;
     private javax.swing.JButton btnAdmin1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JPanel jPanel1;
     // End of variables declaration//GEN-END:variables
}
