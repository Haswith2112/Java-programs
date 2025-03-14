package com.jdbcmaven;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCCallableStatementCode1 {
	private static Connection con;

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String pwd = "Bhanu@6080";
		con = DriverManager.getConnection(url, user,  pwd);
		System.out.println("Connected to the DB");
		
		CallableStatement call = con.prepareCall("{call app(?,?)}");
		call.setInt(1, 2);
		call.setString(2, "Prakash");
		
		boolean res = call.execute();
		if(res == true) {
			System.out.println("Data is ready to be fetched");
		}
		else {
			System.out.println("Data is updated");
		}
	}

}
