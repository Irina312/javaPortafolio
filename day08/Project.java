package day08;

public class Project {
	public static void main(String[] args) {
		// 1 -99
		// /
		// %
		/*
		 * One quarter is 25 cents
		 * One dime is 10 cents
		 * One nickel is 5 cents
		 * One penny is 1 cent
		 */
		
		int amount = 87;
		
		int q, d, n, p;
		
		q = amount / 25;
		System.out.println(amount); // 3
		
		//25 + 25 + 25 + 12
		amount = amount % 25;
		System.out.println(amount); // 12
		
		// 10 + 2
		d = amount / 10;
		System.out.println(d); // 1
		
		amount = amount % 10;
		System.out.println(amount); // 2
		
		n = amount / 5;
		System.out.println(n); // 0
		
		amount = amount % 5;
		System.out.println(amount); // 2
		
		p = amount / 1;
		System.out.println(p); // 2
		
		amount = amount / 1;
		System.out.println(amount); // 2
		
		
		
		
		
	}

}
