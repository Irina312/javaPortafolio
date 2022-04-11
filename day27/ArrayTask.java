package day27;

import java.util.Arrays;

public class ArrayTask {
	private static final String[] String = null;

	public static void main(String [] args) {
		
		// print all names in upper case in the new lines using loop
		String[] name = {"Isla", "Alex", "Olivia", "Aurora", "Cora", "Ang"};
		 		
		for (int a = 0; a < name.length; a++) {
			// name[a] = name[a].toUpperCase();
			System.out.println(name[a].toUpperCase());
			
		}
		
		System.out.println("-----");
		
		// find out & print average value from score array using loop
		byte[] score = {9, 8, 7, 5, 5, 6, 9, 10};
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		
			System.out.println("Average is " + sum / score.length);
				
		}
		
		System.out.println("-----");
		
		// print numbers from coordinate array in reverse order 
		// in the same line separated by comma
		double[] coordinate = {3.5, 5.9, 2.1, 1.9};
		for (int b = coordinate.length - 1; b >= 0; b--)
			System.out.println(coordinate[b] + ", ");
		
		System.out.println("\n-----");
		
		// assign values to array from 1 to 100 using loop
		int [] number = new int[100];

		for (int i = 0; i < 100; i++) {
			number[i] = i + 1;
		}
		System.out.println(Arrays.toString(number)); 
	}
	}

