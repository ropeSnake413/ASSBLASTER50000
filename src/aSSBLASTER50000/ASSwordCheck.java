package aSSBLASTER50000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ASSwordCheck {
	String user, assword;
	
	

	public ASSwordCheck(String u, String a) {
		user=u;
		assword=a;
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
}
