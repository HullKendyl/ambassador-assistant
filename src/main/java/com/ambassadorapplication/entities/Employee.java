package com.ambassadorapplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String department;
    private String positionTitle;
    private String favoriteThings;
    private String importantNotes;
    private String startDate;
    private String endDate;
    private String threeMonthAnniversaryDate;
    private String sixMonthAnniversaryDate;
    private String oneYearAnniversaryDate;

    public Employee(){}

    public Employee(String firstName, String lastName, String department, String positionTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.positionTitle = positionTitle;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getDepartment() {
        return department;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public String getFavoriteThings() {
        return favoriteThings;
    }

    public String getImportantNotes() {
        return importantNotes;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getThreeMonthAnniversaryDate() {
        return threeMonthAnniversaryDate;
    }

    public String getSixMonthAnniversaryDate() {
        return sixMonthAnniversaryDate;
    }

    public String getOneYearAnniversaryDate() {
        return oneYearAnniversaryDate;
    }
}