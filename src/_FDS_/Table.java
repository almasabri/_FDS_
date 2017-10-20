package _FDS_;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Table extends Connect {

	public ArrayList<String> getDataLocation() throws SQLException {
		
		Connect con1 = new Connect();
		Connection con = con1.initData();
		
		
			String sqlL = "SELECT * FROM location";
			
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery(sqlL);
				ArrayList<String> array = new ArrayList<String>();
				while (rs.next()) {
					System.out.println(rs.getString("COORDINATE_RIVERS_ID") + "," + rs.getString("LATITUDE") + "," + rs.getString("LONGTITUDE") + "," + rs.getString("REGION") + "," + rs.getString("DISTRICT") + "," + rs.getString("REGION") + "," + rs.getString("COUNTRY"));
					System.out.println();
				}
				return array;	
	}
				
	
	
	
	public void getDataSensor() throws SQLException {
		
		Connect con2 = new Connect();
		Connection con = con2.initData();
		
			String sqlS = "SELECT * FROM sensor";
		
				Statement sa = con.createStatement();
				ResultSet rsa = sa.executeQuery(sqlS);
				while (rsa.next()) {
					System.out.println(rsa.getString("MICRO_CONTROL_ID") + "," + rsa.getString("COORDINATE_RIVERS_ID") + "," + rsa.getString("BATTERY_LEVEL") + "," + rsa.getString("ALERT_STATUS"));
					System.out.println();
				}
	}
	
	
	public void getDataTotal_Rain_Fall() throws SQLException {
		
		Connect con3 = new Connect();
		Connection con = con3.initData();
		
			String sqlS = "SELECT * FROM total_rain_fall";
		
				Statement sb = con.createStatement();
				ResultSet rsb = sb.executeQuery(sqlS);
				while (rsb.next()) {
					System.out.println(rsb.getString("MICRO_CONTROL_ID") + "," + rsb.getString("TRF_SENSOR") + "," + rsb.getString("TIMESTAMP") + "," + rsb.getString("VALUES_TRF"));
					System.out.println();
				}
	}
	
	
	
	public void getDataWater_Level() throws SQLException {
		
		Connect con4 = new Connect();
		Connection con = con4.initData();
		
			String sqlWL = "SELECT * FROM water_level";
		
				Statement sc = con.createStatement();
				ResultSet rsc = sc.executeQuery(sqlWL);
				while (rsc.next()) {
					System.out.println(rsc.getString("MICRO_CONTROL_ID") + "," + rsc.getString("WTL_SENSOR") + "," + rsc.getString("TIMESTAMP") + "," + rsc.getString("VALUES_TRF"));
					System.out.println();
				}
	}
	
	
	
	public void getDataWater_Speed() throws SQLException {
		
		Connect con5 = new Connect();
		Connection con = con5.initData();
		
			String sqlWS = "SELECT * FROM water_speed";
		
				Statement sd = con.createStatement();
				ResultSet rsd = sd.executeQuery(sqlWS);
				while (rsd.next()) {
					System.out.println(rsd.getString("MICRO_CONTROL_ID") + "," + rsd.getString("WTL_SENSOR") + "," + rsd.getString("TIMESTAMP") + "," + rsd.getString("VALUES_TRF"));
					System.out.println();
				}
	}
	
	
	public void getDataWind_Direction() throws SQLException {
		
		Connect con6 = new Connect();
		Connection con = con6.initData();
		
			String sqlWD = "SELECT * FROM wind_direction";
		
				Statement se = con.createStatement();
				ResultSet rse = se.executeQuery(sqlWD);
				while (rse.next()) {
					System.out.println(rse.getString("MICRO_CONTROL_ID") + "," + rse.getString("WTL_SENSOR") + "," + rse.getString("TIMESTAMP") + "," + rse.getString("VALUES_TRF"));
					System.out.println();
				}
	}
	
	
	
	
	
	
	
				
			
			
	}
		
	

