import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the year: ");
	 int n = sc.nextInt();
	 boolean result = leapyear(n);
	 System.out.println(result);
			 
}

private static boolean leapyear(int n) {
	 if(n%4 ==0){
		 if(n%100 ==0) {
			 if(n%400 ==0) {
				 return true;
			 }
			 else {
				 return false;
			 }
		 }
		 else {
			 return false;
		 }
	 }
	 else {
		 return false;
	 }
}
}
