package day34;

import java.util.Arrays;
import java.util.ArrayList;

public class Numbers {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
		
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list); // [1, 2, 3, 4, 5]
		
		ArrayList<Character> listChar = new ArrayList<>();
		listChar.add('a');
		listChar.add('b');
		listChar.add('c');
		System.out.println(listChar); // [a, b, c]
	}

}
