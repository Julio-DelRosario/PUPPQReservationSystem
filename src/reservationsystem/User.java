/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservationsystem;

/**
 *
 * @author Julio
 */
public class User {
    private int studentID;
    private String studentNumber;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String yearSection;
    private String program;
    private String birthDate;
    private String contactNumber;
    

    public User(int studentID, String studentNumber, String password, String firstName, String lastName,String email, String yearSection, String program, String birthDate,String contactNumber) {
        this.studentID = studentID;
        this.studentNumber = studentNumber;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.yearSection = yearSection;
        this.program = program;
        this.birthDate = birthDate;
        this.contactNumber = contactNumber;
        
    }

    // Getter methods
    public int getId() { return studentID; }
    public String getStudentNumber() { return studentNumber; }
    public String getPassword() { return password; }
    public String getName() { return firstName; }
    public String getlastName() { return lastName; }
    public String getemail() { return email; }
    public String getYearSection() { return yearSection; }
    public String getprogram() { return program; }
    public String getbirthDate() { return birthDate; }
    public String getcontactNumber() { return contactNumber; }
}
