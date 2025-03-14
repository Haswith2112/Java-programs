package com.Multithreading;

import java.util.Scanner;

class Operation12 extends Thread{
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		System.out.println("addition operation started");
		System.out.println("enter the first number : ");
		int add1 = sc.nextInt();
		System.out.println("enter the second number : ");
		int add2 = sc.nextInt();
		int res = add1 + add2;
		System.out.println("the result is : "+res);
		System.out.println("addition operation completed");
	}
}

class Operation13 extends Thread{
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		System.out.println("Multiplication operation started");
		System.out.println("enter the first number : ");
		int mul1 = sc.nextInt();
		System.out.println("enter the second number : ");
		int mul2 = sc.nextInt();
		int res2 = mul1 * mul2;
		System.out.println("the result is : "+res2);
		System.out.println("Multiplication operation completed");
	}
}

class Operation14 extends Thread{
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		try {
			System.out.println("printing-1 started");
			for(int i=1;i<=5;i++) {
				System.out.println("happy diwali");
				Thread.sleep(4000);
			}
			System.out.println("printing-1 completed");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
}

class Operation15 extends Thread{
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		try {
			System.out.println("printing-2 started");
			for(int i=1;i<=5;i++) {
				System.out.println("happy  Sankranthi");
				Thread.sleep(4000);
			}
			System.out.println("printing-2 completed");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
}

public class MultingthredingUsingThreadClass {
public static void main(String[] args) {
	
	Operation12 op1 = new Operation12();
	Operation13 op2 = new Operation13();
	Operation14 op3 = new Operation14();
	Operation15 op4 = new Operation15();
	
	op1.start();
	op2.start();
	op3.start();
	op4.start();
}
}
