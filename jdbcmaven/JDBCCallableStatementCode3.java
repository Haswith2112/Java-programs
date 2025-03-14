package com.jdbcmaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;


public class JDBCCallableStatementCode3 {
	private static Connection con;
 	static boolean res;
	private static java.sql.CallableStatement call;

	public static void main(String[] args)  throws Exception{
		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String pwd = "Bhanu@6080";
		con = DriverManager.getConnection(url, user,  pwd);
 		Scanner sc = new Scanner(System.in);
		con.setAutoCommit(false);
		System.out.println("Please select an option:\n"
				+ "1. Update name\n"
				+ "2. View Specific Data\n"
				+ "3. Delete Specific Data\n"
				+ "4. Insert Data\n"
				+ "5. Terminate");
		int choice = sc.nextInt();
		if(choice==1) {
			call = con.prepareCall("{call update_name(?,?)}");
			System.out.println("Enter the new name: ");
			call.setString(1,  sc.next());
			System.out.println("Enter the student id: ");
			call.setInt(2,  sc.nextInt());
			int x = call.executeUpdate();
			if(x>0) {
				System.out.println("Updated");
			}
			else {
				System.out.println("Not Updated");
			}
			System.out.println("========================");		
		}
		else if (choice==2) {
			call = con.prepareCall("{call view_specific(?)}");
			System.out.println("Enter the student id: ");
			call.setInt(1, sc.nextInt());
			res = call.execute();
			if(res==true) {
				ResultSet resultSet = call.executeQuery();
				while(resultSet.next()==true) {
					System.out.println(resultSet.getInt(1)+"----"+resultSet.getString(2));
				}
			}
			System.out.println("========================");
		}
		else if(choice==3) {
			call = con.prepareCall("{call.delete_data(?)}");
			System.out.println("Enter the student id: ");
			call.setInt(1, sc.nextInt());
			res = call.execute();
 	        if(res==false) {
 	        	System.out.println("deleted");
 	        }
 	        else {
 	        	System.out.println("Not Deleted");
 	        }
 	        System.out.println("======================");
		}
		else if (choice == 4) {
	        call = con.prepareCall("{call app(?,?)}");
			System.out.println("Enter the student id: ");
			call.setInt(1, sc.nextInt());
			System.out.println("Enter the student name: ");
		    call.setString(2, sc.next());
			int x = call.executeUpdate();
			if(x>0) {
				System.out.println("Inserted");
			}
			else {
				System.out.println("Not Inserted");
			}
			System.out.println("========================");	
		}
		else {
			con.commit();
			System.out.println("Terminated......");
			System.exit(0);
 		}
		con.commit();
		main(null);	
	}
}
