package com.Multithreading;

import java.util.Scanner;

public class MultithreadingProblemWithSingleThread {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("addition operation started");
		System.out.println("enter the first number : ");
		int add1 = sc.nextInt();
		System.out.println("enter the second number : ");
		int add2 = sc.nextInt();
		int res = add1 + add2;
		System.out.println("the result is : "+res);
		System.out.println("addition operation completed");
		
		System.out.println("Multiplication operation started");
		System.out.println("enter the first number : ");
		int mul1 = sc.nextInt();
		System.out.println("enter the second number : ");
		int mul2 = sc.nextInt();
		int res2 = mul1 * mul2;
		System.out.println("the result is : "+res2);
		System.out.println("Multiplication operation completed");
		
		System.out.println("printing-1 started");
		for(int i=1;i<=5;i++) {
			System.out.println("happy diwali");
			Thread.sleep(4000);
		}
		System.out.println("printing-1 completed");
		
		System.out.println("printing-2 started");
		for(int i=1;i<=5;i++) {
			System.out.println("happy  Sankranthi");
			Thread.sleep(4000);
		}
		System.out.println("printing-2 completed");
	}

}
