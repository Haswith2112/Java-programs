package com.jdbcmaven;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCScrollableCode {
	private static Connection con;
	private static Statement stmt;
	private static ResultSet res;

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("Driver is loaded");
		 Scanner sc = new Scanner(System.in);
		 String url = "jdbc:mysql://localhost:3306/jdbcProgramming";
			String user = "root";
			String pwd = "Bhanu@6080";
			con = DriverManager.getConnection(url, user,  pwd);
			
			String sql_query = "select * from Employee";
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			res = stmt.executeQuery(sql_query);
			
			res.afterLast();
			System.out.println(res.isAfterLast());
			while (res.previous()==true) {
				System.out.println(res.getInt(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
				System.out.println(res.getInt(4));
				System.out.println(res.getLong(5));
				System.out.println(res.getString(6));
                System.out.println("======================");
			}
	}

}
