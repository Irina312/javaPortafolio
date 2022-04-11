package day21;

public class ForLoop {
 public static void main(String[] args) {
	 
	 for (int i = 0; i < 10; i++) {
		 if (i == 0) {
			 break; // it will exit the loop
		 }
		 System.out.println(i + " ");
	 }	 
		 // print numbers from 1 to 100
		 // but skip 7, 13, 99
		 for (int i = 1; i <= 100; i++) {
			 if (i == 7 || i == 13 || i == 99) {
				 
			 }
			 System.out.println(i + " ");
		 }
		 System.out.println("-----");
		 String str = "J%oh$$n D5o&e%";
		// print each char of str one by one in a new line
		// skip special chars - % and $
		for (int i = 0; i < str.length(); i++) {					// char ch == str.charAt(i)
			if (str.charAt(i) == '%' || str.charAt(i) == '%') {		// if (ch == '%' || ch == '$') {
				continue;
			}
			System.out.println(str.charAt(i));
		}
	}
}
