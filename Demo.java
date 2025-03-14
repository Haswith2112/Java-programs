import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter the ages:");
			a[i] = sc.nextInt();
		}
		System.out.println("The ages are:");
		 
		for(int i =0; i<5;i++) {
			 
			System.out.print(a[i]+" ");
		}
		 

	}

}
