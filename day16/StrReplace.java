package day16;

public class StrReplace {
	public static void main(String[] args) {
		// replace(oldString, newString) - it will replace the old string with a new string
		//								   and it will return that new version.
		String city = "Alma-Ata";
		System.out.println(city); // Alma-Ata
		
		// Alma-Ata => Alma Ata
		city = city.replace("-", " ");
		System.out.println(city); // Alma Ata
		
		city = city.replace(" ", "");
		System.out.println(city); // AlmaAta
		
		String str = "Java*Python*JS*PH";
		System.out.println(str); // Java*Python*JS*PH
		
		str = str.replace("*", ", ");
		System.out.println(str); // Jav, Python, JS PH
		
		String str2 = "Hello, World!";
		System.out.println(str2); // Hello, World!
		
		str2 = str2.replace("World", "Class");
		// str2 = str2.replace("World", "Class").replace("!", "."); -> replace couple strings in one line
		System.out.println(str2); // Hello, Class!
		
		
		}

}
