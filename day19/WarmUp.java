package day19;

public class WarmUp {
	public static void main(String[] args) {
		System.out.print(isLastUpper("hello")); // false
		System.out.print(isLastUpper("hellO")); // true
		System.out.print(isLastUpper("JAVA")); // true
		System.out.print(isLastUpper("Apple")); // false
	}
	/*
	 * if last char of str is upper case letter return true, otherwise false
	 * isLastUpper("Hello"); -> false
	 * isLastUpper("hellO";  -> true
	 */
	public static boolean isLastUpper(String str) {
		// 1. Get last char save in var and make it to upper case
		// 2. Compare original last char with upper case last char
		//    if it is true then it was already in upper case so we can
		//    return true.
		String last = str.substring(str.length() -1);
		last = last.toUpperCase();
		String lastOriginal = str.substring(str.length() -1);
		
		 if (last.equals(lastOriginal)) {
			 return true;
		 } else {
			 return false;
		    // Another way to do:
			// String lastCharUpper = str.substring(str.length() -1).toUpperCase();
			// String lastCharOriginal = str.substring(str.length() -1);
			// return lastCharUpper.equals(lastCharOriginal);
		 }
		 }
	
	
	public static boolean isLastUpper2(String str) {
		char lastChar = str.charAt(str.length() -1); // to get last char from String
		// We use wrapper class method here Character.isUpperCase(char);
		return Character.isUpperCase(lastChar);
	}
	
	public static boolean isLastUpper3(String str) {
		char lastChar = str.charAt(str.length() - 1);
		char lastCharUpper = String.valueOf(lastChar).toUpperCase().charAt(0);
		return lastChar == lastCharUpper;
	}

}
