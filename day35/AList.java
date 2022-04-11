package day35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

							// interview question
public class AList {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>(50);
		
		// !! INTQUESTION Internally ArrayList is based on array
		// new ArrayList<>(50) -> we can specify the initial size of our list (array size)
		// !! INTQUESTION By default ArrayList allocates array with size 10
		// & when we will keep adding new elements ArrayList will grow the size
		// of internal array automatically
		
		List<Integer> l2 = new ArrayList<>(Arrays.asList(5, 3, 2, 1));
		List<Integer> l3 = l2;
		// List<Integer> l3 = new ArrayList<>(l2); //-> point to different object 
												   //   & will copy the value of l2
		
		System.out.println(l2); // [5, 3, 2, 1]
		System.out.println(l3); // [5, 3, 2, 1]
		// l2 & l3 are pointing to the same object
		
		l3.add(7);
		// because l2 & l3 are pointing to same object, 7 was added to both of them
		
		System.out.println(l2); // [5, 3, 2, 1, 7]
		System.out.println(l3); // [5, 3, 2, 1, 7]
		
		// After creating a new ArrayList<>(l2); line 20
		// System.out.println(l2); // [5, 3, 2, 1]
		// System.out.println(l3); // [5, 3, 2, 1, 7]
	}
}
