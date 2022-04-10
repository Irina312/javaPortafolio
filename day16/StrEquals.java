package day16;

public class StrEquals {
	public static void main(String[] args) {
		// To compare two Strings on equality we use .equals method
		// It will return TRUE if they are equal

		String box = "apple";
		String box2 = "apple";

		if (box.equals(box2)) {
			System.out.println(box + " and " + box2 + " are equal");
		} else {
			System.out.println(box + " and " + box2 + " are not equal");
		}

		// Never use == for String comparison;
		System.out.println(box == box2);

		// ALWAYS use .equals method
		System.out.println(box.equals(box2));

		String name = "John";
		String name2 = new String("John");
		System.out.println(name); // John
		System.out.println(name2); // John

		System.out.println(name == name2); // false
		System.out.println(name.equals(name2)); // true
	}

}
