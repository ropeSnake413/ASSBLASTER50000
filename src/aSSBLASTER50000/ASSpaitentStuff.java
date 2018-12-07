package aSSBLASTER50000;

//yey imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ASSpaitentStuff {
	
	//spicy constructor
	public ASSpaitentStuff() {
		
	}
	
	
	
	//CONNECTS TO THE SQL DATABASE
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
	
	
	//shoves all the paitent info into an array list for easy putting into combo box
	public ArrayList toCombo(int docc) {
		ArrayList<ComboObject> obj=new ArrayList<ComboObject>();
		String sql = "SELECT id, name, phone, docid FROM patients";

		//does the connect
		try {
			Connection conn = connect();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int i=0;
				rs.getRow();
				if(rs.getInt(4)==docc) {
					String x=rs.getString(2);
					System.out.println(x);
					String y=rs.getString(3);
					System.out.println(y);
					obj.add(new ComboObject(x,y));
				}
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(SQLException e) {
			System.out.println("ERROR");
			System.out.println(e.getMessage());
		}
		
		return obj;
		
	}
	
	
	public void addPaitent(String n, String p) {
		String sql="INSERT INTO paitents(name, phone, docid) VALUES (?, ?, ?)";
		
		try {
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
