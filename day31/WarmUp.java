package day31;

import java.util.Arrays;

public class WarmUp { // Interview question
	public static void main(String[] args) {
		// Given this array
		String[] arrayOne = {"One", "Two", "Three", "Four", "Five"}; 
		System.out.println(Arrays.toString(arrayOne)); //[One, Two, Three, Four, Five]
		
		// reverse each element of arrayOne without using StringBuilder
				
		// read each element from array & update each element
		for (int i = 0; i < arrayOne.length; i++) {
			
			String str = arrayOne[i];
			String rev = ""; // empty string for reverse version
			
			for (int j = str.length() - 1; j >= 0; j--) { // reversing part
				rev = rev + str.charAt(j);
			}
			
			arrayOne[i] = rev; // updated array element with reverse version
		}
			
		System.out.println(Arrays.toString(arrayOne)); // [enO, owT, eerhT, ruoF, eviF]
		
	}

}
