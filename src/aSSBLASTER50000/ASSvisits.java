package aSSBLASTER50000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	
	public ArrayList toList(String patName) {
		ArrayList<ComboObjectASS> list=new ArrayList<ComboObjectASS>();
		String sql = "SELECT visitid, date, patientid, diagnosis, medicine FROM visits";
		int ID=findPatId(patName);
		ArrayList<ComboObjectASS> obj=new ArrayList<ComboObjectASS>();

		try {
			Connection conn = connect();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int i=0;
				rs.getRow();
				if(rs.getInt(3)==ID) {
					String x=rs.getString(2);
					System.out.println(x);
					String y=rs.getString(4);
					System.out.println(y);
					String z=rs.getString(5);
					System.out.println(z);
					obj.add(new ComboObjectASS(x, y, z));
				}
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}

		return obj;
		
	}
	
	
	public void addVisit(String pname, String date, String diag, String prsp) {
		String sql="INSERT INTO visits(patientid, date, diagnosis, medicine) VALUES (?, ?, ?, ?)";
		int patid=findPatId(pname);
		//String patid=patidee+"";try {
		try {
			Connection conn = connect();
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, patid);
			ps.setString(2, date);
			ps.setString(3, diag);
			ps.setString(4, prsp);
			
			ps.executeUpdate();
			
			ps.close();
			conn.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
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
			}
		}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return ID;
	}
}
