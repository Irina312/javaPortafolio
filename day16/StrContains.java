package day16;

public class StrContains {
	public static void main(String[] args) {
		// contains(String) is used to check if string contains another string
		// return type of this method is boolean
		
		String topic = "Variables, assignment operators, arithmetic oper";
		
		boolean isThere = topic.contains("assignment");
		System.out.println(isThere); // true
		
		System.out.println(topic.contains("john")); // false
		System.out.println(topic.contains("ales")); // false
		System.out.println(topic.contains("rs, a")); // true
		System.out.println(topic.contains("ment  ")); // false -> in original there is only 1 space, not 2
		
		String str = "Java is cool";
		System.out.println(str.contains("Java is cool")); // true
		System.out.println(str.contains("is")); // true
		System.out.println(str.contains("are")); // false
	}

}
