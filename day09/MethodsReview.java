package day09;

public class MethodsReview {
	// Method is a block of code that can be used by it's name
	// Methods are used for reusability
	
	// void methods - they do something and they don't return any data
	// return methods - they do something and they must return the data
	
	// Methods arguments/parameters can get input from a user
	// by its arguments
	
	public static void main(String[] args) {
		String name = "John";
		int age = 37;
		String course = "Java";
		
		int res = sumOfTwo (5, 8);
		System.out.println(res); // 13
		
		String input = "Java";
		printThree(input);
		
		printThree("Python");
		
			}
	
	public static void printInfo(String name, int age, String course) {
	System.out.println("Name: " + name);
	System.out.println("Age: :" + age);
	System.out.println("Course: " + course);
}
	
	// - method returns int
	// method accepts two int arguments
	public static int sumOfTwo(int i, int i2) {
		int sum = i + i2;
		return sum;
	}
	
	// What we can tell about this method?
	// - void method - no return
	// - it accepts one String argument
	// - it prints its argument three times
	public static void printThree(String str) {
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
	}
}