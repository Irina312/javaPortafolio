package day19;

import java.util.Scanner;

public class Password2 {
	public static final String PASSWORD = "qwe";
	public static final int LIMIT = 3;

	public static void main(String[] args) {
		// break -> break the loop and exit
		// continue -> skip current iteration (repeat);
		
		Scanner sc = new Scanner(System.in);
		String enteredPassword = "";
		
		int numberOfAttemps = 0;
		while (numberOfAttemps < LIMIT) {
			System.out.println("Enter password:");
			enteredPassword = sc.next();
			
			if(PASSWORD.equals(enteredPassword)) {
				System.out.println("Welcome to your account");
				break; // it's used to exit the loop
			}
			
			numberOfAttemps++;
		}
		
		if (numberOfAttemps >= LIMIT) {
			System.out.println("Your account is blocked. Number of attemps: " + numberOfAttemps);
		}
	}
}
