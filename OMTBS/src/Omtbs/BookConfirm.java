package Omtbs;

import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/* @author richu */

public class BookConfirm extends javax.swing.JFrame {

    /* Creates new form BookConfirm */
    public BookConfirm() {
        initComponents();
        JOptionPane.showMessageDialog(null,"Please Refresh The Page If Necessary", "Refresh Window", JOptionPane.INFORMATION_MESSAGE);
        booking_table();
        int serialno = generateOSerialNo();
        int newserialno = generatenewSerialNo();
        BCSerialNoTextField.setText(BCSerialNoTextField.getText() + "RA_OMTBS: " + serialno + "TR" + newserialno);
        bill();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BookConfirmPanel = new javax.swing.JPanel();
        CompanyLogo = new javax.swing.JLabel();
        CloseButton = new javax.swing.JLabel();
        MinimizeButton = new javax.swing.JLabel();
        MaximizeButton = new javax.swing.JLabel();
        RefreshButton = new javax.swing.JButton();
        TotalPriceLabel = new javax.swing.JLabel();
        TotalPriceTextField = new javax.swing.JTextField();
        PaymentAmountLabel = new javax.swing.JLabel();
        PaymentAmountTextField = new javax.swing.JTextField();
        BuyTicketButton = new javax.swing.JButton();
        BookingCancelButton = new javax.swing.JButton();
        UserCLabel = new javax.swing.JLabel();
        UserCTextField = new javax.swing.JTextField();
        PrintLabel = new javax.swing.JLabel();
        PrintButton = new javax.swing.JButton();
        RecipetTextAreaScrollPane = new javax.swing.JScrollPane();
        RecipetTextArea = new javax.swing.JTextArea();
        UserBookedScrollPane = new javax.swing.JScrollPane();
        UserBookedTable = new javax.swing.JTable();
        BCSerialNoTextField = new javax.swing.JTextField();
        BCPayConfirmLabel = new javax.swing.JLabel();
        BgBookConfirmImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Confirm");
        setLocationByPlatform(true);
        setName("BookConfirmFrame"); // NOI18N
        setUndecorated(true);

        BookConfirmPanel.setBackground(new java.awt.Color(255, 255, 204));
        BookConfirmPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CompanyLogo.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        CompanyLogo.setForeground(new java.awt.Color(255, 255, 255));
        CompanyLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/lightning _50px.png"))); // NOI18N
        CompanyLogo.setText("BOOKING CONFIRMATION");
        CompanyLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        BookConfirmPanel.add(CompanyLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 50));

        CloseButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Cross_50px.png"))); // NOI18N
        CloseButton.setText("4");
        CloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
        });
        BookConfirmPanel.add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 10, 50, 50));

        MinimizeButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        MinimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Minimize_50px.png"))); // NOI18N
        MinimizeButton.setText("4");
        MinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseClicked(evt);
            }
        });
        BookConfirmPanel.add(MinimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, 50, 50));

        MaximizeButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        MaximizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Maximize_50px.png"))); // NOI18N
        MaximizeButton.setText("4");
        MaximizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaximizeButtonMouseClicked(evt);
            }
        });
        BookConfirmPanel.add(MaximizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 50, 50));

        RefreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Reload_50px.png"))); // NOI18N
        RefreshButton.setToolTipText("Refresh");
        RefreshButton.setBorder(null);
        RefreshButton.setBorderPainted(false);
        RefreshButton.setContentAreaFilled(false);
        RefreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RefreshButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Reload_50px.png"))); // NOI18N
        RefreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshButtonMouseClicked(evt);
            }
        });
        BookConfirmPanel.add(RefreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 50, 50));

        TotalPriceLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        TotalPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        TotalPriceLabel.setText("TOTAL PRICE:");
        BookConfirmPanel.add(TotalPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, 30));

        TotalPriceTextField.setEditable(false);
        TotalPriceTextField.setBackground(new java.awt.Color(204, 204, 204));
        TotalPriceTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        TotalPriceTextField.setForeground(new java.awt.Color(51, 51, 51));
        TotalPriceTextField.setToolTipText("");
        TotalPriceTextField.setAutoscrolls(false);
        TotalPriceTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        TotalPriceTextField.setMargin(new java.awt.Insets(4, 4, 4, 4));
        BookConfirmPanel.add(TotalPriceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 140, 40));

        PaymentAmountLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PaymentAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        PaymentAmountLabel.setText("PAYMENT AMOUNT:");
        BookConfirmPanel.add(PaymentAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 180, 30));

        PaymentAmountTextField.setEditable(false);
        PaymentAmountTextField.setBackground(new java.awt.Color(204, 204, 204));
        PaymentAmountTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PaymentAmountTextField.setForeground(new java.awt.Color(51, 51, 51));
        PaymentAmountTextField.setToolTipText("");
        PaymentAmountTextField.setAutoscrolls(false);
        PaymentAmountTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        PaymentAmountTextField.setMargin(new java.awt.Insets(4, 4, 4, 4));
        BookConfirmPanel.add(PaymentAmountTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 160, 40));

        BuyTicketButton.setBackground(new java.awt.Color(102, 255, 102));
        BuyTicketButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        BuyTicketButton.setText("Buy Ticket");
        BuyTicketButton.setBorder(null);
        BuyTicketButton.setBorderPainted(false);
        BuyTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyTicketButtonActionPerformed(evt);
            }
        });
        BookConfirmPanel.add(BuyTicketButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, 260, 50));

        BookingCancelButton.setBackground(new java.awt.Color(255, 51, 51));
        BookingCancelButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        BookingCancelButton.setForeground(new java.awt.Color(255, 255, 255));
        BookingCancelButton.setText("Cancel Booking");
        BookingCancelButton.setBorder(null);
        BookingCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingCancelButtonActionPerformed(evt);
            }
        });
        BookConfirmPanel.add(BookingCancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 720, 210, 50));

        UserCLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        UserCLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserCLabel.setText("USER:");
        BookConfirmPanel.add(UserCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 130, 30));

        UserCTextField.setEditable(false);
        UserCTextField.setBackground(new java.awt.Color(204, 204, 204));
        UserCTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        UserCTextField.setForeground(new java.awt.Color(51, 51, 51));
        UserCTextField.setToolTipText("");
        UserCTextField.setAutoscrolls(false);
        UserCTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        UserCTextField.setMargin(new java.awt.Insets(4, 4, 4, 4));
        BookConfirmPanel.add(UserCTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 310, 40));

        PrintLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PrintLabel.setForeground(new java.awt.Color(255, 255, 255));
        PrintLabel.setText("PREVIEW:");
        BookConfirmPanel.add(PrintLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 90, 50));

        PrintButton.setBackground(new java.awt.Color(0, 0, 255));
        PrintButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        PrintButton.setForeground(new java.awt.Color(255, 255, 255));
        PrintButton.setText("Print");
        PrintButton.setBorder(null);
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });
        BookConfirmPanel.add(PrintButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 110, 180, 50));

        RecipetTextArea.setEditable(false);
        RecipetTextArea.setColumns(20);
        RecipetTextArea.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        RecipetTextArea.setRows(8);
        RecipetTextArea.setTabSize(12);
        RecipetTextArea.setBorder(null);
        RecipetTextAreaScrollPane.setViewportView(RecipetTextArea);

        BookConfirmPanel.add(RecipetTextAreaScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, 570, 640));

        UserBookedTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        UserBookedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USER", "MOVIE", "LANGUAGE", "LOCATION", "THEATHER", "TIME", "DATE", "NO. OF TICKET", "PRICE", "TOTAL", "STATUS", "SERIAL NO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        UserBookedTable.setCellSelectionEnabled(true);
        UserBookedTable.setInheritsPopupMenu(true);
        UserBookedTable.setShowGrid(true);
        UserBookedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserBookedTableMouseClicked(evt);
            }
        });
        UserBookedScrollPane.setViewportView(UserBookedTable);
        UserBookedTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        BookConfirmPanel.add(UserBookedScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 790, 400));

        BCSerialNoTextField.setEditable(false);
        BCSerialNoTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        BookConfirmPanel.add(BCSerialNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 300, 30));

        BCPayConfirmLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        BCPayConfirmLabel.setText("NOT PAYED");
        BookConfirmPanel.add(BCPayConfirmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 210, 50));

        BgBookConfirmImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OmtbsImages/Drew_beamer_1480px.jpg"))); // NOI18N
        BookConfirmPanel.add(BgBookConfirmImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BookConfirmPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BookConfirmPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        setSize(new java.awt.Dimension(1478, 831));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeButtonMouseClicked

    private void MaximizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizeButtonMouseClicked
        if(this.getExtendedState()!= BookConfirm.MAXIMIZED_BOTH){
            this.setExtendedState(BookConfirm.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(BookConfirm.NORMAL);
        }
    }//GEN-LAST:event_MaximizeButtonMouseClicked

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void RefreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshButtonMouseClicked
        booking_table();
        RecipetTextArea.setText("");
        bill();
    }//GEN-LAST:event_RefreshButtonMouseClicked

    private void BookingCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingCancelButtonActionPerformed
        DefaultTableModel Df = (DefaultTableModel)UserBookedTable.getModel();
        int selectedIndex = UserBookedTable.getSelectedRow();
        try {
            int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            int dialogResult = JOptionPane.showConfirmDialog(null,"Do You Want To Cancel The Booking!" , "Warning!" , JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                PreparedStatement ps;
                String TableDeleteQuery = "DELETE FROM `bookmovie` WHERE BOOK_ID=?";
                ps = MyConnection.getConnection().prepareStatement(TableDeleteQuery);
                ps.setInt(1, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"User Booked Slot Has Been Successfully Canceled" , "User Booking cancel", JOptionPane.INFORMATION_MESSAGE);
                booking_table();  
            }     
        } 
        catch (SQLException ex) 
            {
                Logger.getLogger(BookConfirm.class.getName()).log(Level.SEVERE, null, ex);
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null,"Movie Details Deletion Error Occuring!", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_BookingCancelButtonActionPerformed

    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed
        try {  
            RecipetTextArea.print();
        } 
        catch (PrinterException ex) {
            Logger.getLogger(BookConfirm.class.getName()).log(Level.SEVERE, null, ex);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Printing Error Occuring!", "Printing Error Message", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_PrintButtonActionPerformed

    private void BuyTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyTicketButtonActionPerformed
        String validatetotal = TotalPriceTextField.getText();
        String validatepay = PaymentAmountTextField.getText();
        String validateuser = UserCTextField.getText();
        String validateserno = BCSerialNoTextField.getText();
        String validatelabeln = BCPayConfirmLabel.getText();
        DefaultTableModel Df = (DefaultTableModel)UserBookedTable.getModel();
        int selectedIndex = UserBookedTable.getSelectedRow();
        String bstatus = "BOOKED";
        if(validatetotal.equals("")){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Go For Submit In Booking Window" , "Exiting....", JOptionPane.WARNING_MESSAGE);
            this.dispose();
        }
        else if(validatepay.equals("")){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Go For Submit In Booking Window" , "Exiting....", JOptionPane.WARNING_MESSAGE);
            this.dispose();
        }
        else if(validateuser.equals("")){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Go For Submit In Booking Window" , "Exiting....", JOptionPane.WARNING_MESSAGE);
            this.dispose();
        }
        else if (validatelabeln.equals("NOT PAYED") || validatelabeln.equals("NOT BOOKED")){
            try{
                int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
                PreparedStatement ps;
                String TableUpdateQuery = "UPDATE `bookmovie` SET BOOK_STATUS=?, BOOK_SERIALNO=? WHERE BOOK_ID=?";
                ps = MyConnection.getConnection().prepareStatement(TableUpdateQuery);
                ps.setString(1, bstatus);
                ps.setString(2, validateserno);
                ps.setInt(3, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Movie Book Confirmation Slot Has Been Successfully Updated" , "Confirmation Movie Book Status", JOptionPane.INFORMATION_MESSAGE);
                booking_table();
                RecipetTextArea.setText("");
                
                Payment pa = new Payment();
                String pppay = TotalPriceTextField.getText();
                pa.setVisible(true); 
                pa.pack(); 
                pa.PayTextField.setText(pppay);
                pa.setLocationRelativeTo(null); 
                pa.setExtendedState(JFrame.EXIT_ON_CLOSE);
                
                //BCPayConfirmLabel.setText("PAYED");
                bill();   
                
                
            }
            catch(SQLException ex) 
            {
                Logger.getLogger(BookConfirm.class.getName()).log(Level.SEVERE, null, ex);
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null,"Movie Book Updation Confirmation Error Occuring!", "Confirmation Update Error Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        else{
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"You Already Payed" , "Payed", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BuyTicketButtonActionPerformed

    private void UserBookedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserBookedTableMouseClicked
        String bserno = BCSerialNoTextField.getText();  
        String timeStamp = new SimpleDateFormat("yyyy-MMM-dd   HH:mm:ss").format(new Date());
        String buser = UserCTextField.getText();
        String btotal = TotalPriceTextField.getText();
        String bpay = PaymentAmountTextField.getText();
        DefaultTableModel Df = (DefaultTableModel)UserBookedTable.getModel();
        int selectedIndex = UserBookedTable.getSelectedRow();
        //Clear print Text pane
        RecipetTextArea.setText("");
        //Header
        RecipetTextArea.setText(RecipetTextArea.getText() + "**************************************************************************\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "***                 ONLINE MOVIE TICKET BOOKING SYSTEM                   ***\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "**************************************************************************\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "SERVICE PROVIDED BY: RA MOVIE BOOKING\n\n");
        //Content
        String puname = (String)(Df.getValueAt(selectedIndex, 1).toString());
        String pumovie= (String)(Df.getValueAt(selectedIndex, 2).toString());
        String pulan = (String)(Df.getValueAt(selectedIndex, 3).toString());
        String puloc = (String)(Df.getValueAt(selectedIndex, 4).toString());
        String putheather = (String)(Df.getValueAt(selectedIndex, 5).toString());
        String putime = (String)(Df.getValueAt(selectedIndex, 6).toString());
        String pudate = (String)(Df.getValueAt(selectedIndex, 7).toString());
        String puseat = (String)(Df.getValueAt(selectedIndex, 8).toString());
        String puprice = (String)(Df.getValueAt(selectedIndex, 9).toString());
        String putotal = (String)(Df.getValueAt(selectedIndex, 10).toString());
        String pustatus = (String)(Df.getValueAt(selectedIndex, 11).toString());
        String puserialno = (String)(Df.getValueAt(selectedIndex, 12).toString());
        RecipetTextArea.setText(RecipetTextArea.getText() + "USER NAME: " + buser + "\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "CONFIRM USER NAME: " + puname + "\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "MOVIE NAME: " + pumovie + "\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "MOVIE LANGUAGE: " + pulan + "\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "THEATHER LOCATION: " + puloc + "\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "THEATHER NAME: " + putheather +"\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "SHOW TIME: " + putime + "\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "SHOW DATE: " + pudate +"\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "NO. OF SEATS: " + puseat +"\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "MOVIE TICKET PRICE: " + puprice +"\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "TOTAL AMOUNT: " + putotal + "\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "PAYED AMOUNT: " + putotal + "\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "BOOK STATUS: " + pustatus +  "\n\n");
        //
        BCPayConfirmLabel.setText(pustatus);
        //
        RecipetTextArea.setText(RecipetTextArea.getText() + "BOOK STATUS: " + puserialno +  "\n\n");
        //Footer
        RecipetTextArea.setText(RecipetTextArea.getText() + "\n");
        RecipetTextArea.setText(RecipetTextArea.getText() +"                    THANK YOU HOPE YOU EXPRIENCE VERY WELL                  " + "\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "**************************************************************************\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "               " + puserialno +"             " + timeStamp +"\n\n");  
    }//GEN-LAST:event_UserBookedTableMouseClicked

    private void booking_table(){
        int r;
        try{
            PreparedStatement ps;
            String uuser = UserCTextField.getText();
            String TableQuery = "SELECT * FROM `bookmovie` WHERE BOOK_USER = ?";
            ps = MyConnection.getConnection().prepareStatement(TableQuery);
            ps.setString(1, uuser);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            r = rsmd.getColumnCount(); 
            DefaultTableModel Dft = (DefaultTableModel)UserBookedTable.getModel();
            Dft.setRowCount(0);
            while(rs.next()){
                Vector vr2 = new Vector();
                for(int a=1; a<=r; a++){
                    vr2.add(rs.getString("BOOK_ID"));
                    vr2.add(rs.getString("BOOK_USER"));
                    vr2.add(rs.getString("BOOK_MOVIE"));
                    vr2.add(rs.getString("BOOK_LANGUAGE"));
                    vr2.add(rs.getString("BOOK_LOCATION"));
                    vr2.add(rs.getString("BOOK_THEATHER"));
                    vr2.add(rs.getString("BOOK_TIME"));
                    vr2.add(rs.getString("BOOK_DATE"));
                    vr2.add(rs.getString("BOOK_SEATS"));
                    vr2.add(rs.getString("BOOK_PRICE"));
                    vr2.add(rs.getString("BOOK_TOTAL"));
                    vr2.add(rs.getString("BOOK_STATUS"));
                    vr2.add(rs.getString("BOOK_SERIALNO"));
                }
                Dft.addRow(vr2);
            }                        
        } 
        catch (SQLException ex){
            Logger.getLogger(BookConfirm.class.getName()).log(Level.SEVERE, null, ex);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"User Booking Tabel Data Collection Error Occuring!" , "User Booking Tabel Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void bill(){  
        String bserno = BCSerialNoTextField.getText();  
        String timeStamp = new SimpleDateFormat("yyyy-MMM-dd   HH:mm:ss").format(new Date());
        //Header
        RecipetTextArea.setText(RecipetTextArea.getText() + "**************************************************************************\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "***                 ONLINE MOVIE TICKET BOOKING SYSTEM                   ***\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "**************************************************************************\n\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "SERVICE PROVIDED BY: RA MOVIE BOOKING\n\n");
        //Footer
        RecipetTextArea.setText(RecipetTextArea.getText() + "\n");
        RecipetTextArea.setText(RecipetTextArea.getText() +"                    THANK YOU HOPE YOU EXPRIENCE VERY WELL                  " + "\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "**************************************************************************\n");
        RecipetTextArea.setText(RecipetTextArea.getText() + "                " + bserno +"               " + timeStamp +"\n\n");
    }
    
    
    private static int generateOSerialNo(){
    int otp = (int) (Math.random()*999999999); 
    return otp;
    }
    
    private static int generatenewSerialNo(){
    int notp = (int) (Math.random()*111); 
    return notp;
    }
    
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
            java.util.logging.Logger.getLogger(BookConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookConfirm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel BCPayConfirmLabel;
    private javax.swing.JTextField BCSerialNoTextField;
    private javax.swing.JLabel BgBookConfirmImg;
    private javax.swing.JPanel BookConfirmPanel;
    private javax.swing.JButton BookingCancelButton;
    private javax.swing.JButton BuyTicketButton;
    private javax.swing.JLabel CloseButton;
    private javax.swing.JLabel CompanyLogo;
    private javax.swing.JLabel MaximizeButton;
    private javax.swing.JLabel MinimizeButton;
    private javax.swing.JLabel PaymentAmountLabel;
    public javax.swing.JTextField PaymentAmountTextField;
    private javax.swing.JButton PrintButton;
    private javax.swing.JLabel PrintLabel;
    private javax.swing.JTextArea RecipetTextArea;
    private javax.swing.JScrollPane RecipetTextAreaScrollPane;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JLabel TotalPriceLabel;
    public javax.swing.JTextField TotalPriceTextField;
    private javax.swing.JScrollPane UserBookedScrollPane;
    private javax.swing.JTable UserBookedTable;
    private javax.swing.JLabel UserCLabel;
    public javax.swing.JTextField UserCTextField;
    // End of variables declaration//GEN-END:variables
}