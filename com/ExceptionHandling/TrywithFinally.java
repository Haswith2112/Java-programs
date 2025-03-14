package com.ExceptionHandling;

import java.util.Scanner;

public class TrywithFinally {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num-1: ");
			int num1 = sc.nextInt();
			System.out.println("Enter the num-2: ");
			int num2 = sc.nextInt();
			int res = num1/num2;
			System.out.println(res);
		}
		finally {
			System.out.println("Hi From Finally Block");
		}
	}
}
