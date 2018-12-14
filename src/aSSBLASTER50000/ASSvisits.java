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
		String sql = "SELECT visitid, date, patientid, diagnosis, medicine FROM visits";
		try {
			Connection conn = connect();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int i=0;
				rs.getRow();
				if(rs.getInt(4)==ID) {
					String x=rs.getString(2);
					//System.out.println(x);
					String y=rs.getString(3);
					//System.out.println(y);
					obj.add(new ComboObject(x,y));
				}
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}

		return list;
		
	}
	
	
	public int findPatId(String name) {
		int ID=-1;
		String sql = "SELECT id, name, phone, docid FROM patients";
		try {
		Connection conn = connect();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			if(rs.getString(2).equalsIgnoreCase(name)) {
				ID=rs.getInt(1);
				System.out.println("<><><><><><>"+ID);
			}
		}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return ID;
	}
}
