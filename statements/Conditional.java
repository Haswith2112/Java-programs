package com.java.statements;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		if(age < 18) {
			System.out.println("You are still a kid.You are not eligible");
		}
		 
		
		else if(age >60) {
			System.out.println("You are already a senier citizen .You are not eligible");
		}
		else {
			System.out.println(" eligible for marrige ");
		}
		 
	}

}
