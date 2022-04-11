package day21;

public class ForLoopStr {
	public static void main(String[] args) {
		printChar("Java");
		System.out.println("-----");
		printChar("Apple");
		System.out.println("-----");
		printCharsReverse("Java");
		System.out.println("-----");

		System.out.println(countA("Java")); // 2
		System.out.println(countA("Argentina")); // 2
		System.out.println(countA("apple")); // 1
	}

	// let's say 'a' and "A" are special chars
	// Find out how many 'a' and 'A" in the str argument
	// and return that number
	public static int countA(String str) {

		// variable for storing counts of 'A' and 'a'
		int count = 0;
		// go over the str and get each char one by one
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'A' || ch == 'a') {
				count++;
			}
		}
		return count;
	}

	/*
	 * print each char of str argument in the new line
	 */
	public static void printChar(String str) {

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	// print each char of str argument in reverse order in the new line
	public static void printCharsReverse(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}
}
