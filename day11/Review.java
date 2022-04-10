package day11;

public class Review {
	public static void main(String[] args) {
		// Logical operator
		// || - OR
		// ! -NOT

		// if num is 7, 9 , or 27, print "My number"
		// otherwise print "Regular number"

		int num = 28;
		if (num == 7 || num == 9 || num == 27) {
			System.out.println("My number");
		} else {
			System.out.println("Regular number");
		}

		int amount = 20;
		// if amount is even and greater that 10, print "My even number"
		// otherwise print "Regular number"
		if (amount % 2 == 0 && amount > 10) {
			System.out.println("My even number");
		} else {
			System.out.println("Regular number");

		}
	}

}
