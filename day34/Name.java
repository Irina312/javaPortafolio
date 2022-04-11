package day34;
import java.util.ArrayList;

public class Name {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list); // [A, B, C]
		
		// list[0]
		System.out.println(list.get(0)); // A
	}

}
