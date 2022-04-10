package day06;

public class Review {
	public static void main(String[] args) {
		
		// List of primitives in Java:
		// - whole numbers: byte, short, int, long;
		// - floating numbers: float, double;
		// - primitives for single character: char;
		// primitives for logic value: boolean.
		
		// Why Java has 4 types of primitives for whole numbers?
		// What's the difference between them?
		// - They can hold different range of numbers and the memory;
		// - Space they take is different.
		// byte -> short -> int -> long
		
		int num = 90;
		System.out.println(num); // 90
		
		num = 19;
		System.out.println(num); // 19
		
		int i = 7;
		int i2 = 2;
		System.out.println(i / i2); // 3.0
		
		double dNum = 99.9;
		double d = 9;
		double d2 = 2;
		//  double / double
		double res = d / d2;
		System.out.println(res); // 4.5
		
		char grade = 'C';
		System.out.println(grade); // C
		
		boolean isGood = true;
		isGood = false;
		
		
	}

}
