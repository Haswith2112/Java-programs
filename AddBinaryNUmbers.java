
public class AddBinaryNUmbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long binary1 = 1010;
		long binary2 = 1101;
		int i = 0;
		int  remainder = 0;
		long[] sum = new long[20];
		while (binary1 != 0 || binary2 != 0) {
		sum[i++] = (binary1 % 10 + binary2% 10 +remainder)% 2;
		remainder = (int) (binary1 % 10 + binary2 % 10 + remainder)/2;
		binary1 = binary1/10;
		binary2 = binary2/10;
		}
		if (remainder != 0) {
			sum[i++] = remainder;
		}
		--i;
		System.out.println("Sum of two binary numbers:");
		while(i>=0) {
			System.out.println(sum[i--]);
		}

	}

}
