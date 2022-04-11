package day30;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5, 11};
		System.out.println(Arrays.toString(num)); // [6, 3, 2, 10, 0, 7, 5, 11]
		
		Arrays.sort(num);
		// Binary search works only for sorted data set
		System.out.println(Arrays.toString(num));
		//  0  1  2  3  4  5   6   7 -> index
		// [0, 2, 3, 5, 6, 7, 10, 11]
		
		System.out.println(bSearch(num, 6)); // 4
		System.out.println(bSearch(num, 11)); // 7
		System.out.println(bSearch(num, 2)); // 1
		System.out.println(bSearch(num, 50)); // -1
	}
		// return index of target if it exists otherwise return -1
		public static int bSearch(int[] arr, int target) {
			int start = 0;
			int end = arr.length - 1;
			int mid = (start + end) /2;
		//  0  1  2  3  4  5   6   7 -> index
		// [0, 2, 3, 5, 6, 7, 10, 11]
	 	while (arr[mid] != target) {
	 		if (start > end) {
	 			return -1;
	 		}
	 		if (arr[mid] < target) {
	 			start = mid + 1;
	 		} else {  // if (arr[mid] > target) {
	 			end = mid - 1;
	 		}
	 		
	 		mid = (start + end) /2;
	 	}
		return mid;
	}
}

