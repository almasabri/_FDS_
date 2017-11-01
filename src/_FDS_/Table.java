package _FDS_;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Table extends Connect {

	public String getDataLocation() throws SQLException, JsonGenerationException, JsonMappingException, IOException {
		
		Connect con1 = new Connect();
		Connection con = con1.initData();
		//ArrayList<String> array = new ArrayList<String>();
		ObjectMapper mapper = new ObjectMapper();
		
		String sqlL = "SELECT * FROM location";
		//String jsonString;
					
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery(sqlL);
				
				while (rs.next()) {
					
					//Array
					//array.add(rs.getString("COORDINATE_RIVERS_ID") + "," + rs.getString("LATITUDE") + "," + rs.getString("LONGTITUDE") + "," + rs.getString("REGION") + "," + rs.getString("DISTRICT") + "," + rs.getString("REGION") + "," + rs.getString("COUNTRY"));
					
					System.out.println(rs.getString("COORDINATE_RIVERS_ID") + "," + rs.getString("LATITUDE") + "," + rs.getString("LONGTITUDE") + "," + rs.getString("REGION") + "," + rs.getString("DISTRICT") + "," + rs.getString("REGION") + "," + rs.getString("COUNTRY"));
					
					//JSON
					String jsonString = mapper.writeValueAsString(rs.getString("COORDINATE_RIVERS_ID") + "," + rs.getString("LATITUDE") + "," + rs.getString("LONGTITUDE") + "," + rs.getString("REGION") + "," + rs.getString("DISTRICT") + "," + rs.getString("REGION") + "," + rs.getString("COUNTRY"));
					
					System.out.println("In JSON:" + jsonString);
					
					//jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rs.getString("COORDINATE_RIVERS_ID") + "," + rs.getString("LATITUDE") + "," + rs.getString("LONGTITUDE") + "," + rs.getString("REGION") + "," + rs.getString("DISTRICT") + "," + rs.getString("REGION") + "," + rs.getString("COUNTRY"));
					
					//System.out.println("In JSON2:" + jsonString);
					
					System.out.println("");
					//return jsonString;
					
					
				}

				
					//for(int i=0 ; i<array.size(); i++) {
						
						//array.get(i);
						
						//jsonString = mapper.writeValueAsString(array.get(i));
						//jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(array.get(i));
						//System.out.println("In JSON:" + jsonString);
						
						
						//jsonString = mapper.writeValueAsString(rs.getString("COORDINATE_RIVERS_ID") + "," + rs.getString("LATITUDE") + "," + rs.getString("LONGTITUDE") + "," + rs.getString("REGION") + "," + rs.getString("DISTRICT") + "," + rs.getString("REGION") + "," + rs.getString("COUNTRY"));
						
						//System.out.println("In JSON:" + jsonString);
						
						//jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rs.getString("COORDINATE_RIVERS_ID") + "," + rs.getString("LATITUDE") + "," + rs.getString("LONGTITUDE") + "," + rs.getString("REGION") + "," + rs.getString("DISTRICT") + "," + rs.getString("REGION") + "," + rs.getString("COUNTRY"));
						
						//System.out.println("In JSON2:" + jsonString);
					
						System.out.println();
				//}
				
				//System.out.println("In Array:" + array);	
				
				System.out.println("\n\n");
				//return array;	
				//return jsonString;
				return toString();
				
				
	}
				
	
	
	
	public String getDataSensor() throws SQLException {
		
		Connect con2 = new Connect();
		Connection con = con2.initData();
		//ArrayList<String> array1 = new ArrayList<String>();
		
		String sqlS = "SELECT * FROM sensor";
		
				Statement sa = con.createStatement();
				ResultSet rsa = sa.executeQuery(sqlS);
				
				while (rsa.next()) {
					//array1.add(rsa.getString("MICRO_CONTROL_ID") + "," + rsa.getString("COORDINATE_RIVERS_ID") + "," + rsa.getString("BATTERY_LEVEL") + "," + rsa.getString("ALERT_STATUS"));
					System.out.println(rsa.getString("MICRO_CONTROL_ID") + "," + rsa.getString("COORDINATE_RIVERS_ID") + "," + rsa.getString("BATTERY_LEVEL") + "," + rsa.getString("ALERT_STATUS"));
					System.out.println();
				}
				
				/*for(int i=0 ; i<array1.size(); i++) {
					array1.get(i);
				}
				System.out.println(array1);	*/
				System.out.println("\n\n");
				//return array1;
				return sqlS;
	}
	
	
	public String getDataTotal_Rain_Fall() throws SQLException {
		
		Connect con3 = new Connect();
		Connection con = con3.initData();
		//ArrayList<String> array2 = new ArrayList<String>();
		
			String sqlTRF = "SELECT * FROM total_rain_fall";
		
				Statement sb = con.createStatement();
				ResultSet rsb = sb.executeQuery(sqlTRF);
				
				
				while (rsb.next()) {
					//array2.add(rsb.getString("MICRO_CONTROL_ID") + "," + rsb.getString("TRF_SENSOR") + "," + rsb.getString("TIMESTAMP") + "," + rsb.getString("VALUES_TRF"));
					System.out.println(rsb.getString("MICRO_CONTROL_ID") + "," + rsb.getString("TRF_SENSOR") + "," + rsb.getString("TIMESTAMP") + "," + rsb.getString("VALUES_TRF"));
				}
				
				/*for(int i=0 ; i<array2.size(); i++) {
					array2.get(i);
				}
				System.out.println(array2);	*/
				System.out.println("\n\n");
				//return array2;
				return sqlTRF;
	}
	
	
	
	public String getDataWater_Level() throws SQLException {
		
		Connect con4 = new Connect();
		Connection con = con4.initData();
		//ArrayList<String> array3 = new ArrayList<String>();
		
			String sqlWL = "SELECT * FROM water_level";
		
				Statement sc = con.createStatement();
				ResultSet rsc = sc.executeQuery(sqlWL);
				
				while (rsc.next()) {
					//array3.add(rsc.getString("MICRO_CONTROL_ID") + "," + rsc.getString("WTL_SENSOR") + "," + rsc.getString("TIMESTAMP") + "," + rsc.getString("VALUES_WTL"));
					System.out.println(rsc.getString("MICRO_CONTROL_ID") + "," + rsc.getString("WTL_SENSOR") + "," + rsc.getString("TIMESTAMP") + "," + rsc.getString("VALUES_WTL"));
					System.out.println();
				}
				/*for(int i=0 ; i<array3.size(); i++) {
					array3.get(i);
				}*/
				//return array3;
				return sqlWL;
				
	}
	
	
	
	public String getDataWater_Speed() throws SQLException {
		
		Connect con5 = new Connect();
		Connection con = con5.initData();
		//ArrayList<String> array4 = new ArrayList<String>();
		
			String sqlWS = "SELECT * FROM water_speed";
		
				Statement sd = con.createStatement();
				ResultSet rsd = sd.executeQuery(sqlWS);
				
				while (rsd.next()) {
					//array4.add(rsd.getString("MICRO_CONTROL_ID") + "," + rsd.getString("WTS_SENSOR") + "," + rsd.getString("TIMESTAMP") + "," + rsd.getString("VALUES_WTS"));
					System.out.println(rsd.getString("MICRO_CONTROL_ID") + "," + rsd.getString("WTS_SENSOR") + "," + rsd.getString("TIMESTAMP") + "," + rsd.getString("VALUES_WTS"));
					System.out.println();
				}
				/*for(int i=0 ; i<array4.size(); i++) {
					array4.get(i);
				}*/
				//return array4;
				return sqlWS;
	}
	
	
	public String getDataWind_Direction() throws SQLException {
		
		Connect con6 = new Connect();
		Connection con = con6.initData();
		//ArrayList<String> array5 = new ArrayList<String>();
		
			String sqlWD = "SELECT * FROM wind_direction";
		
				Statement se = con.createStatement();
				ResultSet rse = se.executeQuery(sqlWD);
				
				while (rse.next()) {
					//array5.add(rse.getString("MICRO_CONTROL_ID") + "," + rse.getString("WDN_SENSOR") + "," + rse.getString("TIMESTAMP") + "," + rse.getString("VALUES_WDN"));
					System.out.println(rse.getString("MICRO_CONTROL_ID") + "," + rse.getString("WDN_SENSOR") + "," + rse.getString("TIMESTAMP") + "," + rse.getString("VALUES_WDN"));
					System.out.println();
				}
				/*for(int i=0 ; i<array5.size(); i++) {
					array5.get(i);
				}*/
				//return array5;
				return sqlWD;
	}
	
			
}
		
	

