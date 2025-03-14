package com.jdbcmaven;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
 
public class JDBCCallableStatementCode2 {
	private static Connection con;

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String pwd = "Bhanu@6080";
		con = DriverManager.getConnection(url, user,  pwd);
		System.out.println("Connected to the DB");
		
		con.setAutoCommit(false);
		CallableStatement call = con.prepareCall("{call app(?,?)}");
		call.setInt(1, 7);
		call.setString(2, "Mahesh");
		
		call.execute();
		
	    call = con.prepareCall("{call app(?,?)}");
		call.setInt(1, 8);
		call.setString(2, "Nagesh");
		
		int x = call.executeUpdate();
		if(x>0) {
			System.out.println("data updated");
		}
		else {
			System.out.println("data not updated");
		}
		con.commit();
		
		
	}

}
