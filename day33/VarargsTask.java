package day33;

public class VarargsTask {
	public static void main(String[] args) {
		double d = min(5.1, 1.1, 2.9, 3.0, 0.5);
		System.out.println(d); // 0.5

		System.out.println(min(2.5, 3.9)); // 2.5

		double[] arrD = { 1.9, 9.9, 6.7, 4.4, 2.1, 1.1, 9.8 };
		System.out.println(min(arrD)); // 1.1
	}

	// Create a method min that will work for all above inputs
	// & return the smallest value
	public static double min(double... dNums) {
		double dMin = dNums[0];

		for (double num : dNums) {
			if (dMin > num) {
				dMin = num;
			}
		}
		return dMin;
	}
}
