package ipa;

import java.sql.*;

public class SqlExp {
	
	int i;
	public SqlExp() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/db1";
			Connection conn = DriverManager.getConnection(url,"root","root");
			Statement st = conn.createStatement();
			st.execute("INSERT INTO Customers VALUES (35, 'vishal', 27, 'pune', 2001.22)");

			PreparedStatement stmt=conn.prepareStatement("insert into Customers values(?,?,?,?,?)");
			stmt.setInt(1, 34);
			stmt.setString(2, "dfl");
			stmt.setInt(3, 45);
			stmt.setString(4, "fdfdf");
			stmt.setInt(5, 45435);
			
			stmt.setInt(1, 33);
			stmt.setString(2, "dfl");
			stmt.setInt(3, 45);
			stmt.setString(4, "fdfdf");
			stmt.setInt(5, 45435);
			
			//stmt.addBatch("INSERT INTO Customers VALUES (38, 'vishal', 27, 'pune', 2001.22)");
			//stmt.addBatch("INSERT INTO Customers VALUES (39, 'vishal', 27, 'pune', 2001.22)");
			//stmt.executeBatch();
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted"); 
			
			conn.close();
			System.out.println("success");
		} catch (Exception e) {
			System.err.println("Got an exception! "+e);
			System.err.println(e.getMessage());
		}

	}
}
