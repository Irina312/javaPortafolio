package day20;

public class ForLoop2 {
	public static void main(String[] args) {
		// write a program that will print 5 times
		// "Java is awesome!" by using for loop
		for (int i = 0; i < 5; i++) {
			System.out.println("Java is awesome!");
	}
				
		// write a program that will print numbers from 1 to 100 inclusive
		// in the same line by using for loop
		
		for (int i = 0; i <=100; i++) { // for (int i = 0; i < 101; i++) {
			System.out.print(i + " ");
		}
			System.out.println();
			System.out.println("-----");
		
	    // write a program that will print numbers from 100 to 1 inclusive
		// in the same line by using for loop
		
		for (int i2 = 100; i2 >=1; i2--) {
			System.out.print(i2 + " ");
	}	    
	}
}
