 
import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    // Method 1: Using Arrays.sort() for primitive arrays
    public static void sortPrimitiveArray(int[] arr) {
        // Ascending order sorting
        Arrays.sort(arr);
        System.out.println("Sorted Primitive Array (Ascending):");
        printArray(arr);
    }

    // Method 2: Sorting in descending order for primitive arrays
    public static void sortDescendingPrimitiveArray(Integer[] arr) {
        // Convert to Integer array to use Collections.reverseOrder()
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted Array (Descending):");
        printArray(arr);
    }

    // Method 3: Custom bubble sort algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array using Bubble Sort (Ascending):");
        printArray(arr);
    }

    // Method 4: Sorting with Stream API (Java 8+)
    public static int[] sortUsingStream(int[] arr) {
        return Arrays.stream(arr)
                     .sorted()
                     .toArray();
    }

    // Generic method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Generic method to print Integer array
    public static void printArray(Integer[] arr) {
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1,2,3,0,4,5,6};

        // Create a copy for each sorting method
        int[] arrayForPrimitiveSort = Arrays.copyOf(originalArray, originalArray.length);
        Integer[] arrayForDescendingSort = Arrays.stream(originalArray).boxed().toArray(Integer[]::new);
        int[] arrayForBubbleSort = Arrays.copyOf(originalArray, originalArray.length);
        
        System.out.println("Original Array:");
        printArray(originalArray);

        // Demonstrate different sorting methods
        
        // Method 1: Built-in Arrays.sort() (Ascending)
        sortPrimitiveArray(arrayForPrimitiveSort);

        // Method 2: Descending Order Sorting
        sortDescendingPrimitiveArray(arrayForDescendingSort);

        // Method 3: Bubble Sort (Ascending)
        bubbleSort(arrayForBubbleSort);

        // Method 4: Sorting with Stream API
        int[] streamSortedArray = sortUsingStream(originalArray);
        System.out.println("Sorted Array using Stream API (Ascending):");
        printArray(streamSortedArray);
    }
}