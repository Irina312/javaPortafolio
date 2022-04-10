package day20;
import java.util.Scanner;

public class FavoritNumber {
	public static void main(String[] args) {
		final int myFavNum = 7;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Can you guess my favorite number?");
		int enteredNum = sc.nextInt();
		
		//	if (myFavNum == enteredNum) {
		//	System.out.println("You got it! My favorite number is " + enteredNum);
		//	} else {
		//	System.out.println("No, " + enteredNum + " is not my favorite number");
		//	}
		
		while (myFavNum != enteredNum) {
			System.out.println("No, " + enteredNum + " is not my favorite number.");
			System.out.println("Can you guess my favorite number?");
			enteredNum = sc.nextInt();
	}
		System.out.println("You got it! My favorite number is " + enteredNum);
	
	}	

}
