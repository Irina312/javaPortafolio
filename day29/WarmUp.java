package day29;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		String[] team = {"Alex", "Kuba", "Maria", "John"}; 
		System.out.println(Arrays.toString(team)); // [Alex, Kuba, Maria, John]
		
		revArr(team);
		System.out.println(Arrays.toString(team)); // [John, Maria, Kuba, Alex]
		
		team = new String[] {"Tomas", "Anil", "Jared", "Ramesh", "Mari"};
		String[] revArr = returnRevArr(team);
		System.out.println(Arrays.toString(team));
		System.out.println(Arrays.toString(revArr));
	}
	// first iteration will swap first and last
	// 
	
	public static void revArr(String[] arr) {
		int endIndex = arr.length - 1;
		for (int startIndex = 0; startIndex < arr.length / 2; startIndex++) {
			// swap logic is always with temp
			String temp = arr[startIndex];
				arr[startIndex] = arr[endIndex];
				arr[endIndex] = temp;
				
				endIndex--;
		}
	}
	// another way to reverse array
	public static void revArr2(String[] arr) {
		for (int startIndex = 0; startIndex < arr.length / 2; startIndex++) {
			// swap logic
			String temp = arr[startIndex];
			arr[startIndex] = arr[arr.length - startIndex - 1];
			arr[arr.length - startIndex - 1] = temp;
 		} 
	}
	// another way to reverse array with return`						`	
	public static String[] returnRevArr(String[] arr) {
		String[] revArr = new String[arr.length];
		int start = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			revArr[start++] = arr[i];
		}
		
		return revArr;
	}
}
