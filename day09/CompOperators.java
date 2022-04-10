package day09;

public class CompOperators {
	public static void mani(String[] args) {
		int i = 12;
		int j = 14;
		
		// Comparison expressions return boolean
		// == equal operator compares primitives on equality
		
		System.out.println(i == j); // false
		boolean isEqual = i == j;
		
		i = 7;
		j = 7;
		isEqual = i == j;
		System.out.println("Is equal: " + isEqual);
		
		// != not equal operator; it will return true if two primitives 
		// not equal to each other
		boolean notEqual = i != j;
		System.out.println("Not equal: " + notEqual); // false
		
		i = 10;
		j = 9;
		notEqual = i != j;
		System.out.println("Not equal: " + notEqual);
		
		// >
		// <
		boolean isGreater = i > j;
		System.out.println(isGreater);
		System.out.println(i < j); // 10 < 9 => false
		
		// >= -> greater or equal
		// <= -> less or equal
		i = 2;
		j = 2;
		
		// 2 >= 2 -> true
		// 5 >= 2 -> true
		// 2 > 2 -> false
		System.out.println(i >= j);
		
				

		}

}
