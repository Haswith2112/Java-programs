package com.Multithreading;

import java.util.Scanner;

class Operation11 implements Runnable{
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("add")) {
			add();
		}
		else if(Thread.currentThread().getName().equals("mul")) {
			mul();
		}
			else if(Thread.currentThread().getName().equals("print1")) {
				print1();
			}
				else {
					print2();
				}
			}
	public void add() {
		System.out.println("addition operation started");
		System.out.println("enter the first number : ");
		int add1 = sc.nextInt();
		System.out.println("enter the second number : ");
		int add2 = sc.nextInt();
		int res = add1+add2;
		System.out.println("the result is : "+res);
		System.out.println("addition operation completed");
	}
	
	 
	public void mul() {
		System.out.println("Multiplication operation started");
		System.out.println("enter the first number : ");
		int mul1 = sc.nextInt();
		System.out.println("enter the second number : ");
		int mul2 = sc.nextInt();
		int res2 = mul1 * mul2;
		System.out.println("the result is : "+res2);
		System.out.println("Multiplication operation completed");
	}
	
	public void print1() {
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
	public void print2() {
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
	public class  MultithreadingRunnaableMethod {
		 public static void main(String[] args) throws InterruptedException {
			
			Operation11 o1 = new Operation11();
			Operation11 o2 = new Operation11();
			Operation11 o3 = new Operation11();
			Operation11 o4 = new Operation11();
			
			System.out.println(o1);
			System.out.println(o2);
			System.out.println(o3);
			System.out.println(o4);	
			System.out.println("================================");
			
			Thread op1 = new Thread(o1);
			Thread op2 = new Thread(o2);
			Thread op3 = new Thread(o3);
			Thread op4 = new Thread(o4);
			 
			op1.setName("add");
			op2.setName ("mul");
			op3.setName ("print1");
			op4.setName ("print2");
			
			System.out.println(op1);
			System.out.println(op2);
			System.out.println(op3);
			System.out.println(op4);	
			System.out.println("================================");
			
			
			op1.start();
			op2.start();
			op3.start();
			op4.start();
			
			
		}
	}

	

 
