import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int [][][]a = new int[2][3][5];
			for(int i=0;i<2;i++) {
				for(int j=0;j<3;j++) {
					for(int k=0;k<5;k++) {	
				System.out.println("School "+ i +" Class "+ j +" Stident "+ k);
				a[i][j][k] = sc.nextInt();
				}
				}
			}
			System.out.println("The ages are:");
			 
			for(int i =0; i<2;i++) {
				for(int j=0;j<3;j++) {
					for(int k=0;k<5;k++) {
					System.out.print(a[i][j][k]+" ");
				}				 
				System.out.println();
			}
				System.out.println();
			}
	}
}
