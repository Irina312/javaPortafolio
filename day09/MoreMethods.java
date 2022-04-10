package day09;

public class MoreMethods {
	public static void main(String[] args) {
		int i = 9;
		int j = 17;
		
		if (i > j) {
			// if condition true, if's body gets executed
			System.out.println("Yes, it's");
		}else {
			// if condition is false, else's body gets executed
			System.out.println("no, it's not");
		}
		
		System.out.println("-----");
		luckyNumber(9);
		luckyNumber(7);
		
		badNumber(75); // Normal number: 78
		badNumber(8); // Normal number: 8
		badNumber(13); // Bad number: 13
	
	}
	
	// create a void method that will accept one int number and if the number is 7, 
	// it will print "Bingo", otherwise "Not today."
	public static void luckyNumber(int num) {
		if (num == 7) {
			System.out.println("Bingo!");
		}else {
			System.out.println("Not today.");
		}
	}
	
	// if argument num == 13 then print "Bad number: <num>"
	// otherwise print "Normal number: <num>"
	public static void badNumber(int num) {
		if (num == 13) {
			System.out.println("Bad number: " + num);
			
		}else {
			System.out.println("Normal number: " + num);
		}
	}
	

}
