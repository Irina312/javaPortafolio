package day25;

public class StringPool2 {
	// interview question
	public static void main(String[] args) {
	String str = "john";
	String str1 = "john";
			 // keyword
	String str2 = new String("john"); // new keyword was created
	
	System.out.println(str == str1); // true
	// They are pointing to the same object in the String Pool
	// String Pool will try to reuse the same objects
	
	System.out.println(str == str2); // false
	// They are not pointing to the same object because
	// of str2 was created by new keyword. It means it will not use
	// String Pool
	
	System.out.println(str.equals(str2)); // true
	// Because .equals methods compares actual content of String equality
	
} 
}
