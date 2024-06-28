/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reservationsystem;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Julio
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexButtonGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        loginPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        studentLogTextField = new javax.swing.JTextField();
        studentLogLabel = new javax.swing.JLabel();
        passwordLogLabel = new javax.swing.JLabel();
        passwordLogTextField = new javax.swing.JPasswordField();
        clearLogButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        registrationLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        sexLabel = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        studentRegLabel = new javax.swing.JLabel();
        studentRegTextField = new javax.swing.JTextField();
        birthDateLabel = new javax.swing.JLabel();
        birthDateComboBox1 = new javax.swing.JComboBox<>();
        birthDateComboBox2 = new javax.swing.JComboBox<>();
        birthDateComboBox3 = new javax.swing.JComboBox<>();
        passwordRegLabel = new javax.swing.JLabel();
        passwordRegTextField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        clearRegButton = new javax.swing.JButton();
        contactLabel = new javax.swing.JLabel();
        addressLabel1 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        sexLabel1 = new javax.swing.JLabel();
        programComboBox2 = new javax.swing.JComboBox<>();
        programComboBox3 = new javax.swing.JComboBox<>();
        programComboBox1 = new javax.swing.JComboBox<>();
        contactField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setName(""); // NOI18N

        loginLabel.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("LOGIN");

        studentLogTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentLogTextFieldActionPerformed(evt);
            }
        });

        studentLogLabel.setText("Student Number");

        passwordLogLabel.setText("Password");

        clearLogButton.setText("Clear");
        clearLogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearLogButtonActionPerformed(evt);
            }
        });

        loginButton.setText("Login");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentLogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(clearLogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addComponent(passwordLogTextField)
                            .addComponent(studentLogTextField))))
                .addGap(60, 60, 60))
            .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(loginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentLogLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentLogTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLogLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLogTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearLogButton)
                    .addComponent(loginButton))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", loginPanel);

        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        registrationLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        registrationLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationLabel1.setText("Registration");
        jPanel2.add(registrationLabel1);
        registrationLabel1.setBounds(0, 42, 400, 32);

        nameLabel.setText("Name");
        jPanel2.add(nameLabel);
        nameLabel.setBounds(32, 80, 37, 30);

        firstNameTextField.setForeground(new java.awt.Color(153, 153, 153));
        firstNameTextField.setText("First Name");
        firstNameTextField.setMinimumSize(new java.awt.Dimension(30, 20));
        firstNameTextField.setPreferredSize(new java.awt.Dimension(30, 20));
        firstNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameTextFieldFocusLost(evt);
            }
        });
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(firstNameTextField);
        firstNameTextField.setBounds(81, 80, 120, 30);

        lastNameTextField.setForeground(new java.awt.Color(153, 153, 153));
        lastNameTextField.setText("Last Name");
        lastNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameTextFieldFocusLost(evt);
            }
        });
        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(lastNameTextField);
        lastNameTextField.setBounds(202, 80, 140, 30);

        emailLabel.setText("Email");
        jPanel2.add(emailLabel);
        emailLabel.setBounds(32, 119, 37, 16);

        emailTextField.setForeground(new java.awt.Color(153, 153, 153));
        emailTextField.setText("example@example.com");
        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusLost(evt);
            }
        });
        emailTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailTextFieldMouseClicked(evt);
            }
        });
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(emailTextField);
        emailTextField.setBounds(80, 110, 261, 30);

        sexLabel.setText("Sex");
        jPanel2.add(sexLabel);
        sexLabel.setBounds(32, 146, 30, 16);

        sexButtonGroup.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(81, 144, 62, 21);

        sexButtonGroup.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(149, 144, 61, 21);

        studentRegLabel.setText("Student Number");
        jPanel2.add(studentRegLabel);
        studentRegLabel.setBounds(32, 171, 88, 22);

        studentRegTextField.setForeground(new java.awt.Color(153, 153, 153));
        studentRegTextField.setText("****-*****-****PQ-*");
        studentRegTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                studentRegTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                studentRegTextFieldFocusLost(evt);
            }
        });
        studentRegTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentRegTextFieldMouseClicked(evt);
            }
        });
        studentRegTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRegTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(studentRegTextField);
        studentRegTextField.setBounds(132, 171, 210, 22);

        birthDateLabel.setText("Birth date");
        jPanel2.add(birthDateLabel);
        birthDateLabel.setBounds(32, 202, 65, 16);

        birthDateComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel2.add(birthDateComboBox1);
        birthDateComboBox1.setBounds(103, 199, 105, 22);

        birthDateComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(birthDateComboBox2);
        birthDateComboBox2.setBounds(214, 199, 72, 22);

        birthDateComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950" }));
        jPanel2.add(birthDateComboBox3);
        birthDateComboBox3.setBounds(292, 199, 72, 22);

        passwordRegLabel.setText("Password");
        jPanel2.add(passwordRegLabel);
        passwordRegLabel.setBounds(33, 350, 53, 16);

        passwordRegTextField.setForeground(new java.awt.Color(153, 153, 153));
        passwordRegTextField.setText("must contain at least 8 characters");
        passwordRegTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordRegTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordRegTextFieldFocusLost(evt);
            }
        });
        passwordRegTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordRegTextFieldMouseClicked(evt);
            }
        });
        passwordRegTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordRegTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(passwordRegTextField);
        passwordRegTextField.setBounds(92, 344, 254, 28);

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(registerButton);
        registerButton.setBounds(221, 384, 106, 23);

        clearRegButton.setText("Clear");
        clearRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearRegButtonActionPerformed(evt);
            }
        });
        jPanel2.add(clearRegButton);
        clearRegButton.setBounds(65, 384, 106, 23);

        contactLabel.setText("Contact #");
        jPanel2.add(contactLabel);
        contactLabel.setBounds(32, 233, 51, 22);

        addressLabel1.setText("Address");
        jPanel2.add(addressLabel1);
        addressLabel1.setBounds(32, 261, 50, 22);

        addressTextField.setForeground(new java.awt.Color(0, 0, 0));
        addressTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressTextFieldFocusLost(evt);
            }
        });
        addressTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressTextFieldMouseClicked(evt);
            }
        });
        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(addressTextField);
        addressTextField.setBounds(90, 260, 254, 30);

        sexLabel1.setText("Program");
        jPanel2.add(sexLabel1);
        sexLabel1.setBounds(32, 292, 46, 16);

        programComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1", "2", "3", "4", "5" }));
        jPanel2.add(programComboBox2);
        programComboBox2.setBounds(90, 316, 72, 22);

        programComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Section", "1", "2", "3", "4", "5" }));
        jPanel2.add(programComboBox3);
        programComboBox3.setBounds(174, 316, 73, 22);

        programComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course", "Bachelor of Science in Computer Engineering", "Bachelor of Science in Hospitality Management", "Bachelor of Science in Information Technology", "Bachelor of Science in Office Administration" }));
        jPanel2.add(programComboBox1);
        programComboBox1.setBounds(90, 289, 255, 22);

        contactField.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(contactField);
        contactField.setBounds(90, 230, 254, 30);

        jTabbedPane1.addTab("Registration", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentLogTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentLogTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentLogTextFieldActionPerformed

    private void clearLogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearLogButtonActionPerformed
        //Clears the Login Form
        studentLogTextField.setText("");
        passwordLogTextField.setText("");
    }//GEN-LAST:event_clearLogButtonActionPerformed

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void emailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusGained
        // placeholder
        if (emailTextField.getText().equals("example@example.com")){
            emailTextField.setText("");
            emailTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_emailTextFieldFocusGained

    private void emailTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTextFieldMouseClicked
        // placeholder
    }//GEN-LAST:event_emailTextFieldMouseClicked

    private void emailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusLost
        // placeholder
        if (emailTextField.getText().equals("")){
            emailTextField.setText("example@example.com");
            emailTextField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_emailTextFieldFocusLost

    private void firstNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameTextFieldFocusGained
        // placeholder
        if (firstNameTextField.getText().equals("First Name")){
            firstNameTextField.setText("");
            firstNameTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_firstNameTextFieldFocusGained

    private void firstNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameTextFieldFocusLost
        // placeholder
        if (firstNameTextField.getText().equals("")){
            firstNameTextField.setText("First Name");
            firstNameTextField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_firstNameTextFieldFocusLost

    private void lastNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameTextFieldFocusGained
        // placeholder
        if (lastNameTextField.getText().equals("Last Name")){
            lastNameTextField.setText("");
            lastNameTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_lastNameTextFieldFocusGained

    private void lastNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameTextFieldFocusLost
        // placeholder
        if (lastNameTextField.getText().equals("")){
            lastNameTextField.setText("Last Name");
            lastNameTextField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_lastNameTextFieldFocusLost

    private void studentRegTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentRegTextFieldFocusGained
        // placeholder
        if (studentRegTextField.getText().equals("****-*****-****PQ-*")){
            studentRegTextField.setText("");
            studentRegTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_studentRegTextFieldFocusGained

    private void studentRegTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentRegTextFieldFocusLost
        // placeholder
        if (studentRegTextField.getText().equals("")){
            studentRegTextField.setText("****-*****-****PQ-*");
            studentRegTextField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_studentRegTextFieldFocusLost

    private void studentRegTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentRegTextFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_studentRegTextFieldMouseClicked

    private void studentRegTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRegTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentRegTextFieldActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void passwordRegTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordRegTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordRegTextFieldActionPerformed

    private void passwordRegTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordRegTextFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordRegTextFieldMouseClicked

    private void passwordRegTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordRegTextFieldFocusLost
        // placeholder
        if (passwordRegTextField.getText().equals("")){
            passwordRegTextField.setText("must contain at least 8 characters");
            passwordRegTextField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_passwordRegTextFieldFocusLost

    private void passwordRegTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordRegTextFieldFocusGained
        // placeholder
        if (passwordRegTextField.getText().equals("must contain at least 8 characters")){
            passwordRegTextField.setText("");
            passwordRegTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_passwordRegTextFieldFocusGained

    private void clearRegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearRegButtonActionPerformed
        // Clears the Registration form
        Color placeholderColor = new Color(153, 153, 153);

        JTextField[] registrationTextFields = {
            firstNameTextField, lastNameTextField, emailTextField, studentRegTextField, passwordRegTextField,contactField,addressTextField
        };

        String[] defaultTexts = {
            "First Name", "Last Name", "example@example.com", "****-*****-****PQ-*", "must contain at least 8 characters","",""
        };

        for (int i = 0; i < registrationTextFields.length; i++) {
            registrationTextFields[i].setText(defaultTexts[i]);
            registrationTextFields[i].setForeground(placeholderColor);
        }

        sexButtonGroup.clearSelection();

        birthDateComboBox1.setSelectedIndex(0);
        birthDateComboBox2.setSelectedIndex(0);
        birthDateComboBox3.setSelectedIndex(0);
        
        programComboBox1.setSelectedIndex(0);
        programComboBox2.setSelectedIndex(0);
        programComboBox3.setSelectedIndex(0);
    }//GEN-LAST:event_clearRegButtonActionPerformed

    private void addressTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldFocusGained

    private void addressTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldFocusLost

    private void addressTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressTextFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldMouseClicked

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel1;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JComboBox<String> birthDateComboBox1;
    private javax.swing.JComboBox<String> birthDateComboBox2;
    private javax.swing.JComboBox<String> birthDateComboBox3;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JButton clearLogButton;
    private javax.swing.JButton clearRegButton;
    private javax.swing.JTextField contactField;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel passwordLogLabel;
    private javax.swing.JPasswordField passwordLogTextField;
    private javax.swing.JLabel passwordRegLabel;
    private javax.swing.JTextField passwordRegTextField;
    private javax.swing.JComboBox<String> programComboBox1;
    private javax.swing.JComboBox<String> programComboBox2;
    private javax.swing.JComboBox<String> programComboBox3;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registrationLabel1;
    private javax.swing.ButtonGroup sexButtonGroup;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JLabel sexLabel1;
    private javax.swing.JLabel studentLogLabel;
    private javax.swing.JTextField studentLogTextField;
    private javax.swing.JLabel studentRegLabel;
    private javax.swing.JTextField studentRegTextField;
    // End of variables declaration//GEN-END:variables
}
