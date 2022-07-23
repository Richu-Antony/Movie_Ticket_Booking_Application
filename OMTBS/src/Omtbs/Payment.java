/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Omtbs;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author richu
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaymentMainPanel = new javax.swing.JPanel();
        GoBackLabel = new javax.swing.JLabel();
        PayUpiLabel = new javax.swing.JLabel();
        PayuserLabel = new javax.swing.JLabel();
        PayMobileLabel = new javax.swing.JLabel();
        PinLabel = new javax.swing.JLabel();
        PayLabel = new javax.swing.JLabel();
        PayPinTextField = new javax.swing.JTextField();
        PayUserTextField = new javax.swing.JTextField();
        PayTextField = new javax.swing.JTextField();
        PayUpiTextField = new javax.swing.JTextField();
        PayMobileTextField = new javax.swing.JTextField();
        PayButton = new javax.swing.JButton();
        PayBgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment Gateway");
        setLocationByPlatform(true);
        setName("PaymentGateway"); // NOI18N
        setUndecorated(true);

        PaymentMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        PaymentMainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GoBackLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        GoBackLabel.setForeground(new java.awt.Color(255, 255, 255));
        GoBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Previous_50px.png"))); // NOI18N
        GoBackLabel.setText("GO BACK");
        GoBackLabel.setEnabled(false);
        GoBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackLabelMouseClicked(evt);
            }
        });
        PaymentMainPanel.add(GoBackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, -1));

        PayUpiLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PayUpiLabel.setForeground(new java.awt.Color(255, 255, 255));
        PayUpiLabel.setText("UPI ID / Debit card number:");
        PaymentMainPanel.add(PayUpiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 240, 40));

        PayuserLabel.setBackground(new java.awt.Color(255, 255, 255));
        PayuserLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PayuserLabel.setForeground(new java.awt.Color(255, 255, 255));
        PayuserLabel.setText("User Name:");
        PaymentMainPanel.add(PayuserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 110, 40));

        PayMobileLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PayMobileLabel.setForeground(new java.awt.Color(255, 255, 255));
        PayMobileLabel.setText("MOBILE NO:");
        PaymentMainPanel.add(PayMobileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 100, 40));

        PinLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PinLabel.setForeground(new java.awt.Color(255, 255, 255));
        PinLabel.setText("PIN:");
        PaymentMainPanel.add(PinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 40, 40));

        PayLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PayLabel.setForeground(new java.awt.Color(255, 255, 255));
        PayLabel.setText("PAYMENT AMOUNT");
        PaymentMainPanel.add(PayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 180, 40));

        PayPinTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PaymentMainPanel.add(PayPinTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 340, 40));

        PayUserTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PaymentMainPanel.add(PayUserTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 360, 40));

        PayTextField.setEditable(false);
        PayTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PaymentMainPanel.add(PayTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 360, 40));

        PayUpiTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PaymentMainPanel.add(PayUpiTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 360, 40));

        PayMobileTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PaymentMainPanel.add(PayMobileTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 360, 40));

        PayButton.setBackground(new java.awt.Color(102, 255, 0));
        PayButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PayButton.setText("PAY");
        PayButton.setBorderPainted(false);
        PayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButtonActionPerformed(evt);
            }
        });
        PaymentMainPanel.add(PayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, 430, 50));

        PayBgImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/PayMoney_950px.jpg"))); // NOI18N
        PaymentMainPanel.add(PayBgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaymentMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaymentMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(951, 751));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackLabelMouseClicked
        //this.dispose();
    }//GEN-LAST:event_GoBackLabelMouseClicked

    private void PayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButtonActionPerformed
        String PayUsern = PayUserTextField.getText();
        String PayUpii = PayUpiTextField.getText();
        String PayMobilen = PayMobileTextField.getText();
        String PayPay = PayTextField.getText();
        String PayPinU = PayPinTextField.getText();
        
        if(PayUsern.equals("")){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Please Enter User Name" , "PAYMENT GATEWAY", JOptionPane.WARNING_MESSAGE);
        }
        else if(PayUpii.equals("")){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Please Enter UPI ID or Debit Card No." , "PAYMENT GATEWAY", JOptionPane.WARNING_MESSAGE);
        }
        else if(PayMobilen.equals("")){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Please Enter Mobile No." , "PAYMENT GATEWAY", JOptionPane.WARNING_MESSAGE);
        }
        else if(PayPay.equals("")){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Payment Amount Not Found!" , "PAYMENT GATEWAY", JOptionPane.WARNING_MESSAGE);
        }
        else if(PayPinU.equals("")){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Please Enter A Valid PIN ?" , "PAYMENT GATEWAY", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"PAYMENT SUCCESSFULLY" , "PAYMENT GATEWAY", JOptionPane.INFORMATION_MESSAGE);
            BookConfirm nbc = new BookConfirm();
            //nbc.setVisible(true); 
            //nbc.pack(); 
           // nbc.setLocationRelativeTo(null); 
           // nbc.setExtendedState(JFrame.EXIT_ON_CLOSE);
            nbc.BCPayConfirmLabel.setText("PAYED");
            this.dispose();
        }
    }//GEN-LAST:event_PayButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GoBackLabel;
    private javax.swing.JLabel PayBgImg;
    private javax.swing.JButton PayButton;
    private javax.swing.JLabel PayLabel;
    private javax.swing.JLabel PayMobileLabel;
    private javax.swing.JTextField PayMobileTextField;
    private javax.swing.JTextField PayPinTextField;
    public javax.swing.JTextField PayTextField;
    private javax.swing.JLabel PayUpiLabel;
    private javax.swing.JTextField PayUpiTextField;
    private javax.swing.JTextField PayUserTextField;
    private javax.swing.JPanel PaymentMainPanel;
    private javax.swing.JLabel PayuserLabel;
    private javax.swing.JLabel PinLabel;
    // End of variables declaration//GEN-END:variables
}
