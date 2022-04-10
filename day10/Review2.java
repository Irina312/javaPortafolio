package day10;

public class Review2 {
	public static void main(String[] args) {
		System.out.println(getNumber(2000)); // big number
		System.out.println(getNumber(7)); // regular number
		
		String res = getNumber(1000);
		System.out.println(res); // big number
		
		getNumber(999); // 999 >= 1000 -> false, will not print
		
		printName("John", 18);
		printName("Alex", 35);
		printName("Ramish", 15);
	}
	
	public static String getNumber(int num) {
		// 999 >= 1000 -> false
		if (num >= 1000) {
			return "big number";
		} else {
			return "regular number";
		}
	}
	
	public static void printName(String name, int age) {
		if (age > 21) {
			// void method can have return statement
			// it will just exit the method.
			return;
		}
	}
}
