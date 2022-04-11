package day31;

import java.util.Arrays;

public class WarmUp2 {
	public static void main(String[] args) {
		// Given this array
			String[] arrayOne = {"One", "Two", "Three", "Four", "Five"}; 
			System.out.println(Arrays.toString(arrayOne)); //[One, Two, Three, Four, Five]
			
			// reverse each element of arrayOne with using StringBuilder
			//	for (int i = 0; i < arrayOne.length; i++) {
			//	StringBuilder sb = new StringBuilder(arrayOne[i]);
			//	arrayOne[i] = sb.reverse().toString();
			
			// reverse each element of arrayOne without using StringBuilder
			for (int i = 0; i < arrayOne.length; i++) {
				arrayOne[i] = rev(arrayOne[i]); 
			}
						
			System.out.println(Arrays.toString(arrayOne));// [enO, owT, eerhT, ruoF, eviF]
	}
	public static String rev(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >=0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

}
