package aSSBLASTER50000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ASSwordCheck {
	String user, assword;
	
	

	public ASSwordCheck() {

		}

	private Connection connect() {
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
	
	
	public String idCheck(String use, String pass) {
		String sql = "SELECT id, name, username, password FROM doctors";
		String rtn="Incorrect credentials";

		try {
			Connection conn = connect();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				rs.getRow();
				String u=rs.getString(3);
				String p=rs.getString(4);

				if(u.equalsIgnoreCase(use)){
					if(p.equals(pass)) {

						rtn="Welcome, doctor "+rs.getString(2);
					}
				}
						
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return rtn;
	}
}
