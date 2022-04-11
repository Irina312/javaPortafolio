package day25;

public class StrBuilder {
	public static void main(String[] args) {
		// String is immutable object that can keep sequence of chars
		// StringBuilder is an mutable  that can keep sequence of chars
		
		// create StringBuilder with empty value
		StringBuilder sb = new StringBuilder();
		
		// add value to StringBulder by using append() method
		sb.append("hello");
		System.out.println(sb); // hello
		
		// appending more value will add them to the right side 
		// of the existing value
		sb.append(", world!");
		System.out.println(sb); // hello, world!
		System.out.println("-----");
		
		StringBuilder tokyo = new StringBuilder();
		tokyo.append("Tokyo");
		tokyo.append(" - population 37M");
		System.out.println(tokyo); // Tokyo - population 37M
		
		// create StringBuilder with initial value
		StringBuilder shanghai = new StringBuilder("Shanghai");
		System.out.println(shanghai);
		shanghai.append(" - poulation is 25M");
		System.out.println(shanghai);
		
		// Why do we need StringBuilder when we have String?
		// StringBuilder is good when we have a code that changes a value
		// of String a lot(usually inside the loop)
		// that way we will safe memory.
		// Then should I always use StringBuilder?
		// No! String is immutable & simple to use.
		
		String strNum = "";
		for (int i = 0; i < 100; i++) {
			strNum = strNum + " " + i;
		}
		// 101 String objects were created from line 39
		System.out.println(strNum); 
		
		StringBuilder sbNum = new StringBuilder();
		for ( int i = 0; i < 100; i++) {
			sbNum.append(" " + i);
		}
		// 1 StringBuilder object was created from line 46
		System.out.println(sbNum);
		
	}

}
