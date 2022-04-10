package day08;

public class HowToGetHigh { // created by Max Busin 
	public static void main(String[] args) {
	
	String name = "Alex";
	int money = 50;
	
	getHigh (name, money);
	
	// int st = getHigh(name, money);
	// System.out.println(st);
	
	// System.out.println("For this money " + name + " you csn get " + getHigh(name,
	// money ) + " grams"+"!");
	
}

	public static int getHigh(String name, int money) {
		
		System.out.println("Hey " + name + " a method to blast properly is to buy some good part from a well known dealer!");
		
		int oneGramm = 5;
		int stuff = money / oneGramm;
				
		System.out.println("For this money " + name + " you can get " + stuff + " gramms!");
		
		return stuff;
	
}
	}
