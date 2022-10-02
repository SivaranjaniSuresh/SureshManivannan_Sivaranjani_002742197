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
    private int employeeId;
    private int Age;
    private String Gender;
    private String startDate;
    private String Level;
    private String teamInfo;
    private String positionTitle;
    private String phoneNumber;
    private String emailAddress;
    private ImageIcon employeeImage;

    public ImageIcon getemployeeImage(int width, int height, int SCALE_SMOOTH) {
        return employeeImage;
    }

    public void setemployeeImage(ImageIcon employeeImage) {
        this.employeeImage = (ImageIcon) employeeImage;
    }

    public String getstartDate() {
        return startDate;
    }

    public void setstartDate(String startDate) {
        this.startDate = startDate;
    }

  
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getemployeeId() {
        return employeeId;
    }

    public void setemployeeId(int employeeId) {
        this.employeeId = employeeId;
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
        return startDate;
    }

    public void setDate(String startDate) {
        this.startDate = startDate;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getteamInfo() {
        return teamInfo;
    }

    public void setteamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public String getpositionTitle() {
        return positionTitle;
    }

    public void setpositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getemailAddress() {
        return emailAddress;
    }

    public void setemailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
