/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reservationsystem;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Julio
 */
public class Login extends javax.swing.JFrame {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/studentreservation";
    private static final String USER = "root";
    private static final String PASS = "";
    PreparedStatement pst;
    ResultSet rst;
    long yearSectionID[];
    int index=1;

    public Login() {
        initComponents();
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // this method display the JFrame to center position of a screen
        setVisible(true);
        passwordRegField.setEchoChar((char)0);
        passwordRegField.setForeground(new Color(153,153,153));
        
        yearSectionID = new long[100];
        try{
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = "Select yearSectionID, yearsection From yearsection";
            pst = connection.prepareStatement(query);
            rst = pst.executeQuery();
            while(rst.next()){
                yearSectionID[index] = rst.getLong(1);
                index++;
                programComboBox2.addItem(rst.getString(2));
            }
            rst.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    } 
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexButtonGroup = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        loginPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        studentLogTextField = new javax.swing.JTextField();
        studentLogLabel = new javax.swing.JLabel();
        passwordLogLabel = new javax.swing.JLabel();
        passwordLogTextField = new javax.swing.JPasswordField();
        clearLogButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        registerPanel = new javax.swing.JPanel();
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
        passwordRegLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        clearRegButton = new javax.swing.JButton();
        contactLabel = new javax.swing.JLabel();
        addressLabel1 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        sexLabel1 = new javax.swing.JLabel();
        programComboBox2 = new javax.swing.JComboBox<>();
        programComboBox1 = new javax.swing.JComboBox<>();
        contactTextField = new javax.swing.JTextField();
        passwordRegField = new javax.swing.JPasswordField();
        birthDateChooser = new com.toedter.calendar.JDateChooser();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setName(""); // NOI18N

        loginLabel.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Login");

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
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

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

        registerPanel.setForeground(new java.awt.Color(153, 153, 153));
        registerPanel.setLayout(null);

        registrationLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        registrationLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationLabel1.setText("Registration");
        registerPanel.add(registrationLabel1);
        registrationLabel1.setBounds(0, 42, 400, 32);

        nameLabel.setText("Name");
        registerPanel.add(nameLabel);
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
        registerPanel.add(firstNameTextField);
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
        registerPanel.add(lastNameTextField);
        lastNameTextField.setBounds(202, 80, 140, 30);

        emailLabel.setText("Email");
        registerPanel.add(emailLabel);
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
        registerPanel.add(emailTextField);
        emailTextField.setBounds(80, 110, 261, 30);

        sexLabel.setText("Sex");
        registerPanel.add(sexLabel);
        sexLabel.setBounds(32, 146, 30, 16);

        sexButtonGroup.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        registerPanel.add(jRadioButton1);
        jRadioButton1.setBounds(81, 144, 62, 21);

        sexButtonGroup.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        registerPanel.add(jRadioButton2);
        jRadioButton2.setBounds(149, 144, 61, 21);

        studentRegLabel.setText("Student Number");
        registerPanel.add(studentRegLabel);
        studentRegLabel.setBounds(32, 171, 88, 22);

        studentRegTextField.setForeground(new java.awt.Color(153, 153, 153));
        studentRegTextField.setText("****-*****-PQ-*");
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
        registerPanel.add(studentRegTextField);
        studentRegTextField.setBounds(132, 171, 210, 22);

        birthDateLabel.setText("Birth date");
        registerPanel.add(birthDateLabel);
        birthDateLabel.setBounds(32, 202, 65, 16);

        passwordRegLabel.setText("Password");
        registerPanel.add(passwordRegLabel);
        passwordRegLabel.setBounds(33, 350, 53, 16);

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        registerPanel.add(registerButton);
        registerButton.setBounds(221, 384, 106, 23);

        clearRegButton.setText("Clear");
        clearRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearRegButtonActionPerformed(evt);
            }
        });
        registerPanel.add(clearRegButton);
        clearRegButton.setBounds(65, 384, 106, 23);

        contactLabel.setText("Contact #");
        registerPanel.add(contactLabel);
        contactLabel.setBounds(32, 233, 51, 22);

        addressLabel1.setText("Address");
        registerPanel.add(addressLabel1);
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
        registerPanel.add(addressTextField);
        addressTextField.setBounds(90, 260, 254, 30);

        sexLabel1.setText("Program");
        registerPanel.add(sexLabel1);
        sexLabel1.setBounds(32, 292, 46, 16);

        programComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year-Section" }));
        programComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programComboBox2ActionPerformed(evt);
            }
        });
        registerPanel.add(programComboBox2);
        programComboBox2.setBounds(90, 316, 120, 22);

        programComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course", "Bachelor of Science in Computer Engineering", "Bachelor of Science in Hospitality Management", "Bachelor of Science in Information Technology", "Bachelor of Science in Office Administration" }));
        registerPanel.add(programComboBox1);
        programComboBox1.setBounds(90, 289, 255, 22);

        contactTextField.setForeground(new java.awt.Color(0, 0, 0));
        contactTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactTextFieldFocusGained(evt);
            }
        });
        registerPanel.add(contactTextField);
        contactTextField.setBounds(90, 230, 254, 30);

        passwordRegField.setText("must contain at least 8 characters");
        passwordRegField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordRegFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordRegFieldFocusLost(evt);
            }
        });
        passwordRegField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordRegFieldActionPerformed(evt);
            }
        });
        registerPanel.add(passwordRegField);
        passwordRegField.setBounds(90, 342, 260, 30);
        registerPanel.add(birthDateChooser);
        birthDateChooser.setBounds(90, 200, 250, 22);

        jTabbedPane1.addTab("Registration", registerPanel);

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
        if (studentRegTextField.getText().equals("****-*****-PQ-*")){
            studentRegTextField.setText("");
            studentRegTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_studentRegTextFieldFocusGained

    private void studentRegTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentRegTextFieldFocusLost
        // placeholder
        if (studentRegTextField.getText().equals("")){
            studentRegTextField.setText("****-*****-PQ-*");
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
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String email = emailTextField.getText();
        String sex = jRadioButton1.isSelected() ? "Male" : "Female";
        String studentNumber = studentRegTextField.getText();
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd"); 
        String birthDate = Date_Format.format(birthDateChooser.getDate());
        String contactNumber = contactTextField.getText();
        String address = addressTextField.getText();
        String programCourse = programComboBox1.getSelectedItem().toString();
        String password = passwordRegField.getText();
        
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
               
            String ContactSQL = "INSERT INTO contact(email, contactNumber, address) VALUES (?,?,?)";
            PreparedStatement contactStatement = connection.prepareStatement(ContactSQL, Statement.RETURN_GENERATED_KEYS);
            contactStatement.setString(1, email);
            contactStatement.setString(2, contactNumber);
            contactStatement.setString(3, address);
            
            int contactRowsInserted = contactStatement.executeUpdate();
            long contactID = 0;
            if (contactRowsInserted > 0) {
                ResultSet generatedKeys = contactStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    contactID = generatedKeys.getLong(1);
                }
            }
            
            String sql = "INSERT INTO student (firstName, lastName, sex, studentNumber, birthDate, program, password, yearSectionID, contactID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, sex);
            statement.setString(4, studentNumber);
            statement.setString(5, birthDate);
            statement.setString(6, programCourse);
            statement.setString(7, password);
            statement.setLong(8, yearSectionID[programComboBox2.getSelectedIndex()]);
            statement.setLong(9, contactID);
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(rootPane, "Success! Your account has been created");
                // Clears the Registration form
                Color placeholderColor = new Color(153, 153, 153);

                JTextField[] registrationTextFields = {
                    firstNameTextField, lastNameTextField, emailTextField, studentRegTextField, passwordRegField,contactTextField,addressTextField
                };

                String[] defaultTexts = {
                    "First Name", "Last Name", "example@example.com", "****-*****-PQ-*", "must contain at least 8 characters","",""
                };

                for (int i = 0; i < registrationTextFields.length; i++) {
                    registrationTextFields[i].setText(defaultTexts[i]);
                    registrationTextFields[i].setForeground(placeholderColor);
                }
                passwordRegField.setEchoChar((char)0);
                sexButtonGroup.clearSelection();
                birthDateChooser.setCalendar(null);
                programComboBox1.setSelectedIndex(0);
                programComboBox2.setSelectedIndex(0);
            }

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void clearRegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearRegButtonActionPerformed
        // Clears the Registration form
        Color placeholderColor = new Color(153, 153, 153);

        JTextField[] registrationTextFields = {
            firstNameTextField, lastNameTextField, emailTextField, studentRegTextField, passwordRegField,contactTextField,addressTextField
        };

        String[] defaultTexts = {
            "First Name", "Last Name", "example@example.com", "****-*****-PQ-*", "must contain at least 8 characters","",""
        };

        for (int i = 0; i < registrationTextFields.length; i++) {
            registrationTextFields[i].setText(defaultTexts[i]);
            registrationTextFields[i].setForeground(placeholderColor);
        }
        passwordRegField.setEchoChar((char)0);
        sexButtonGroup.clearSelection();
        birthDateChooser.setCalendar(null);
        programComboBox1.setSelectedIndex(0);
        programComboBox2.setSelectedIndex(0);
    }//GEN-LAST:event_clearRegButtonActionPerformed

    private void addressTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressTextFieldFocusGained
        // set black color
        addressTextField.setForeground(new Color(0,0,0));
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

    private void contactTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactTextFieldFocusGained
        // set black color
            contactTextField.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_contactTextFieldFocusGained

    private void programComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programComboBox2ActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String studentNumber = studentLogTextField.getText();
        String password = passwordLogTextField.getText();
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
               
        String loginSQL = "SELECT student.studentID, student.firstName, student.lastName, student.studentNumber,student.program,student.birthDate, student.password, yearsection.yearSection,contact.contactNumber, contact.email "
                        + "FROM student "
                        + "INNER JOIN yearsection ON student.yearSectionID = yearsection.yearSectionID "
                        + "INNER JOIN contact ON student.contactID = contact.contactID "
                        + "WHERE student.studentNumber = ? AND student.password = ?";

            PreparedStatement statement = connection.prepareCall(loginSQL);
            statement.setString(1, studentNumber);
            statement.setString(2, password);
            
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                User user = new User(
                rs.getInt("studentID"),
                rs.getString("studentNumber"),
                rs.getString("password"),
                rs.getString("firstName"),
                rs.getString("lastName"),
                rs.getString("email"),        
                rs.getString("yearSection"),
                rs.getString("program"),
                rs.getString("birthDate"),
                rs.getString("contactNumber")        
                );
                
                dashboardFrame db = new dashboardFrame(user);
                db.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Login Failed");
            }
                   
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }    
           
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passwordRegFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordRegFieldFocusGained
        // placeholder
        if (passwordRegField.getText().equals("must contain at least 8 characters")){
            passwordRegField.setText("");
            passwordRegField.setForeground(new Color(0,0,0));
            passwordRegField.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_passwordRegFieldFocusGained

    private void passwordRegFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordRegFieldFocusLost
        // placeholder
        
        if (passwordRegField.getText().equals("")){
            passwordRegField.setEchoChar((char)0);
            passwordRegField.setText("must contain at least 8 characters");
            passwordRegField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_passwordRegFieldFocusLost

    private void passwordRegFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordRegFieldActionPerformed
        
    }//GEN-LAST:event_passwordRegFieldActionPerformed

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
    private com.toedter.calendar.JDateChooser birthDateChooser;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JButton clearLogButton;
    private javax.swing.JButton clearRegButton;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPasswordField passwordRegField;
    private javax.swing.JLabel passwordRegLabel;
    private javax.swing.JComboBox<String> programComboBox1;
    private javax.swing.JComboBox<String> programComboBox2;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel registerPanel;
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
