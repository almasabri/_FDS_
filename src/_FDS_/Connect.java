package _FDS_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	
	Connection con = null;
	
	public Connection initData() {
		
		System.out.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			//return;
		}
		System.out.println("MySQL JDBC Driver Connected!");
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fds","alma", "alma28");
			
		} 
		catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			//return;
		}
		if (con != null) {
			System.out.println("Connect to database successfully!");	
		} else {
			System.out.println("Failed to make connection!");
		}
		return con;
	}
}

