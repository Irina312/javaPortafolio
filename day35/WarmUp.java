package day35;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
							// interview question
public class WarmUp {
	public static void main(String[] args) {
		// What the difference between Array & ArrayList?
		// - ArrayList has dynamic size & Array has a fixed size
		// - ArrayList works only with objects, Array works with primitives & objects
		
		// List is interface & ArrayList is concrete class of it
		// This is more preferable way of creating list:
		List<String> books = new ArrayList<>();
		books.add("OCA");
		books.add("OCP");
		books.add("Algorithm in Java");
		books.add("Java Head First");
		books.add("Clean Code");
		
		System.out.println(books);
		System.out.println(books.size());
		
		// 1. loop over the list & print each element in the new line
		for (String book : books) {
			System.out.println(book);
		}
			System.out.println(("-----"));
		
		// 2. loop over the list from the back & print reverse order
		for (int j = books.size() - 1; j >= 0; j--)	 {
			
		   System.out.println(books.get(j));
		}
	}
}


