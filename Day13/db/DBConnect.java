package db;

import java.sql.*;

public class DBConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/javadb",
					"root",
					"java1234"
					);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(conn!=null) {
			System.out.println("Congratulation!! DB Connect OK");
		}
	}

}
