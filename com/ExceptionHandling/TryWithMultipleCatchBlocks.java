package com.ExceptionHandling;

import java.util.Scanner;

public class TryWithMultipleCatchBlocks {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Division Operation Started");
			System.out.println("Enter the num-1:");
			int num1 = sc.nextInt();
			System.out.println("enter the num-2:");
			int num2 = sc.nextInt();
			int res = num1/num2;
			System.out.println(res);
			System.out.println("Division operation Completed");
			System.out.println("Array Operation Started");
			System.out.println("Enter the Array size: ");
			int n = sc.nextInt();
			int arr[] = new int [n];
			System.out.println("Enter the position to insert value: ");
			int pos = sc.nextInt();
			System.out.println("Enter the value: ");
			int val = sc.nextInt();
			arr[pos] = val;
			System.out.println("Array operation completed");
			
		}
		//Generic Catch Block
		catch (Exception e){
			System.out.println("Exception occured in main handled");
		}
	}

}
