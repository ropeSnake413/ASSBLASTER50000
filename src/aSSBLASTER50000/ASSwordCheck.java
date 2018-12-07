package aSSBLASTER50000;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ASSwordCheck {
	String user, assword;
	
	
	//spicy constructor
	public ASSwordCheck() {

		}

	
	//CONNECTS TO THE SQL DATABASE
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
	
	
	//checks the supplied credentials to see if they match any in the database
	//returns an error if bad credentials are input
	//returns a welcome screen if they are good
	//password is case sensitive, user is not
	public int idCheck(String use, String pass) {
		String sql = "SELECT id, name, username, password FROM doctors";
		int rtn=1;

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

						rtn=rs.getInt(1);
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
