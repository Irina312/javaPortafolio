package day34;

public class Review {
	public static void main(String[] args) {
		// Vararg
		
		int res = multiply(2, 2);
		System.out.println("res: " + res);
		
		System.out.println("res2: " + multiply(1, 2, 3));
		
		int[] input = {1, 2, 3, 4, 5};
		System.out.println("res3: " + multiply(input));
		
	}
	public static int multiply(int... nums) {
		// 1. Only one vararg per method argument
		// 2. When vararg is used with other arguments 
		//    it should be the last one (see day 33)
		int sum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			sum *= nums[i];
		}
		return sum;
	}

}
