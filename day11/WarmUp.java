package day11;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(evenOdd(9)); // odd
		System.out.println(evenOdd(20)); // even
		System.out.println(evenOdd(10)); // 10
		
	}
	
	public static String evenOdd(int num) {
		if (num % 2 == 0 && num != 10) {
			return "even";
		}
		
		if (num == 10) {
			return "ten";
		}
		
		return "odd";
	}
	

}
