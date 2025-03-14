package com.ExceptionHandling;

import java.util.Scanner;

class Operation1 {
	void Function() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num-1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num-2: ");
		int num2 = sc.nextInt();
		int res = num1/num2;
		System.out.println(res);
	}
}
public class EHusingThrowsKeyword1 {
	public static void main(String[] args) throws Exception {
		Operation1 o = new Operation1();
		o.Function();
		
	}

}
