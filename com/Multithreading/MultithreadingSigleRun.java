 package com.Multithreading;
import java.util.Scanner;

class Operation10 extends Thread{
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
	public class MultithreadingSigleRun {
		 public static void main(String[] args) throws InterruptedException {
			
			Operation10 op1 = new Operation10();
			Operation10 op2 = new Operation10();
			Operation10 op3 = new Operation10();
			Operation10 op4 = new Operation10();
			
			op1.setName("add");
			op2.setName ("mul");
			op3.setName ("print1");
			op4.setName ("print2");
			
			
			op1.start();
			op2.start();
			op3.start();
			op4.start();
			
			
		}
	}

	

