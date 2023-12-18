/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

/**
 *
 * @author Admin
 */
public class Patient {
    private int id;
    private String firstName;
    private String lastName;
    private String description;
    private String doctorName;
    private String lastVisitDate;

    public Patient(int id, String firstName, String lastName, String description, String doctorName, String lastVisitDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.doctorName = doctorName;
        this.lastVisitDate = lastVisitDate;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    public String getLastVisitDate() { return lastVisitDate; }
    public void setLastVisitDate(String lastVisitDate) { this.lastVisitDate = lastVisitDate; }
}
