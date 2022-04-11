package day27;

public class WarmUp {
	public static void main(String[] args) {
		// Array is a collection of data of the same type
		// Array is fixed size collection (we need to give a size)
		// Array works exactly the same way as object
		// Each element of array has index starts from 0
		// If we don't assign any value for array elements, they will have default
		// values

		String[] javaClass = new String[5];

		javaClass[0] = "Mary";
		javaClass[4] = "John";
		// If we don't assign any value for array elements, they will have default
		// values
		System.out.println(javaClass[1]);
		// Objects(String) -> null
		// Numeric(int, double) -> 0
		// boolean -> false

		// create array with values in the same line
		// 				 0  1  2  3  4
		int[] arrNum = { 4, 5, 6, 9, 3 }; 
		System.out.println(arrNum[0]); // 4
		System.out.println(arrNum[4]); // 3

		// How to get the length of array?
		// .length will return the size of array
		int size = arrNum.length;
		System.out.println("Size: " + size);

		for (int i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
	}
}
