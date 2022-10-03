/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rishi
 */
public class Employees {
    
    private String name;
    private int age;
    private String gender;
    private String StartDate;
    private int level;
    private String TeamInfo;
    private String PositionTitle;
    private String EmailAddress;
    private String CellPhonenumber;
    private String EmployeeId;
    private String ImagePath;

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String ImagePath) {
        this.ImagePath = ImagePath;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getCellPhonenumber() {
        return CellPhonenumber;
    }

    public void setCellPhonenumber(String CellPhonenumber) {
        this.CellPhonenumber = CellPhonenumber;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }
    
    
    
    
    
    @Override
    public String toString(){
        return name;
    }

   

   
    
    
    
          
    
}
