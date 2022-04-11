package day34;

import java.util.ArrayList;

public class Car {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("bmw");
		cars.add("audi");
		cars.add("honda");
		cars.add("tesla");
		System.out.println(cars);
		
		int s = cars.size(); // returns the number of elements inside array 
		System.out.println("Size: " + s); // Size: 4
		
		cars.add("ford");
		System.out.println("Size: " + cars.size()); // Size: 5
		System.out.println(cars); // [bmw, audi, honda, tesla, ford]
		
		// remove(index), remove(value)
		cars.remove(0); // remove by index
		System.out.println(cars); // [audi, honda, tesla, ford]
		System.out.println("Size: " + cars.size()); // Size: 4
		
		cars.remove("honda"); // remove by value
		System.out.println(cars); // [audi, tesla, ford]
		
		// clear() removes all elements from the ArrayList
		cars.clear();
		System.out.println(cars); // []
		cars.add("bmw");
		cars.add("tesla");
		cars.add("honda");
		System.out.println(cars); // [bmw, tesla, honda]
		System.out.println("-----");
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(i + " " + cars.get(i));
		}
		System.out.println("-----");
		
		for (String str : cars) {
			System.out.println(str); 
		}
	}
}

