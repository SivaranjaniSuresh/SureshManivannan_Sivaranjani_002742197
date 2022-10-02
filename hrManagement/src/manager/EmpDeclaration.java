/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manager;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author sivaranjanisuresh
 */
public class EmpDeclaration {
    private String Name;
    private int EmployeeID;
    private int Age;
    private String Gender;
    private String StartDate;
    private String Level;
    private String TeamInfo;
    private String PositionTitle;
    private String PhoneNumber;
    private String EmailAddress;
    private ImageIcon EmployeeImage;

    public ImageIcon getEmployeeImage(int width, int height, int SCALE_SMOOTH) {
        return EmployeeImage;
    }

    public void setEmployeeImage(ImageIcon EmployeeImage) {
        this.EmployeeImage = (ImageIcon) EmployeeImage;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

  
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDate() {
        return StartDate;
    }

    public void setDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getTeamInfo() {
        return TeamInfo;
    }

    public void setTeamInfo(String TeamInfo) {
        this.TeamInfo = TeamInfo;
    }

    public String getPositionTitle() {
        return PositionTitle;
    }

    public void setPositionTitle(String PositionTitle) {
        this.PositionTitle = PositionTitle;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public String toString(){
        return Name;
    }

   
}
