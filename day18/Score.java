package day18;

public class Score {
	enum Grade{A, B, C, F};
	
	public static void main(String[] args) {
		displayScore(Grade.A);
		displayScore(Grade.C);
		displayScore(Grade.F);
	}
	/*
	 * if grade is A then print  "your score: 90 - 100"
	 * if grade is B then print  "your score: 65 - 89"
	 * if grade is C then print  "your score: 50 - 64"
	 * if grade is F then print  "your score: less than 50"
	 */
	public static void displayScore2(Grade grade) {
		if (grade == Grade.A) {
			System.out.println("Your score: 90 - 100");
		} else if (grade == Grade.B) {
			System.out.println("Your score : 65 - 89");
		} else if (grade == Grade.C) {
			System.out.println("YOur score: 50 - 64 ");
		} else if (grade == Grade.F) {
			System.out.println("YOur score: less than 50");
		} else {
			System.out.println("Invalid grade");
			
		}
	}
	public static void displayScore(Grade grade) {
		switch (grade) {
		case A:
			System.out.println("Your score: 90 - 100");
			break;
		case B:
			System.out.println("Your score: 65 - 89");
			break;
		case C:
			System.out.println("Your score: 50 - 64");
			break;
		case F:
			System.out.println("YOur score: less that 50");
			default:
				System.out.println("Invalid grade");
				
		}
	}

}
