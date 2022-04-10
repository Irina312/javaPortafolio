package day04;

public class Var {
	public static void main(String[] args) {
		String firstName;
		firstName = "John";
		
		System.out.println(firstName);  // John
		
		
		// reassigning new value
		firstName = "Smith";
		System.out.println(firstName);  // Smith
		
		firstName = "Alex";
		System.out.println(firstName);  // Alex
		
		// We cannot declare variables with the same name
		
		String lastName = "Doe";
		System.out.println(lastName);  // Doe
		
		// We can declare multiple variables in the same statement
		String address = "101 Main St", state = "VA", country = "USA";
		
		String address1 = "200 North St";
		String statae1 = "MA";
		String country1 = "USA";
		
	}

}
