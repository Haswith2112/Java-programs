package com.java.statements;

import java.util.Scanner;

public class NestedifelseStatements {

	public static void main(String[] args) {
		int accno = 111;
		int pwd = 222;
		
		int accno_new;
		int pwd_new;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the accno: ");
		accno_new = sc.nextInt();
		System.out.println("Enter the ped: ");
		pwd_new = sc.nextInt();
		
		if (accno ==accno_new) {
			if(pwd == pwd_new) {
				System.out.println("valid credentials");
		}
			else {
				System.out.println("Invalid password");
			}
			
		}
		
		else {
			System.out.println("Invalid account number");
		}
		

	}

}
