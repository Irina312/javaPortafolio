package day33;

public class PassByValue {
	public static void main(String[] args) {
		// All primitives in Java are passed by value
		// primitives don't change their value when you pass... (WATCH CLASS)
		int num = 99;
		System.out.println(num); // 99
		m(num);
		System.out.println(num); // 99
	}

	public static void m(int n) {
		// n = num;
		n = 100;
	}
}
