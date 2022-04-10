package day06;

public class Book {
	public static String title = "Peter Pan";
	public static int numberOfPages = 400;
	public static double price = 24.99;
	
	public static void main(String[] args) {
		System.out.println(title);
		System.out.println(numberOfPages);
		System.out.println(price);
		
		title = "Java OCP";
		numberOfPages = 700;
		price = 49.99;
		
		System.out.println(title);
		System.out.println(numberOfPages);
		System.out.println(price);
		
	}

}
