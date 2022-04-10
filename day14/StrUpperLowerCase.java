package day14;

public class StrUpperLowerCase {

	public static void main(String[] args) {
		String str = "java";
		System.out.println("str: " + str); // str: java

		// toUpperCase() converts the value of String to all upper cases
		// and returns it as a new String

		str = str.toUpperCase();
		System.out.println("str: " + str); // str: JAVA

		String str2 = "apple";
		System.out.println("str2: " + str2); // str2: apple

		// String is immutable(not changeable) object for sequence of chars
		str2.toUpperCase(); // it needs to be reassigned to get a new value
		System.out.println("str2: " + str2); // str2: apple

		// this reassignment
		str2 = "python";
		System.out.println(str2); // python
		str2 = str2.toUpperCase();
		System.out.println(str2); // PYTHON
		System.out.println("----");

		String str3 = "PHP";
		System.out.println("str3: " + str3); // PHP

		str3 = str3.toLowerCase();
		System.out.println("str3: " + str3); // php

		String res = "orange";
		System.out.println(res.toUpperCase()); // ORANGE
		System.out.println(res); // orange because the original value wasn't reassigned
		
		System.out.println(changeStr("Abc")); // abc
		System.out.println(changeStr("Abcdef")); // ABCDEF
	}

	public static String changeStr(String str) {
		// TODO
		// if str argument length(size) is greater than 5
		// then return it in all upper cases
		// otherwise return it all in lower cases

		// return str.length() > 5 ? str.toUpperCase() : str.toLowerCase();

		if (str.length() > 5) {
			return str.toUpperCase();
		} else {
			return str.toLowerCase();
		}
		// return str.length() > 5 ? str.toUpperCase() : str.toLowerCase();
	}
}
