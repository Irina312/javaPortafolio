package day17;

public class StrStartsEndsWith {
	public static void main(String[] args) {
		// strartWith(String) checks if a string starts with another string
		
		String str = "Java is object oriented programming language";
		
		System.out.println(str.startsWith("Java is obj")); // true
		System.out.println(str.startsWith("is object")); // false
		
		System.out.println(str.startsWith("Java")); // true
		System.out.println(str.startsWith("java")); // false
		System.out.println(str.startsWith("Java is object oriented programming language")); // true
		
		boolean starts = str.startsWith("programming");
		
		 // endsWith(String) checks if a string ends with another string
		String str2 = "Selenium is web automation tool";
		boolean ends = str2.endsWith("ool");
		System.out.println(ends); // true
		
		System.out.println("Selenium is web automation tool"); // true
	}

}
