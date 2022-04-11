package day29;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num)); // [6, 3, 2, 10, 0, 7, 5]
		
		sortArray(num);
		System.out.println(Arrays.toString(num)); // [0, 2, 3, 5, 6, 7, 10]
	}
	
	public static void sortArray(int[] num) {
		// 1. outer loop to make a sort for each element
		// 2. we need to find min(smallest) element with starting point
		// 3. swap
		for (int i = 0; i < num.length; i++) {
			
			// to find smallest element index from i
			int min = num[i];
			int minIndex = i;
			for (int j = i; j < num.length; j++) {
				if (min > num[j]) {
					min = num[j];
					minIndex = j;
				}
			}
			int temp = num[i];
			num[i] = num[minIndex];
			num[minIndex] = temp;
		}
	}
	
	public static void sortArray2(int[] num) {
		for (int i = 0; i < num.length; i++) {
			int minIndex = getMinIndex(num, i);
			int tmp = num[i];
			num[i] = num[minIndex];
			num[minIndex] = tmp;
		}
	}
	
	public static int getMinIndex(int[] num, int startIndex) {
		int min = num[startIndex];
		int minIndex = startIndex;
		
		for (int i = startIndex; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
				minIndex = i;
			}
		}
		
		return minIndex;
	}
	
}
