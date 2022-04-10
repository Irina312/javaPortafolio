package day07;

import java.util.Scanner;

public class ScannerInJava {
	public static void main(String[] args) {
		// Scanner will let us get input from a user (from console)'

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String answer = scanner.next();
		System.out.println("Nice to meet you, " + answer + "!");
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		System.out.println("Oh, you are " + age + "years old.");
		
		System.out.println("Where are you from?");
		
		String address = scanner.next();
		System.out.println(address);
		
		// scanner.next() + scanner.nextLine();  will return the whole line back
		


	}
}