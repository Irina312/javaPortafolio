package day12;

public class TernaryOperator {  // Ternary operator always works with conditions and returns value
	public static void main(String[] args) {
		int y = 10;
		int x;

		// if y is greater than 5, assign value to x = y * 2;
		// otherwise assign value to x = y * 3
		// if (y > 5) {
		//	 x = y * 2;
		// } else {
		//	 x = y * 3;
		// }

		// = condition ? ifTrueThisVAlue : ifFalseThisValue;
		x = y > 5 ? y * 2 : y * 3;
		System.out.println("y: " + y);
		System.out.println("x: " + x);
		
		int num = 7;
		// if num is even than "java" otherwise "php"
		String str = num % 2 == 0 ? "java" : "php";
		System.out.println(str); // php
	}

}
