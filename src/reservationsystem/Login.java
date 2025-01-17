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
        homepagePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        loginPanel = new javax.swing.JPanel();
        studentLogTextField = new javax.swing.JTextField();
        studentLogLabel = new javax.swing.JLabel();
        passwordLogLabel = new javax.swing.JLabel();
        passwordLogTextField = new javax.swing.JPasswordField();
        clearLogButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
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
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0,80));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setName(""); // NOI18N

        homepagePanel.setBackground(new java.awt.Color(200, 200, 200,150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservationsystem/logo (3).png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hi, PUPian!");

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Register");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homepagePanelLayout = new javax.swing.GroupLayout(homepagePanel);
        homepagePanel.setLayout(homepagePanelLayout);
        homepagePanelLayout.setHorizontalGroup(
            homepagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homepagePanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(homepagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homepagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homepagePanelLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(136, 136, 136))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homepagePanelLayout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)))))
        );
        homepagePanelLayout.setVerticalGroup(
            homepagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepagePanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", homepagePanel);

        loginPanel.setBackground(new java.awt.Color(200, 200, 200,150));

        studentLogTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentLogTextFieldActionPerformed(evt);
            }
        });

        studentLogLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studentLogLabel.setText("Student Number");

        passwordLogLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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

        loginLabel.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Login");

        jToggleButton3.setText("Login");
        jToggleButton3.setEnabled(false);

        jToggleButton4.setText("Register");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentLogTextField)
                            .addComponent(passwordLogTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(clearLogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))))
                    .addComponent(passwordLogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentLogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(loginLabel)
                .addGap(18, 18, 18)
                .addComponent(studentLogLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentLogTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLogLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLogTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton)
                    .addComponent(clearLogButton))
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", loginPanel);

        registerPanel.setBackground(new java.awt.Color(200, 200, 200,150));
        registerPanel.setForeground(new java.awt.Color(153, 153, 153));
        registerPanel.setLayout(null);

        registrationLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        registrationLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationLabel1.setText("Registration");
        registerPanel.add(registrationLabel1);
        registrationLabel1.setBounds(0, 40, 350, 32);

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameLabel.setText("Name");
        registerPanel.add(nameLabel);
        nameLabel.setBounds(20, 80, 37, 30);

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
        firstNameTextField.setBounds(70, 80, 120, 30);

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
        lastNameTextField.setBounds(190, 80, 150, 30);

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailLabel.setText("Email");
        registerPanel.add(emailLabel);
        emailLabel.setBounds(20, 120, 37, 16);

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
        emailTextField.setBounds(70, 110, 270, 30);

        sexLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sexLabel.setText("Sex");
        registerPanel.add(sexLabel);
        sexLabel.setBounds(20, 150, 30, 16);

        sexButtonGroup.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        registerPanel.add(jRadioButton1);
        jRadioButton1.setBounds(70, 140, 62, 21);

        sexButtonGroup.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        registerPanel.add(jRadioButton2);
        jRadioButton2.setBounds(160, 140, 61, 21);

        studentRegLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        studentRegLabel.setText("Student Number");
        registerPanel.add(studentRegLabel);
        studentRegLabel.setBounds(20, 170, 100, 22);

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
        studentRegTextField.setBounds(120, 170, 220, 22);

        birthDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        birthDateLabel.setText("Birth date");
        registerPanel.add(birthDateLabel);
        birthDateLabel.setBounds(20, 200, 65, 16);

        passwordRegLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passwordRegLabel.setText("Password");
        registerPanel.add(passwordRegLabel);
        passwordRegLabel.setBounds(20, 350, 60, 16);

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        registerPanel.add(registerButton);
        registerButton.setBounds(210, 380, 106, 23);

        clearRegButton.setText("Clear");
        clearRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearRegButtonActionPerformed(evt);
            }
        });
        registerPanel.add(clearRegButton);
        clearRegButton.setBounds(50, 380, 106, 23);

        contactLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        contactLabel.setText("Contact #");
        registerPanel.add(contactLabel);
        contactLabel.setBounds(20, 230, 60, 22);

        addressLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addressLabel1.setText("Address");
        registerPanel.add(addressLabel1);
        addressLabel1.setBounds(20, 260, 50, 22);

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
        addressTextField.setBounds(80, 260, 260, 30);

        sexLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sexLabel1.setText("Program");
        registerPanel.add(sexLabel1);
        sexLabel1.setBounds(20, 290, 50, 16);

        programComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year-Section" }));
        programComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programComboBox2ActionPerformed(evt);
            }
        });
        registerPanel.add(programComboBox2);
        programComboBox2.setBounds(80, 320, 120, 22);

        programComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course", "Bachelor of Science in Computer Engineering", "Bachelor of Science in Hospitality Management", "Bachelor of Science in Information Technology", "Bachelor of Science in Office Administration" }));
        registerPanel.add(programComboBox1);
        programComboBox1.setBounds(80, 290, 260, 22);

        contactTextField.setForeground(new java.awt.Color(0, 0, 0));
        contactTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactTextFieldFocusGained(evt);
            }
        });
        registerPanel.add(contactTextField);
        contactTextField.setBounds(80, 230, 260, 30);

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
        passwordRegField.setBounds(80, 340, 260, 30);
        registerPanel.add(birthDateChooser);
        birthDateChooser.setBounds(80, 200, 260, 22);

        jToggleButton1.setText("Login");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        registerPanel.add(jToggleButton1);
        jToggleButton1.setBounds(190, 0, 80, 30);

        jToggleButton2.setText("Register");
        jToggleButton2.setEnabled(false);
        registerPanel.add(jToggleButton2);
        jToggleButton2.setBounds(270, 0, 80, 30);

        jTabbedPane1.addTab("Registration", registerPanel);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, -35, 350, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservationsystem/PUPPQ3 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 530));

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
        
        // Validate the inputs
        if (firstName.equals("First Name") || firstName.isEmpty() || lastName.equals("Last Name") || lastName.isEmpty() || email.equals("example@example.com") || email.isEmpty() ||
                studentNumber.equals("****-*****-PQ-0") || studentNumber.isEmpty() || birthDate.isEmpty() || contactNumber.isEmpty() ||
                address.isEmpty() || programCourse.isEmpty() || password.equals("must contain at least 8 characters") || password.isEmpty())  {
            JOptionPane.showMessageDialog(rootPane, "All fields are required!");
            return;
        }
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            JOptionPane.showMessageDialog(rootPane, "Invalid email format!");
            return;
        }
        if (!studentNumber.matches("\\d{4}-\\d{5}-PQ-\\d")) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Student Number '****-*****-PQ-0'!");
            return;
        }
        if (!contactNumber.matches("09\\d{9}")) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Contact Number");
            return;
        }
        if (password.length() < 8) {
            JOptionPane.showMessageDialog(rootPane, "Password must contain at least 8 characters!");
            return;
        }
        
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
               
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

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JPanel homepagePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
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
