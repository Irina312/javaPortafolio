package day35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Countries {
	public static void main(String[] args) {
		// Arrays.asList(T...) returns fixed-size list back by specified array
		//										    fixed-size  specified array
 		List<String> countries = Arrays.asList("USA", "Bolivia", "France", "Brazil");
		System.out.println(countries);
		// When we create our list as Arrays.asList(...), it will be fixed-size list
		// If we will add new elements or remove, it will throw java.lang.UnsupportedOperationException
		// countries.add("Argentina"); // java.lang.UnsupportedOperationException
		// countries.remove(0); // java.lang.UnsupportedOperationException
		
		System.out.println("-----");
		// We can pass asList(...) as argument to ArrayList & it will return regular dynamic-size list
		List<String> countries2 = new ArrayList<>(Arrays.asList("USA", "Bolivia", "France", "Brazil"));
		System.out.println(countries2);
		
		countries2.add("Argentina");
		System.out.println(countries2);
		System.out.println("-----");
		
		// 1. loop over the list countries2 & print each element in a new line by using regular loop
		for (int i = 0; i < countries2.size(); i++) {
			System.out.println(countries2.get(i));
		}
		System.out.println("-----");
		
		// 2. loop over the list countries2 & print each element in a new line by using each loop
		for (String country : countries2) {
			System.out.println(country);
		}
		System.out.println("-----");
		
		// 3. loop over the list countries2 & print each element in a new line by using Iterator
		Iterator<String> iterator = countries2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-----");
		// 4. loop over the list countries2 & print each element in a new line by using stream function
		countries2.forEach(element -> { // instead element it can be any word
			System.out.println(element);
		});
	}
}
