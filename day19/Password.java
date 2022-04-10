package day19;
import java.util.Scanner;

public class Password {
	public static final String PASSWORD = "qwe";
	public static final int LIMIT_OF_ATTEMPS = 3;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your password:");
		String enteredPassword = sc.next();
		
		int numberOfAttemps = 1;
		
		while (!PASSWORD.equals(enteredPassword) && numberOfAttemps < LIMIT_OF_ATTEMPS) {
			System.out.println("Wrong password.Try again");
			System.out.println("Enter your password:");
			enteredPassword = sc.next();
			numberOfAttemps++;
		}
		
		System.out.println("Number of attemps: " + numberOfAttemps);
		if (PASSWORD.equals(enteredPassword) && numberOfAttemps <= LIMIT_OF_ATTEMPS) {
		} else {
			System.out.println("Blocked");
		}
		
	}

}
