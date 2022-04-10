package day16;

public class StrCharAt {
	public static void main(String[] args) {
		// charAt(index) -> it returns a single characters from a given index
		//			  0123
		String str = "home";
		char ch = str.charAt(1);
		
		System.out.println(str); // home
		System.out.print(ch);; // o
		
		//			   012345
		String str2 = "public";
		char ch2 = str2.charAt(4);
		System.out.println(ch2); // i
		
		//
		String str3 = "ap ple";
		char ch3 = str3.charAt(2);
		System.out.println("space: " + ch3);
		System.out.println("-----");
		
		char ch4 = getFirstChar("hello");
		System.out.println(ch4); // h
	}
	
	// String str - argument
	// We give the value for our argument when we call out method
	// char - return type in this example below
	// Basically, we are telling that this method must return char
	public static char getFirstChar(String str) {
		char ch = str.charAt(0);
		return ch;
	}

}
