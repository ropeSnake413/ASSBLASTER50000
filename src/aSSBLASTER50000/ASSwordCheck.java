package aSSBLASTER50000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ASSwordCheck {
	String user, assword;
	
	

	public ASSwordCheck(String u, String a) {
		user=u;
		assword=a;
		}

	public Connection connect() {
		Connection conn = null;
		try {
			String url = "jdbc:sqlite:D:/SQLiteStudio/databases/doctors.db";
			conn = DriverManager.getConnection(url);
			System.out.println("Connection to SQLite has been established");
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	
	public void refresh() {
		String sql = "SELECT iD, fName, lName FROM student";
		
		try {
			Connection conn = connect();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {

				
				//add row to model
				model.addRow(row);
						
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
}
