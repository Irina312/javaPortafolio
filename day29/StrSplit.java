package day29;

import java.util.Arrays;

public class StrSplit {
	public static void main(String[] args) {
		// split("by") it will split String into array based on splitter
		
		String str = "Java 101 for SDET 2022";
		//						  splitter	
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words)); // [Java, 101, for, SDET, 2022]
		System.out.println(words[0]); // Java
		System.out.println(words[words.length - 1]); // 2022
		
		//                         splitter
		String [] parts = str.split("for"); // "for" will be deleted and array will have  
											// 2 elements - Java 101 and SDET 2022
		System.out.println(parts.length); // 2
		System.out.println(parts[0]); // Java 101; 
		System.out.println(parts[1]); // SDET 2022
		
		str = "Java, python, php, python abc";
		
		String[] arr = str.split(",");
		System.out.println(arr[2]); // php
		System.out.println(Arrays.toString(arr)); // [Java, python, php, python abc]
		
		//                        splitter
		String[] arr2 = str.split("python");
		System.out.println(arr2.length); // 3
		System.out.println(arr2[0]); // Java, 
		System.out.println(arr2[1]); // , php,
		
		//                      splitter
		String[] arr3 = str.split(":");
		// if String doen't contain splitter the whole string
		// will be assigned as first element of array
		System.out.println(arr3.length);
		System.out.println(Arrays.toString(arr3)); // [Java, python, php, python abc]
		System.out.println(arr3[0]); // Java, python, php, python abc
		
	}

}
