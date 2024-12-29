
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ABC TRADERS
 */
/*public class Login implements user
{       private String userpass="Sabeen@2769";
        private String name="Hospital";

    /**
     *
     * @param password
     */
   /* public void login(String username,String password){
    if((password==userpass)&& (username==name))
        {  
              HomePage home=new HomePage();
               home.setVisible(true);
        }
        else{
               JOptionPane.showMessageDialog(null,"Wrong");

        }
    }*/
import java.util.ArrayList;

class Login1 extends javax.swing.JFrame implements user{

  


    /**
     * Creates new form Login
     */
    public Login1() {
        initComponents();
       
    }
        Login logi=new Login();
  public void login(String username,String password){
         if(username.equals(logi.getAdminname())&&password.equals(logi.getAdminpass())){
             this.setVisible(false);
             HomePage admin=new HomePage();
             admin.setVisible(true);
         }
                 
       //for(int i=0;i<alldoctors.size();i++){
         if(username.equals(logi.getDocname())&&password.equals(logi.getDocpass())){
             this.setVisible(false);
            Patients read=new Patients();
             read.setVisible(true);
             
         }
      // }
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        poweroff = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("UserName:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        poweroff.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        poweroff.setText("Poweroff");
        poweroff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poweroffActionPerformed(evt);
            }
        });
        getContentPane().add(poweroff, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 130, 30));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 160, 30));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 160, 30));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login 2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-390, -10, -1, 390));

        setSize(new java.awt.Dimension(1013, 453));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       // for(int i=0;i<3;i++){
           login(username.getText(), password.getText());
        //   logi.count++;
           
       // }
    //    if(logi.count==3){
      //   throw new IllegalArgumentException("Password attempts exceeded.");
 
      //  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
       
    }//GEN-LAST:event_usernameActionPerformed

    private void poweroffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poweroffActionPerformed

        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_poweroffActionPerformed

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton poweroff;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

   
}
