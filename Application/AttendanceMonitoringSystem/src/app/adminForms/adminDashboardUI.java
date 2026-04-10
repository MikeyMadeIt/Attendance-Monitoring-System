package app.adminForms;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;

public class adminDashboardUI extends javax.swing.JFrame {
     
     private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(adminDashboardUI.class.getName());

     public adminDashboardUI() {
          initComponents();
          DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");

          DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

          Timer timer = new Timer(1000, e -> {
          LocalDateTime now = LocalDateTime.now();

          lblTime.setText(now.format(timeFormat)); 
          lblDate.setText(now.format(dateFormat)); 
});

timer.start();
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          lblTime = new javax.swing.JLabel();
          lblDate = new javax.swing.JLabel();
          jLabel1 = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setMaximumSize(new java.awt.Dimension(900, 545));
          setMinimumSize(new java.awt.Dimension(900, 545));
          setUndecorated(true);

          jPanel1.setMaximumSize(new java.awt.Dimension(900, 545));
          jPanel1.setMinimumSize(new java.awt.Dimension(900, 545));
          jPanel1.setPreferredSize(new java.awt.Dimension(900, 545));
          jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

          lblTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
          lblTime.setForeground(new java.awt.Color(255, 255, 255));
          jPanel1.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 150, 30));

          lblDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
          lblDate.setForeground(new java.awt.Color(255, 255, 255));
          jPanel1.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 160, 30));

          jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/images/adminDashboardBG.png"))); // NOI18N
          jLabel1.setMaximumSize(new java.awt.Dimension(900, 545));
          jLabel1.setMinimumSize(new java.awt.Dimension(900, 545));
          jLabel1.setPreferredSize(new java.awt.Dimension(900, 545));
          jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 545));

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
          );

          pack();
          setLocationRelativeTo(null);
     }// </editor-fold>//GEN-END:initComponents

     public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(() -> new adminDashboardUI().setVisible(true));
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JLabel jLabel1;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JLabel lblDate;
     private javax.swing.JLabel lblTime;
     // End of variables declaration//GEN-END:variables
}
