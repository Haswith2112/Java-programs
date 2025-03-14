package com.ExceptionHandling;

 
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithMulticatch {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Division operation started");
			System.out.println("Enter the num-1:");
			int num1 = sc.nextInt();
			System.out.println("enter the num-2: ");
			int num2 = sc.nextInt();
			int res = num1/num2;
			System.out.println(res);
			System.out.println("Division operation completed");
			System.out.println("array operation Started");
			System.out.println("Enter the Array Size: ");
			int n = sc.nextInt();
			int arr[] = new int [n];
			System.out.println("Enter the position to insert value: ");
			int pos = sc.nextInt();
			System.out.println("Enter the values :");
			int val = sc.nextInt();
			arr[pos] = val;
			System.out.println("Data is added");
			System.out.println("array operation completed");
			
			
		}
		//Specific catch Block
		catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception is Handled");
		}
		//Milti Catch Block
		catch(ArrayIndexOutOfBoundsException | NegativeArraySizeException ae) {	
			System.out.println("Array index out of bounds Exception or Negative array size Exception"+ "is handled");
		}
		catch (InputMismatchException ae){
			System.err.println("Input Mismatch Exception is handled");
		}
		//Generic catch Block
		catch (Exception e){
			System.out.println("Exception occured in main is handled");
		}
	}

}
