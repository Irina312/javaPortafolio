package day34;

import java.util.ArrayList;

public class City {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Aldie");
		cities.add("Chantilly");
		cities.add("Tysons");
		cities.add("DC");
		cities.add("Hyannis");
		
		// contains
		if (cities.contains("Aldie")) {
			System.out.println("Aldie is in the cities' list");
		} else {
			System.out.println("Aldie isn't in the cities' list");
		}
		
		boolean isThere = cities.contains("DC");
		System.out.println(isThere); // true
		
		// indexOf
		int i = cities.indexOf("DC");
		System.out.println("DC: " + i); // DC: 3
		System.out.println(cities.indexOf("Aldie")); // 0
		System.out.println(cities.indexOf("Paris")); // -1 because Paris isn't in the list
		System.out.println(cities.indexOf("Tysons")); // 2
		
		System.out.println(cities.indexOf("dc"));
		System.out.println(indexOfIgnoreCase(cities, "dc")); 
		
		System.out.println("-----");
		
		// print elements from cities lost in the new line
		// if element length is even
		
		for (String city : cities) {
			if (city.length() % 2 == 0) {
				System.out.println(city);
			}
		}
	}
		
	private static int cities(int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static int indexOfIgnoreCase(ArrayList<String> list, String target) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equalsIgnoreCase(target)) {
				return i;
			}
		}
		
		return -1;
	}

}
