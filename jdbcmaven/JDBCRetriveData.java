
package com.jdbcmaven;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class CrudOperations2{
	private Connection con;
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet res;
	public static Scanner sc = new Scanner(System.in);
	
	public CrudOperations2(Connection con) {
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
	public void employeeAllData() {
		try {
			String sql_query = "select * from employee";
			stmt = con.createStatement();
			res = stmt.executeQuery(sql_query);
			while (res.next()==true) {
				System.out.println(res.getInt(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
				System.out.println(res.getInt(4));
				System.out.println(res.getLong(5));
				System.out.println(res.getString(6));
                System.out.println("======================");
			}
		}
		catch (Exception e) {
             e.printStackTrace();	
         }
	}
	public void employeeSpecificData() {
		try {
			String sql_query = "select * from employee where id=?";
			pstmt = con.prepareStatement(sql_query);
			System.out.println("Enter the employee id: ");
			pstmt.setInt(1, sc.nextInt());
			res = pstmt.executeQuery();
			while (res.next()==true) {
				System.out.println(res.getInt(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
				System.out.println(res.getInt(4));
				System.out.println(res.getLong(5));
				System.out.println(res.getString(6));
                System.out.println("======================");
			}
		}
		catch (Exception e) {
             e.printStackTrace();	
         }
	
	}
	
}

public class  JDBCRetriveData {
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
				CrudOperations2 co = new CrudOperations2(con);
//				boolean b = co.updateEmployeeData();
//				if (b==true) {
//					System.out.println("Data  updated");
//				}
//				else {
//					System.out.println("Data not  updated");
//				}
				co.employeeAllData();
				co.employeeSpecificData();
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
