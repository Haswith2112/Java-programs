
	import java.util.Scanner;

	public class FactirialExample {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        
	        long factorial = 1;

	        // Handle negative input
	        if (num < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } 
	        // Factorial of 0 is 1
	        else if (num == 0) {
	            System.out.println("The factorial of 0 is 1.");
	        } 
	        // Calculate factorial for positive numbers
	        else {
	            for (int i = 1; i <= num; i++) {
	                factorial *= i;
	            }
	            System.out.println("The factorial of " + num + " is " + factorial);
	        }

	        sc.close();
	    }
	}


