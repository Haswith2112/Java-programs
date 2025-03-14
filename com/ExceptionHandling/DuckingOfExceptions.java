package com.ExceptionHandling;

import java.util.Scanner;

class Operation2 {
	void Function1() throws Exception {
		System.out.println("Inside Function-1: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num-1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the num-2: ");
		int num2 = sc.nextInt();
		int res = num1/num2;
		System.out.println(res);
		System.out.println("Left Function-1");
	}
}
class Operation3 {
	void Function2() throws Exception {
		System.out.println("Inside Function-2");
		Operation2 op2 = new Operation2();
		op2.Function1();
		System.out.println("Left Function-2");
	}	
}
class Operation4 {
	void Function3() {
		try {
			System.out.println("Inside Function-3");
			Operation3 op3 = new Operation3();
			op3.Function2();
		}
		catch(Exception e) {
			System.out.println("Exception handled in Function-3");
		}
		System.out.println("Left Function-3");
	}
}
class Operation5 {
	void Function4() {
		System.out.println("Inside Function-4");
		Operation4 op4 = new Operation4();
		op4.Function3();
		System.out.println("Left Function-4");
	}
}
public class DuckingOfExceptions {
	public static void main(String[] args) {
		System.out.println("Inside Main Function");
		Operation5 op5 = new Operation5();
		op5.Function4();
		System.out.println("Left Main Functuon");
	}

}
