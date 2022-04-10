package day06;

public class InstanceVariables {
	private String firstName;
	private String lastName;
	private int age;
	
	public static void main(String[] args) {
		/*
		 * Instance variable are variables created under the class.
		 * - They are properties of the object of that class;
		 * - They have default value;
		 * - They can have access modifiers.
		 */
		
		// System.out.println(firstNmae); we can't use instance variables
		// in the main method directly.
		
		
		InstanceVariables obj = new InstanceVariables();
		obj.firstName = "John";
		
		
	}

}
