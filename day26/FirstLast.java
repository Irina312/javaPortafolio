package day26;
import java.util.Arrays;

public class FirstLast {
	public static void main(String[] args) {
		String[] team = {"Thomas", "Andrew", "Mary"};
		// ["Thomas"] ["Andrew"] ["Mary"]
		System.out.println(team[0]);
		System.out.println(team[1]);
		System.out.println(team[2]);
		
		// Another way to create an array
		String[] team2 = new String[3];
		team2[0] = "Thomas";
		team2[1] = "Andrew";
		team2[2] = "Mary";
		
		System.out.println(team); // [Ljava.lang.String;@6504e3b2
		// Array works the same way as objects do
		System.out.println(Arrays.toString(team)); // [Thomas, Andrew, Mary]
		
		// we can use .length to find out the size of array
		// here length is instant variable of array, not a method
		int arrSize = team.length;
		System.out.println("Size of array: " + arrSize); // 3

		// print first & last elements of array without knowing the size of array
		//                  0     1     2     3     4     5     6
		double[] tmpWeek = {32, 35.5, 25.7, 26.9, 31.5, 29.9, 28.1};
		System.out.println("Size: " + tmpWeek.length); 
		System.out.println("First: " + tmpWeek[0]);
		System.out.println("Last: " + tmpWeek[tmpWeek.length - 1]);
	}

}
