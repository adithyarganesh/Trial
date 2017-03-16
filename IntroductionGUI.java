/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Adithya
 */
public class IntroductionGUI extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;

    /**
     * Creates new form IntroductionGUI
     */
    public IntroductionGUI() {
        initComponents();
        try {
            Class.forName("java.sql.DriverManager");
            con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");
            st = con.createStatement();
            String sql = "DELETE FROM CART;";
            int i = st.executeUpdate(sql);
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Cart cleared");
            } else if (i < 0) {
                JOptionPane.showMessageDialog(this, "Error Cart not cleared");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ContinueLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cov.JPG"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 670, 420));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/xxzz.JPG"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 670, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clothing.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 550, 170));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bbbbb.JPG"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 670, 650));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/banner-online.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -10, 710, 140));

        ContinueLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aaa.JPG"))); // NOI18N
        ContinueLabel.setText("jLabel5");
        ContinueLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContinueLabelMouseClicked(evt);
            }
        });
        jPanel1.add(ContinueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 810, 860, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueLabelMouseClicked
        // TODO add your handling code here:
        new ShoppingGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ContinueLabelMouseClicked

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
            java.util.logging.Logger.getLogger(IntroductionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroductionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroductionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroductionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new IntroductionGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContinueLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
