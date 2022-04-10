package day08;

public class ReturnMethods {
	public static void main(String[] args) {
		
		sayHi(); // Hi (from line 23 - 24)
		
		String res = getHi(); // Inside getHi method 
		System.out.println(res); // hey (from line 18)
		
		getHi(); // Inside getHi method 
		
		int resNum = getMyNumber();
		System.out.println(resNum); // 7
	}
	// String - return type of this method
	// If we  specify out return type (String in this example), it must return it
	public static String getHi() {
		System.out.println("Inside getHi method");
		
		return "hey"; 
	}
	
	// void - return type for this method
	// When it's void method will not return anything.
	public static void sayHi() {
		System.out.println("Hi");
		}
	
	public static int getMyNumber() {
		System.out.println("Inside getMyNumber");
		int num = 7;
		
		// when we return the value Java will exit the method.
		
		return num;
		
		// System.out.println("After return"); // Unreachable code.
		
	
	}
}



