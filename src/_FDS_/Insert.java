package _FDS_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//1) read textfile
//Read txt file tu
//Read txt file gune file reader

//2)insert query
// buat query insert into sql pulak
// insert into db

//3)update query for the data in the textpad
//Kalau nak update, query update

//Buat kat java
//Function baru



public class Insert extends Connect {
	
	public void readFile() {
	
	String filename =  "C://xampp//htdocs/FDSTestingReadFile.txt";
	String line = null;
	
	try {
		
		FileReader fileReader = new FileReader(filename);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
		
		 bufferedReader.close();
	}
	
	catch(FileNotFoundException ex) {
        System.out.println(
            "Unable to open file '" + filename + "'");                
    }
	
	catch(IOException ex) {
        System.out.println(
            "Error reading file '" + filename + "'");                  
    }
		
	
	
	}
	
	public String In () throws SQLException {
		
		Connect conA = new Connect();
		Connection conB = conA.initData();
		
		String sqlC = "Insert * INTO location";
		//String jsonString;
					
				Statement ts = con.createStatement();
				ResultSet st = ts.executeQuery(sqlC);
				return sqlC;
		
	}
}


