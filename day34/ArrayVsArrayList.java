package day34;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
	public static void main(String[] args) {
		/*
		 * Array is collection of data of the same type
		 * - it's fixed size
		 * - array can work with primitives & objects
		 */
		String[] names = new String[3];
		names[0] = "John";
		names[1] = "Bob";
		names[2] = "Alex";
		// name[3] = "Kuba";
		
		System.out.println(names);
		
		String str = names[0];
		System.out.println(Arrays.toString(names));
		names[2] = "Bek";
		
		
		/*
		 * ArrayList is collection of data of the same type
		 * - it has dynamic size
		 * - arrayList can work only with objects
		 */
		ArrayList<String> listName = new ArrayList<>();
		listName.add("John");
		listName.add("Bob");
		listName.add("Alex");
		listName.add("Kuba");
		System.out.println(listName);
		
		String firstElement = listName.get(0);
		String secondElement = listName.get(1);
		
		System.out.println("First element: " + firstElement);
		System.out.println("Second element: " + secondElement);
		
		listName.add("Ramesh");
		System.out.println(listName); // [John, Bob, Alex, Kuba, Ramesh]
		
		listName.add(0, "Vijay"); // to add new element to the wanted position
		System.out.println(listName); //[Vijay, John, Bob, Alex, Kuba, Ramesh]
		
		listName.add(1,"Uros");
		System.out.println(listName); // [Vijay, Uros, John, Bob, Alex, Kuba, Ramesh] 
		
		listName.set(0,  "Smith");
		System.out.println(listName); // [Smith, Uros, John, Bob, Alex, Kuba, Ramesh]
		
		listName.set(6, "Milena");
		System.out.println(listName); // [Smith, Uros, John, Bob, Alex, Kuba, Milena]
		
		/*
		 * add(value) -> add new value to the list
		 * add(index, value) -> add new value to specified index
		 * get(index) -> reads the element under this index
		 * set(index, newValue) -> changes element's value in specified index
		 */
	}
}
