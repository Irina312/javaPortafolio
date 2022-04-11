package day34;

import java.util.ArrayList;

public class Fruit {
	/*
	 * add(value)
	 * get(index)
	 * size() - size of list
	 */
	public static void main(String[] args) {
		 // crate an ArrayList<String> fruit
		// add any 4 elements(fruit names)
		// print each value in a new line by using a loop
		
		ArrayList<String> fruit = new ArrayList<>();
		fruit.add("apple");
		fruit.add("apricot");
		fruit.add("pear");
		fruit.add("cherry");
		
		for (int i = 0; i < fruit.size(); i++) { // for (String str : fruit) { -> for each loop
			
			System.out.println(fruit.get(i));    // System.out.println(str);
		}
		
		System.out.println("-----");
		
		fruit.set(0, fruit.get(0).toUpperCase());
		System.out.println(fruit); // [APPLE, apricot, pear, cherry]
		
		System.out.println("-----");
		// write a code to make all elements of the list to upper case
		String upperCase = " ";
		for (int i = 0; i < fruit.size(); i++) {
			fruit.set(i, fruit.get(i).toUpperCase());
		}
		System.out.println(fruit); // [APPLE, APRICOT, PEAR, CHERRY]
	}
}
