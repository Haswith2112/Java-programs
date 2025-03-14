 package com.jdbcmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class CrudOperations1{
	private Connection con;
	private PreparedStatement pstmt;
	public static Scanner sc = new Scanner(System.in);
	
	public CrudOperations1(Connection con) {
		this.con = con;
	}
	
	 
	
	public boolean updateEmployeeData() {
		try {
	     String sql_query = "update employee set name=?,phno=?,email=?,salary=salary*1.05 where id=?";
		 pstmt = con.prepareStatement(sql_query);
		 System.out.println("Enter the emp eid:");
		 int eid = sc.nextInt();
		 System.out.println("Enter the emp new ename:");
		 String ename = sc.next();
		 System.out.println("Enter the emp new phno:");
		 long phno = sc.nextLong();
		 System.out.println("Enter the emp new  email:");
		 String email = sc.next();
		 
		 
		 //allocating values to the holder
		 
		 pstmt.setInt(4,  eid);
		 pstmt.setString(1,  ename);
		 pstmt.setLong(2,  phno);
		 pstmt.setString(3,  email);
		 
		 int x = pstmt.executeUpdate();
		 if(x > 0) {
			 return true;
		 }
		 else {
			 return false;
		 }
		}
		catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
}

public class JDBCUpdateData {
     private static Connection con;
     private static PreparedStatement pstmt;
     
     public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("Driver is loaded");
			 Scanner sc = new Scanner(System.in);
			 //step-2: Establish the connection
			String url = "jdbc:mysql://localhost:3306/jdbcProgramming";
			String user = "root";
			String pwd = "Bhanu@6080";
			con = DriverManager.getConnection(url, user,  pwd);
			if(con != null) {
				System.out.println("Connection Established to the DB");
				CrudOperations1 co = new CrudOperations1(con);
				boolean b = co.updateEmployeeData();
				if (b==true) {
					System.out.println("Data  updated");
				}
				else {
					System.out.println("Data not  updated");
				}
				
			}
			else {
				System.out.println("Could not initiate the connection");
				System.exit(0);
			}
			
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
		 finally {
			 try {
				   con.close();
			 }
			 catch (SQLException e){
				 System.out.println("Closing the statement had an issues");
			 }
		 }
	}	
}
