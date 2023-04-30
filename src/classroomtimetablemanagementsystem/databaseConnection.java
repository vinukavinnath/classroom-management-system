/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classroomtimetablemanagementsystem;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vinuka
 */
public class databaseConnection {
    
    
	static Connection connection()
	{
		try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablemanagement","root","");
                    return con;
		}catch(Exception e){
                    return null;
		}
	}
}
