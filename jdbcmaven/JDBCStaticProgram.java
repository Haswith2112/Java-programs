 package com.jdbcmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JDBCStaticProgram {
	private static Connection con;
	static Statement stmt;
	public static void main(String[] args) {
		 try {
			 //step-1: Load the Driver
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("Driver is loaded");
			 
			 //step-2: Establish the connection
			String url = "jdbc:mysql://localhost:3306/jdbcProgramming";
			String user = "root";
			String pwd = "Bhanu@6080";
			con = DriverManager.getConnection(url, user,  pwd);
			if(con != null) {
				System.out.println("Connection Established to the DB");
			}
			else {
				System.out.println("Could not initiate the connection");
			}
			
			//step-3: Statement Creation
			String sql_query = "insert into employee values(1,'Bhanu','TCS',50000,6304750769,'Bhanu@tcs.com')";
			stmt = con.createStatement();
			
			//step-4: Execute query and collect the result
			int x = stmt.executeUpdate(sql_query);
			if(x >0) {
				System.out.println("Data is inserted");
			}
			else {
				System.out.println("Data is not inserted");
			}
			
		 }
		 catch(Exception e) {
			  e.printStackTrace();
		 }
		 
		 //step-5: close all the active connections
		 finally {
			 try {
				  stmt.close();
				   con.close();
			 }
			 catch (SQLException e){
				 System.out.println("Closing the statement had an issues");
			 }
		 }
		
	}

}
