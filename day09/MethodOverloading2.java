package day09;

public class MethodOverloading2 {
	public static void main(String[] args) {
		short number = 20; // #3 method was used
		print(number);
		
		print("Apple"); // #1 method was used
		print(7); // #2 method was used
	}
	// #1 method
	public static void print(String str) {
		System.out.println(str + "!");
	}
	
	// #2 method
	public static void print(int num) {
		System.out.println(num + "!");
	}
	
	// #3 method
	public static void print(short num) {
		System.out.println(num + "!");
	}

}
