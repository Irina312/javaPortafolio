package day20;
import java.util.Scanner;

public class FavoriteNumber2 {
	public static void main(String[] args) {
		final int myFavNum = 7;
		
		Scanner sc = new Scanner(System.in);
		
		int enteredNum;
		
		do {
			System.out.println("Can you guess my favorite number?");
			enteredNum = sc.nextInt();
			
			if (myFavNum != enteredNum) {
				System.out.println("Nom it is not!");
			}
		} while (myFavNum != enteredNum);
		
		System.out.println("Yes, you got it!");
		
	}

}
	
