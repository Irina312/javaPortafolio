package day33;

public class Varargs1 {
	public static void main(String[] args) {
		System.out.println(join("hello", "world"));
		System.out.println(join("apple", "orange", "banana"));
		System.out.println(join("one", "two", "three", "four", "five"));
		
		String[] langs = {"java", "python", "js", "ruby", "php"};
		System.out.println(join(langs));
	}
	// create a joined method which concatenates all its arguments & returns as one string
	
	public static String join(String... abc) {
		// vararg works exactly as arry inside the method
		String str = "";
	//	for (String str1 : abc) {
	//	str += str1;
	//	}
		// or another way below:
		for (int i = 0; i < abc.length; i++) {
			str += abc[i];
		}
		return str;
	}
	// 1. Only one vararg per method
	// public static void myMethod(String... words, int... nums) {
	// }
	
	// 2. The varargs argument should be the last one if the method has other arguments
	 public static void myMethod(String str, double dNum, int... nums) {
	 }

}
