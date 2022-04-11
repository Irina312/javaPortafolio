package day30;

import java.util.Arrays;

public class ArraySortAndSearch {
	public static void main(String[] args) {
		// Array s is a helper class for all arrays
		// It has built in sorting and searching methods
		
		int[] arrNum = {6, 3, 2, 100, 0, 1, 5, 88, 99};
		System.out.println(Arrays.toString(arrNum));
		
		Arrays.sort(arrNum);
		// What kind of sorting algorithm it will used?
		// Merge sort algorithm 
		System.out.println(Arrays.toString(arrNum));
		
		String[] strArr = {"Boris", "Akylbek", "Frank", "Edil", "Selvin", "Alex"};
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		System.out.println("-----");
		
		int[] nums = {6, 3, 2, 100, 0, 1, 5, 88, 99};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		//  0  1  2  3  4  5   6   7   8 -> index
		// [0, 1, 2, 3, 5, 6, 88, 99, 100]
		int i = Arrays.binarySearch(nums, 6);
		System.out.println("Index: " + i);
		
	}

}
