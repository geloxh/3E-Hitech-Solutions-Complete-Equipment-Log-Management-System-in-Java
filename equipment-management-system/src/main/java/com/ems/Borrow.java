package com.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 * @author geloxh
 * 
 */

public class Borrow extends javax.swing.JFrame {
    Connection connection = null;
    ResultSet resultSet;
    PreparedStatement preparedStatement;
    
    /**
     * Creates new form for Borrow
     */

    public Borrow() {
        super("Borrow Equipment");
        initComponents();
        connection = new JavaConnectionDataBase().connectToDatabase();
        EquipmentIDTextField.setVisible(false);
        StudentIDTextField.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StudentInfoPanel = new javax.swing.JPanel();
        ClassTextField = new javax.swing.JTextField();
        ClassLabel = new javax.swing.JLabel();
        FullNameLabel = new javax.swing.JLabel();
        FullNameTextField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        StudentIDTextField = new javax.swing.JTextField();
        EquipmentPanel = new javax.swing.JPanel();
        SupplierTextField = new javax.swing.JTextField();
        SearchEquipmentButton = new javax.swing.JButton();
        EquipmentNameTextField = new javax.swing.JTextField();
        SupplierLabel = new javax.swing.JLabel();
        ClassroomTextField = new javax.swing.JTextField();
        EquipmentNameLabel = new javax.swing.JLabel();
        EquipmentCodeLabel = new javax.swing.JLabel();
        EquipmentCodeTextField = new javax.swing.JTextField();
        EquipmentDescriptionLabel = new javax.swing.JLabel();
        ClassroomLabel = new javax.swing.JLabel();
        EquipmentDescriptionTextField = new javax.swing.JTextField();
        EquipmentIDTextField = new javax.swing.JTextField();
        BorrowDateLabel = new javax.swing.JLabel();
        BorrowDateCombobox = new datechooser.beans.DateChooserCombo();
        BorrowButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        ReturnDateLabel = new javax.swing.JLabel();
        ReturnDateCombobox = new datechooser.beans.DateChooserCombo();
        TimeReturnedCombobox = new javax.swing.JComboBox();
        TimeReturnedLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StudentInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 204))); // NOI18N

        ClassTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ClassLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ClassLabel.setText("Class");

        FullNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FullNameLabel.setText("Full Name");

        FullNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        EmailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmailLabel.setText("Email");

        EmailTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StudentInfoPanelLayout = new javax.swing.GroupLayout(StudentInfoPanel);
        StudentInfoPanel.setLayout(StudentInfoPanelLayout);
        StudentInfoPanelLayout.setHorizontalGroup(
            StudentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentInfoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(StudentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
            .addGroup(StudentInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FullNameLabel)
                    .addComponent(ClassLabel)
                    .addComponent(EmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(StudentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FullNameTextField)
                    .addComponent(ClassTextField)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        StudentInfoPanelLayout.setVerticalGroup(
            StudentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentInfoPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(StudentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentInfoPanelLayout.createSequentialGroup()
                        .addComponent(FullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(StudentInfoPanelLayout.createSequentialGroup()
                        .addComponent(FullNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(StudentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(StudentInfoPanelLayout.createSequentialGroup()
                        .addComponent(ClassLabel)
                        .addGap(62, 62, 62)
                        .addComponent(EmailLabel))
                    .addGroup(StudentInfoPanelLayout.createSequentialGroup()
                        .addComponent(ClassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(174, 174, 174)
                .addComponent(StudentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EquipmentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Equipment Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 204))); // NOI18N

        SupplierTextField.setEditable(false);
        SupplierTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        SearchEquipmentButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchEquipmentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        SearchEquipmentButton.setText("Search");
        SearchEquipmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEquipmentButtonActionPerformed(evt);
            }
        });

        EquipmentNameTextField.setEditable(false);
        EquipmentNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        SupplierLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SupplierLabel.setText("From Teacher");

        ClassroomTextField.setEditable(false);
        ClassroomTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        EquipmentNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EquipmentNameLabel.setText("Equipment Name");

        EquipmentCodeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EquipmentCodeLabel.setText("Equipment Code");

        EquipmentCodeTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        EquipmentDescriptionLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EquipmentDescriptionLabel.setText("Equipment Description");

        ClassroomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ClassroomLabel.setText("Classroom");

        EquipmentDescriptionTextField.setEditable(false);
        EquipmentDescriptionTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        EquipmentIDTextField.setEnabled(false);

        javax.swing.GroupLayout EquipmentPanelLayout = new javax.swing.GroupLayout(EquipmentPanel);
        EquipmentPanel.setLayout(EquipmentPanelLayout);
        EquipmentPanelLayout.setHorizontalGroup(
            EquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquipmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SupplierLabel)
                    .addGroup(EquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SearchEquipmentButton)
                        .addGroup(EquipmentPanelLayout.createSequentialGroup()
                            .addGroup(EquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EquipmentCodeLabel)
                                .addComponent(EquipmentNameLabel)
                                .addComponent(EquipmentDescriptionLabel)
                                .addComponent(ClassroomLabel))
                            .addGap(38, 38, 38)
                            .addGroup(EquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SupplierTextField)
                                .addComponent(EquipmentCodeTextField)
                                .addComponent(EquipmentNameTextField)
                                .addComponent(EquipmentDescriptionTextField)
                                .addComponent(ClassroomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(EquipmentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        EquipmentPanelLayout.setVerticalGroup(
            EquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquipmentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchEquipmentButton)
                .addGap(18, 18, 18)
                .addGroup(EquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EquipmentCodeLabel)
                    .addComponent(EquipmentCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(EquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EquipmentNameLabel)
                    .addComponent(EquipmentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(EquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EquipmentDescriptionLabel)
                    .addComponent(EquipmentDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(EquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SupplierLabel)
                    .addComponent(SupplierTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(EquipmentIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(EquipmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClassroomLabel)
                    .addComponent(ClassroomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        BorrowDateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BorrowDateLabel.setText("Borrow Date: ");

        BorrowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/borrow-button-icon.png"))); // NOI18N
        BorrowButton.setText("Borrow");
        BorrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowButtonActionPerformed(evt);
            }
        });

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/back.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ReturnDateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ReturnDateLabel.setText("Return Date");

        TimeReturnedCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Break", "Lunch" }));
        TimeReturnedCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeReturnedComboboxActionPerformed(evt);
            }
        });

        TimeReturnedLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TimeReturnedLabel.setText("Time Returned");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(EquipmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(StudentInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BorrowButton)
                                .addGap(18, 18, 18)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(ReturnDateLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ReturnDateCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TimeReturnedLabel)
                                        .addComponent(BorrowDateLabel))
                                    .addGap(50, 50, 50)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TimeReturnedCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BorrowDateCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EquipmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StudentInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimeReturnedLabel)
                            .addComponent(TimeReturnedCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BorrowDateCombobox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BorrowDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReturnDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReturnDateCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BorrowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1060, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void BorrowButtonActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_BorrowButtonActionPerformed
    String emailValidate = 
    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (EmailTextField.getText().matches(emailValidate)) {
            String sqlInsertBorrow = "INSERT INTO Borrow(EquipmentID, FullName \n"
                + ", Class, Email, TimeReturned, ReturnDate, DateBorrow) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try {
            preparedStatement = connection.prepareStatement(sqlInsertBorrow);
            preparedStatement.setString(1, EquipmentIDTextField.getText());
            preparedStatement.setString(2, FullNameTextField.getText());
            preparedStatement.setString(3, ClassTextField.getText());
            preparedStatement.setString(4, EmailTextField.getText());
            preparedStatement.setString(5, (String) TimeReturnedCombobox.getSelectedItem());
            preparedStatement.setString(6, ReturnDateCombobox.getText());
            preparedStatement.setString(7, BorrowDateCombobox.getText());
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Equipment Borrowed Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }   
    } // GEN-LAST:event_BorrowButtonActionPerformed
        else {
            JOptionPane.showMessageDialog(null, "Please enter a correct email");
        }
            }

        
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_BackButtonActionPerformed
        setVisible(false); // CLOSE THE CURRENT SCREEN
        DashBoard dashBoard = new DashBoard();
        dashBoard.setVisible(true); // OPEN THE DASHBOARD SCREEN
        if (BackButton.isEnabled());
        Properties prop = System.getProperties(); // SETUP EMAIL PROPERTIES WHEN BACK BUTTON IS CLICKED
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            final String GmailAccountEmail = "patrick.santos@gmail.com"; // SETUP GMAIL ACCOUNT
            final String GmailPassword = "programtest123"; // SETUP GMAIL PASSWORD


        Session session = null;
        session = Session.getInstance(prop, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(GmailAccountEmail, GmailPassword); // PROCESS OF VALIDATING EMAIL ACCOUNT
            }
            });
    try{
     MimeMessage message;
        message = new MimeMessage(session);

     message.setFrom(new InternetAddress(GmailAccountEmail));

     message.addRecipient(Message.RecipientType.TO,
                              new InternetAddress(EmailTextField.getText()));
                              
     message.setSubject("3E Hitech Solutions"); // SET TITLE OF THE EMAIL

     message.setSubject("Return of Company Property")
      
     message.setText("Dear Employee, \nPer company policy, employees must return all property issued to you on time.\nThis includes but is not limited to:\n-Laptop\n-Laptop Bag\n-FlashDrive\n-Computer Mouse\n-ID badge/keys\n-[Other Items]\nIf you need help arranging the return, kindly contact IT or HR at [email/phone].\nThank you for cooperation. \n Best Regards,\n[Your Name]\n[Your Position]\n[Company Name]");

     Transport.send(message);
     System.out.println("Email Sent Successfully!");
    }catch (MessagingException mex) {
     mex.printStackTrace();
    }

    } // GEN-LAST:event_BackButtonActionPerformed

    private void SearchEquipmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEquipmentButtonActionPerformed
       String sqlSearchEquipment = "SELECT * FROM Equipment WHERE EquipmentCode=?";
        try {
            preparedStatement = connection.prepareStatement(sqlSearchEquipment);
            preparedStatement.setString(1, EquipmentCodeTextField.getText());
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                EquipmentNameTextField.setText(resultSet.getString("EquipmentName"));
                EquipmentDescriptionTextField.setText(resultSet.getString("EquipmentDescription"));
                SupplierTextField.setText(resultSet.getString("Supplier"));
                ClassroomTextField.setText(resultSet.getString("Classroom"));
                EquipmentIDTextField.setText(resultSet.getString("EquipmentID"));
                resultSet.close();
                preparedStatement.close();
            }
            else {
                JOptionPane.showMessageDialog(null, "No results were found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error when searching for equipment");
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
            } catch (Exception e) {
            }
        }
    } // GEN-LAST:event_SearchEquipmentButtonActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    } // GEN-LAST:event_EmailTextFieldActionPerformed

    private void TimeReturnedComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeReturnedComboboxActionPerformed
        // TODO add your handling code here:
    } // GEN-LAST:event_TimeReturnedComboboxActionPerformed

    /**
     * @param args THE COMMAND LINE ARGUMENTS
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
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* CREATE AND DISPLAY THE FORM */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton BackButton;
    private javax.swing.JButton BorrowButton;
    private datechooser.beans.DateChooserCombo BorrowDateCombobox;
    private javax.swing.JLabel BorrowDateLabel;
    private javax.swing.JLabel ClassLabel;
    private javax.swing.JTextField ClassTextField;
    private javax.swing.JLabel ClassroomLabel;
    private javax.swing.JTextField ClassroomTextField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel EquipmentCodeLabel;
    private javax.swing.JTextField EquipmentCodeTextField;
    private javax.swing.JLabel EquipmentDescriptionLabel;
    private javax.swing.JTextField EquipmentDescriptionTextField;
    private javax.swing.JTextField EquipmentIDTextField;
    private javax.swing.JLabel EquipmentNameLabel;
    private javax.swing.JTextField EquipmentNameTextField;
    private javax.swing.JPanel EquipmentPanel;
    private javax.swing.JLabel FullNameLabel;
    private javax.swing.JTextField FullNameTextField;
    private datechooser.beans.DateChooserCombo ReturnDateCombobox;
    private javax.swing.JLabel ReturnDateLabel;
    private javax.swing.JButton SearchEquipmentButton;
    private javax.swing.JTextField StudentIDTextField;
    private javax.swing.JPanel StudentInfoPanel;
    private javax.swing.JLabel SupplierLabel;
    private javax.swing.JTextField SupplierTextField;
    private javax.swing.JComboBox TimeReturnedCombobox;
    private javax.swing.JLabel TimeReturnedLabel;

    // End of variables declaration//GEN-END:variables
}
