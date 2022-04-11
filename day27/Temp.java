package day27;

public class Temp {
	public static void main(String[] args) {
		
		double[] temp = {32, 30, 25.7, 27, 26, 24, 31.5, 29};
		
		// find out the sum from temp
		double sum = 0.0;
		
		// loop to go over the array
		for (int i = 0; i < temp.length; i++) {
			// keep adding element value to sum
			sum += temp[i]; // sum = sum + temp[i];
		}
		
		System.out.println("Sum is " + sum);
		
		// find out average  value from temp
		double averageTem = sum / temp.length;
		System.out.println("Average is " + averageTem);
		
		// print value from temp array that greater than average
		for (int a = 0; a < temp.length; a++) {
			if (temp[a] > averageTem) {
				System.out.println(temp[a]);
			}
		}
	}
}
