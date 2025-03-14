
public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		int num3 = 15;
		int max;
		max = (num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
		System.out.println("MAximumof"+num1+","+num2+",and"+num3+"is:"+max);

	}

}
