package day10;

public class LuckNumber {
	public static void main(String[] args) {
		// create a static method that accepts one int number as an argument
		// assume numbers 7, 13, 99 are lucky number
		// if user number is a lucky number, print "Jackpot!"
		// otherwise print "Not today!"
		// Call your method inside main method
		luckyNum(7);
		luckyNum(26);
		luckyNum(99);
	}  
	
	public static void luckyNum(int num) {
		if (num == 7 || num == 13 || num == 99) {
			System.out.println("Jackpot!");
		} else {
			System.out.println("Not today!");
		}
		
	}
}
