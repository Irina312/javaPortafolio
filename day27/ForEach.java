package day27;
import java.util.Arrays;

public class ForEach {
	public static void main(String[] args) {
		// for each loop - it will iterate each element from array
		
		int[] numArr = {10, 11, 14, 55, 43, 32, 99};
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		System.out.println("-----");
		
		for (int num : numArr) { // instead of num it can be any name
			System.out.println(num);
		}
		System.out.println("-----");
	
		String[] names = {"Alex", "Thomas", "Mary", "John"};
		for (String str : names) { // instead of str it can be any name
			System.out.println(str);
		}
		System.out.println("-----");
		
		char[] chAr = {'a', 'b', 'c', 'd', 'e'};
		for (char chChar : chAr) {
			System.out.println(chChar);
		}
		System.out.println("-----");
		
		double[] dArr = {99.9, 10.8, 5.5, 3.1, 2.3};
		for (double dDouble : dArr) {
			System.out.println(dDouble);
		}
		// we can't change values of array by using for each loop
		String[] lang = {"Java", "js", "Python", "php"};
		// make all values to upper case.
		
//		for (String str : lang) {
//			str = str.toUpperCase();
//		}
		
		// [String, String, String, String]
		for (int i = 0; i < lang.length; i++) {
			lang[i] = lang[i].toUpperCase();
		}
		
		System.out.println(lang); // [Ljava.lang.String;@1dbd16a6
		System.out.println(Arrays.toString(lang)); // [JAVA, JS, PYTHON, PHP]
	}
		
	}


