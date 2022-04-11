package day33;

import java.util.Arrays;

public class PassByReference {
	public static void main(String[] args) {
		// 1. Custom Objects (what we create), mutable objects
		// 2. Arrays
		
		int[] numArr = { 1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(numArr)); // [1, 2, 3, 4, 5]
		
		m(numArr); // passing the reference, not a value
		System.out.println(Arrays.toString(numArr)); // [99, 99, 99, 99, 99]
		System.out.println("-----");
		
		Person obj = new Person("John", 26);
		System.out.println(obj.name + ", " + obj.age); // John, 26
		m2(obj);
		System.out.println(obj.name + ", " + obj.age); // Alex, 33
		System.out.println("-----");
		
		String str = "wooden spoon";
		System.out.println(str); // wooden spoon
		m3(str);
		System.out.println(str); // wooden spoon -> because string is immutable
		System.out.println("-----");
		
		StringBuilder sb = new StringBuilder();
		sb.append("wooden spoon");
		System.out.println(sb); // wooden spoon
		m4(sb);
		System.out.println(sb); // wooden spoonapple
	}
	public static void m4(StringBuilder sbI) {
		sbI.append("apple");
	}
	
	public static void m3(String str) {
		str = "apple";
	}
	
	public static void m(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 99;
		}
	}
	public static void m2(Person iObj) {
		iObj.name = "Alex";
		iObj.age = 33;
	}
}

class Person {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

