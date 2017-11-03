package _FDS_;

import java.io.IOException;
import java.sql.SQLException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class Main {

	public static void main(String[] args) throws SQLException, JsonGenerationException, JsonMappingException, IOException {
		
		Get tc = new Get();
		Insert rd = new Insert();
		
		tc.getDataLocation();
		tc.getDataSensor();
		tc.getDataTotal_Rain_Fall();
		tc.getDataWater_Level();
		tc.getDataWater_Speed();
		tc.getDataWind_Direction();
		
		rd.readFile();
		
		
	}
}
	
	/*public void setUp() {
		
		System.out.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}

		System.out.println("MySQL JDBC Driver Connected!");
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fds","alma", "alma28");
			
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
		if (connection != null) {
			System.out.println("Connect to database successfully!");	
		} else {
			System.out.println("Failed to make connection!");
		}
	}
}*/
//}


