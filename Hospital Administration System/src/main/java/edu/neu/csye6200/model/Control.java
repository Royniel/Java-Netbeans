/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye6200.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 91790
 */
public class Control {
    //Creating method to reuse jdbc connection code
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=OOD-Final-db;encrypt=true;trustServerCertificate=true";
    private static final String USER = "shreyadmin";
    private static final String PASSWORD = "oodadmin";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
