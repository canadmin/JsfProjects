package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	

	
	public Connection Baglan() throws SQLException {
		 String user="postgres";
		 String url="jdbc:postgresql://localhost:5432/test";
		 String pass="Postgre123";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println(con);
			return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	
	}
	

}
