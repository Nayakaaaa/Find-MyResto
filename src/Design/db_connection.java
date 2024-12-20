/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design;

import java.sql.*;

/**
 *
 * @author REYHAN NAYAKA UTOMO_2311103071
 */
public class db_connection {
    static final String URL ="jdbc:mysql://localhost:3306/myresto";
    static final String USER ="root";
    static final String PASSWORD ="";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

