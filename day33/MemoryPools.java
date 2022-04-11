package day33;

public class MemoryPools {
	public static void main(String[] args) {
		// What's String pool memory?
		// It's a special memory for string values. 
		// String will reuse the same values in the String pool.
		// It's possible because String is immutable
		
		String str = "apple";
		String str1 = "apple";
		System.out.println(str == str1); // true because they are pointing to the same object
		
		// All Wrapper classes are immutable
		// All Wrapper classes have memory pools similarly as String does
		Integer num = 99;
		Integer num2 = 99;
		Integer num3 = new Integer(99);
		System.out.println(num == num2); // true -> poiting to the same object
		System.out.println(num == num3); // false -> pointing to different objects
	}

}
