
public class list {
	
	public static void reverseArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
			
		}
		
	}
	public static void printArray(int[] arr) {
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] numbers = {1,2,3,0,4,6};
		printArray(numbers);
		reverseArray(numbers);
		printArray(numbers);
		
	}

}
