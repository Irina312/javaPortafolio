package day31;

import java.util.Arrays;

public class WarmUp3 {
	public static void main(String[] args) {
		// Given this array
		String[] arrayOne = {"One", "Two", "Three", "Four", "Five"}; 
		System.out.println("Array one: " + Arrays.toString(arrayOne)); //Array one: [One, Two, Three, Four, Five]
		
		String[] arrayTwo = {"Six", "Seven", "Eight", "Nine"};
		System.out.println("Array two: " + Arrays.toString(arrayTwo));
		
		// We have two arrays. can you create another array that will hold
		// values of above two arrays?
		// 1. Create new array that can hold elements from both arrays
		// 2. Assign values from two arrays to the new array
		
		String[] arrayThree = new String[arrayOne.length + arrayTwo.length];
			int fillUpIndex = 0;	
		for (int i = 0; i < arrayOne.length; i++) {
			arrayThree[fillUpIndex] = arrayOne[i];
			fillUpIndex++;
		}
		
		for (int i = 0; i < arrayTwo.length; i++) { // can be any letter instead of i
			arrayThree[fillUpIndex] = arrayTwo[i];
			fillUpIndex++;
		}
		
		System.out.println("Array three: " + Arrays.toString(arrayThree));
		
		
		
	}
}
