package day06;

public class LocalVariables {
	public static void main(String[] args)  {
		/*
		 * Local variables are variables that have been created
		 * inside the method or statements (is else, loops).
		 * - they don't have default values. If you try to use without
		 * assigning value, then you will get compiler error.
		 * - they can't have access modifiers.
		 */
		
		String firstName = "John";
		String lastName = "Doe";
		int age = 25;
		
		String str;
		// System.out.println(str); does not compile
		
		str = "Apple";
		System.out.println(str);
		
		// public int num = 8; does not compile
	}

}
