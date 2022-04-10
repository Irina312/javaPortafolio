package day08;

// If the class we are trying to use is a different packcage
//then we need to import

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		// Scanner is used to get input from a user to out a program.
		// INPUT -> PROCESS -> OUTPUT
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's your full name?");
		String answer = sc.next() + sc.nextLine();
		System.out.println("Hi, " + answer + "!");
		
		int firstNumber, secondNumber, result;
		
		System.out.println("Enter first number: ");
		firstNumber = sc.nextInt();
		
		System.out.println("Enter second number: ");
		secondNumber = sc.nextInt();
		
		result = firstNumber + secondNumber;
		System.out.println(firstNumber + " + " + secondNumber + " = " + result);
		
		sc.close();
		
		
		
	}

}
