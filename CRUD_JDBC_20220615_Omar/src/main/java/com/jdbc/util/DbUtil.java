package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Omar2@isha");
	}
	
	public static void closeConnection(Connection con, Statement stmt) {
		
		try {
			if(stmt!=null) {
				stmt.close();
			}
			if(con!=null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
public static void closeConnection(Connection con, Statement stmt,ResultSet rs) {
		
		try {
			if(rs!=null)
			{
				rs.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
			if(con!=null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
