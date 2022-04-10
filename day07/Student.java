package day07;

public class Student {
	public static void main(String [] args) {
		String name = "John";
		double grade = 75.0;
		
		System.out.println("Student name is " + name);
		System.out.println("Student garade is " + grade);
		
		//TODO Increase the value of grade by 8 %
		double increaseNumber = (grade * 8) / 100;
		System.out.println("8% out of " + grade + " is " + increaseNumber);
		grade = grade + increaseNumber;
		
		System.out.println("Student name is " + name);
		System.out.println("Student grade is " + grade);
		
				
	}

}
