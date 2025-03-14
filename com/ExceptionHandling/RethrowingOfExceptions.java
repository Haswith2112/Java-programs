package com.ExceptionHandling;

import java.util.Scanner;

class Operation6 {
	void Function1() throws Exception {
		System.out.println("Inside Function-1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num-1: ");
		int num1 = sc.nextInt();
		System.out.println("enter the num-2: ");
		int num2 = sc.nextInt();
		int res = num1/num2;
		System.out.println(res);
		System.out.println("Left Function-1");
	}
}
class OPeration7 {
	void Function2() throws Exception {
		try {
			System.out.println("Inside Function-2");
			Operation6 op6 = new Operation6();
			op6.Function1();
		}
		catch(Exception e) {
			System.out.println("Exception handled in Function-2");
			throw e;
		}
		System.out.println("Left Function-2");
	}
}
public class RethrowingOfExceptions {
    public static void main(String[] args) {
	System.out.println("Inside main Function");
	OPeration7 op7 = new OPeration7();
	try {
		op7.Function2();
	}
	catch(Exception e) {
		System.out.println("Main handled the Exception");	
	}
	System.out.println("Left Main Function");
}
}
