package aSSBLASTER50000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ASSvisits {

	public ASSvisits() {
		
	}
	
	
	private Connection connect() {
		Connection conn=null;
		try {
			String url = "jdbc:sqlite:D:/SQLiteStudio/databases/doctors.db";
			conn = DriverManager.getConnection(url);
			System.out.println("Connection to SQLite has been established");
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
		
	}
	
	public ArrayList toList() {
		ArrayList<ComboObjectASS> list=new ArrayList<ComboObjectASS>();
		String sql = "SELECT visitid, date, patientid, diagnosis, medicine FROM patients";
		try {
			Connection conn = connect();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}

		return list;
		
	}
}
