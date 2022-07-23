package Omtbs;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author richu */

public class AdminLogin extends javax.swing.JFrame {

    /* Creates new form AdminLogin */
    public AdminLogin() {
        initComponents();
        this.HidePasswordIcon.setVisible(false);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminRegisterMailPanel = new javax.swing.JPanel();
        CompanyLogoIcon = new javax.swing.JLabel();
        MultiUserLoginLabel = new javax.swing.JLabel();
        CloseIcon = new javax.swing.JLabel();
        MinimizeIcon = new javax.swing.JLabel();
        MaximizeButtonIcon = new javax.swing.JButton();
        SwitchLabel = new javax.swing.JLabel();
        AdminLoginProfileImg = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        ALUsernameIcon = new javax.swing.JLabel();
        ALUserNameTextField = new javax.swing.JTextField();
        EmailIdLabel = new javax.swing.JLabel();
        ALEmailIdIcon = new javax.swing.JLabel();
        AlEmailIdTextField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        ALPasswordIcon = new javax.swing.JLabel();
        ALPasswordPassField = new javax.swing.JPasswordField();
        ShowPasswordIcon = new javax.swing.JButton();
        HidePasswordIcon = new javax.swing.JButton();
        ALSignInButton = new javax.swing.JButton();
        ALAccountCreationButton = new javax.swing.JButton();
        RoleLabel = new javax.swing.JLabel();
        ALRoleIcon = new javax.swing.JLabel();
        ALAdminChosser = new javax.swing.JComboBox<>();
        AdminLoginBgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Home");
        setLocationByPlatform(true);
        setName("AdminHomeFrame"); // NOI18N
        setUndecorated(true);

        AdminRegisterMailPanel.setBackground(new java.awt.Color(204, 255, 255));
        AdminRegisterMailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CompanyLogoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/lightning _50px.png"))); // NOI18N
        CompanyLogoIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminRegisterMailPanel.add(CompanyLogoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        MultiUserLoginLabel.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        MultiUserLoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        MultiUserLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MultiUserLoginLabel.setText("MULTI USER LOGIN");
        MultiUserLoginLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        AdminRegisterMailPanel.add(MultiUserLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 330, 50));

        CloseIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Cross_50px.png"))); // NOI18N
        CloseIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseIconMouseClicked(evt);
            }
        });
        AdminRegisterMailPanel.add(CloseIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 50, 50));

        MinimizeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MinimizeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Minimize_50px.png"))); // NOI18N
        MinimizeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinimizeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeIconMouseClicked(evt);
            }
        });
        AdminRegisterMailPanel.add(MinimizeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 50, 50));

        MaximizeButtonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Maximize_50px.png"))); // NOI18N
        MaximizeButtonIcon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MaximizeButtonIcon.setBorderPainted(false);
        MaximizeButtonIcon.setContentAreaFilled(false);
        MaximizeButtonIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MaximizeButtonIcon.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Maximize_50px.png"))); // NOI18N
        MaximizeButtonIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaximizeButtonIconMouseClicked(evt);
            }
        });
        AdminRegisterMailPanel.add(MaximizeButtonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 50, 50));

        SwitchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/switches_50px.png"))); // NOI18N
        SwitchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SwitchLabelMouseClicked(evt);
            }
        });
        AdminRegisterMailPanel.add(SwitchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, 50));

        AdminLoginProfileImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Administrator_180px.png"))); // NOI18N
        AdminRegisterMailPanel.add(AdminLoginProfileImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 190, 170));

        UserNameLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        UserNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserNameLabel.setText("USER NAME:");
        AdminRegisterMailPanel.add(UserNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 140, -1));

        ALUsernameIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ALUsernameIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Contact_50px.png"))); // NOI18N
        ALUsernameIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AdminRegisterMailPanel.add(ALUsernameIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 40, 50));

        ALUserNameTextField.setBackground(new java.awt.Color(204, 204, 204));
        ALUserNameTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        ALUserNameTextField.setToolTipText("Email Id");
        ALUserNameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        AdminRegisterMailPanel.add(ALUserNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 320, 40));

        EmailIdLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        EmailIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailIdLabel.setText("EMAIL ID:");
        AdminRegisterMailPanel.add(EmailIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 100, -1));

        ALEmailIdIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ALEmailIdIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Gmail_50px.png"))); // NOI18N
        ALEmailIdIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AdminRegisterMailPanel.add(ALEmailIdIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 50, 40));

        AlEmailIdTextField.setBackground(new java.awt.Color(204, 204, 204));
        AlEmailIdTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        AlEmailIdTextField.setToolTipText("Email Id");
        AlEmailIdTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        AdminRegisterMailPanel.add(AlEmailIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 340, 40));

        PasswordLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("PASSWORD:");
        AdminRegisterMailPanel.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 110, -1));

        ALPasswordIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ALPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/key_50px.png"))); // NOI18N
        ALPasswordIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AdminRegisterMailPanel.add(ALPasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 50, 50));

        ALPasswordPassField.setBackground(new java.awt.Color(204, 204, 204));
        ALPasswordPassField.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        ALPasswordPassField.setToolTipText("Password must contain at least 8 characters with (Captial letters, Small letters, Numbers, Special Charcters @ ! # $ % & * - + )");
        ALPasswordPassField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        AdminRegisterMailPanel.add(ALPasswordPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 320, 40));

        ShowPasswordIcon.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ShowPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Eye_40px.png"))); // NOI18N
        ShowPasswordIcon.setToolTipText("Show Password");
        ShowPasswordIcon.setBorder(null);
        ShowPasswordIcon.setBorderPainted(false);
        ShowPasswordIcon.setContentAreaFilled(false);
        ShowPasswordIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowPasswordIcon.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Eye_40px.png"))); // NOI18N
        ShowPasswordIcon.setSelected(true);
        ShowPasswordIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ShowPasswordIconMousePressed(evt);
            }
        });
        AdminRegisterMailPanel.add(ShowPasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 40, 40));

        HidePasswordIcon.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        HidePasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Seen_40px.png"))); // NOI18N
        HidePasswordIcon.setToolTipText("Hide Password");
        HidePasswordIcon.setBorder(null);
        HidePasswordIcon.setBorderPainted(false);
        HidePasswordIcon.setContentAreaFilled(false);
        HidePasswordIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HidePasswordIcon.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Seen_40px.png"))); // NOI18N
        HidePasswordIcon.setSelected(true);
        HidePasswordIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HidePasswordIconMousePressed(evt);
            }
        });
        AdminRegisterMailPanel.add(HidePasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 40, -1));

        ALSignInButton.setBackground(new java.awt.Color(153, 255, 51));
        ALSignInButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        ALSignInButton.setText("Sign In");
        ALSignInButton.setBorder(null);
        ALSignInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ALSignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALSignInButtonActionPerformed(evt);
            }
        });
        AdminRegisterMailPanel.add(ALSignInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 700, 230, 50));

        ALAccountCreationButton.setBackground(new java.awt.Color(153, 255, 51));
        ALAccountCreationButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        ALAccountCreationButton.setText("Create Account");
        ALAccountCreationButton.setBorder(null);
        ALAccountCreationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ALAccountCreationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALAccountCreationButtonActionPerformed(evt);
            }
        });
        AdminRegisterMailPanel.add(ALAccountCreationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 700, 220, 50));

        RoleLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        RoleLabel.setForeground(new java.awt.Color(255, 255, 255));
        RoleLabel.setText("ROLE:");
        AdminRegisterMailPanel.add(RoleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 90, 30));

        ALRoleIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ALRoleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/fist_50px.png"))); // NOI18N
        ALRoleIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AdminRegisterMailPanel.add(ALRoleIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 40, 50));

        ALAdminChosser.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        ALAdminChosser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Super Admin" }));
        ALAdminChosser.setToolTipText("");
        ALAdminChosser.setBorder(null);
        AdminRegisterMailPanel.add(ALAdminChosser, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 200, 40));

        AdminLoginBgImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/jonas-denil_990px.jpg"))); // NOI18N
        AdminRegisterMailPanel.add(AdminLoginBgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminRegisterMailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminRegisterMailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(989, 830));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ALSignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALSignInButtonActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        String uname = ALUserNameTextField.getText();
        String uemail = AlEmailIdTextField.getText();
        String upass = String.valueOf(ALPasswordPassField.getPassword());
        String urole = ALAdminChosser.getSelectedItem().toString();
        String approve = "APPROVED";
        String ASLoginquery ="SELECT * FROM `admin` WHERE `ADMIN_NAME` = ? AND `ADMIN_EMAIL_ID` = ? AND `ADMIN_PASSWORD` = ? AND `ROLE` = ? AND `APPROVAL` = ?";
        try{
            ps = MyConnection.getConnection().prepareStatement(ASLoginquery);
            ps.setString(1, uname);
            ps.setString(2, uemail);
            ps.setString(3, upass);
            ps.setString(4, urole);
            ps.setString(5, approve);
            rs = ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Admin Login Successfully" , "Admin Login", JOptionPane.INFORMATION_MESSAGE);
                switch (ALAdminChosser.getSelectedIndex()) {
                    case 0:
                        AdminHome ah = new AdminHome();
                        ah.setVisible(true);
                        ah.pack();
                        ah.setLocationRelativeTo(null);
                        ah.setExtendedState(JFrame.EXIT_ON_CLOSE);
                        ah.AdminHomeUserLabel.setText(uname);
                        this.dispose();
                        break;
                    case 1:
                        SuperAdminHome sah = new SuperAdminHome();
                        sah.setVisible(true);
                        sah.pack();
                        sah.setLocationRelativeTo(null);
                        sah.setExtendedState(JFrame.EXIT_ON_CLOSE);
                        sah.WelcomeUserLabel.setText(uname);
                        this.dispose();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Admin Login Failed" , "Admin Login Error", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"INVALID USERNAME OR PASSWORD" , "INVAILD LOGIN", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"MAY BE NOT VERIFY BY THE SERVICE PROVIDERS" , "INVAILD LOGIN", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        catch(SQLException ex){
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Admin Login Connection, Error Occuring!" , "Admin Login Error Message", JOptionPane.INFORMATION_MESSAGE);
        }
       
    }//GEN-LAST:event_ALSignInButtonActionPerformed

    private void MinimizeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeIconMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeIconMouseClicked

    private void ShowPasswordIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowPasswordIconMousePressed
        HidePasswordIcon.setVisible(true);
        ShowPasswordIcon.setVisible(false);
        ALPasswordPassField.setEchoChar((char)0);
    }//GEN-LAST:event_ShowPasswordIconMousePressed

    private void HidePasswordIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HidePasswordIconMousePressed
        ShowPasswordIcon.setVisible(true);
        HidePasswordIcon.setVisible(false);
        ALPasswordPassField.setEchoChar('*');
    }//GEN-LAST:event_HidePasswordIconMousePressed

    private void ALAccountCreationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALAccountCreationButtonActionPerformed
       AdminRegisterMail arm = new AdminRegisterMail();
       arm.setVisible(true);
       arm.pack();
       arm.setLocationRelativeTo(null);
       arm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_ALAccountCreationButtonActionPerformed

    private void CloseIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseIconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseIconMouseClicked

    private void SwitchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SwitchLabelMouseClicked
       Login slog = new Login();
       slog.setVisible(true);
       slog.pack();
       slog.setLocationRelativeTo(null);
       slog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_SwitchLabelMouseClicked

    private void MaximizeButtonIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizeButtonIconMouseClicked
        if(this.getExtendedState()!= Login.MAXIMIZED_BOTH){
            this.setExtendedState(Login.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(Login.NORMAL);
        }
    }//GEN-LAST:event_MaximizeButtonIconMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALAccountCreationButton;
    private javax.swing.JComboBox<String> ALAdminChosser;
    private javax.swing.JLabel ALEmailIdIcon;
    private javax.swing.JLabel ALPasswordIcon;
    private javax.swing.JPasswordField ALPasswordPassField;
    private javax.swing.JLabel ALRoleIcon;
    private javax.swing.JButton ALSignInButton;
    private javax.swing.JTextField ALUserNameTextField;
    private javax.swing.JLabel ALUsernameIcon;
    private javax.swing.JLabel AdminLoginBgImg;
    private javax.swing.JLabel AdminLoginProfileImg;
    private javax.swing.JPanel AdminRegisterMailPanel;
    private javax.swing.JTextField AlEmailIdTextField;
    private javax.swing.JLabel CloseIcon;
    private javax.swing.JLabel CompanyLogoIcon;
    private javax.swing.JLabel EmailIdLabel;
    private javax.swing.JButton HidePasswordIcon;
    private javax.swing.JButton MaximizeButtonIcon;
    private javax.swing.JLabel MinimizeIcon;
    private javax.swing.JLabel MultiUserLoginLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JButton ShowPasswordIcon;
    private javax.swing.JLabel SwitchLabel;
    private javax.swing.JLabel UserNameLabel;
    // End of variables declaration//GEN-END:variables
}
