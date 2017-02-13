import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] array = new int[num];

		for (int i = 0; i < num; ++i) {
			array[i] = sc.nextInt();
		}
		sc.close();
		int count = bubbleSort(array);
		System.out.println("Array is sorted in " + count + " swaps.");
		System.out.println("First Element: " + array[0]);
		System.out.println("Last Element: " + array[num - 1]);

	}

	private static int bubbleSort(int[] array) {
		int numberOfSwaps = 0;
		for (int i = 0; i < array.length; i++) {
			// Track number of elements swapped during a single array traversal
			int a;
			for (int j = 0; j < array.length - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (array[j] > array[j + 1]) {
					a = array[j + 1];
					array[j + 1] = array[j];
					array[j] = a;
					numberOfSwaps++;
				}
			}

			// If no elements were swapped during a traversal, array is sorted
			if (numberOfSwaps == 0) {
				break;
			}
		}

		return numberOfSwaps;
	}

}