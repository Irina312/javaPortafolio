package day28;

import java.util.Arrays;

public class ArrRef {
	public static void main(String[] args) {
		String[] arrStr = {"a", "b", "c"};
		String[] arrStr2 = arrStr;
		// arrStr & arrStr2 are pointing to the same array which was created
		arrStr2[0] = "e";
		// Arrays work with references similar as objects;
		
		// Because arrStr & arrStr2 are pointing to the same array,
		// when the first element was changed, 
		// the change will take place in arrStr & arrStr2;
		System.out.println(Arrays.toString(arrStr)); // [e, b, c]
		System.out.println(Arrays.toString(arrStr2)); // [e, b, c]
		
		System.out.println(arrStr);
		System.out.println(arrStr2);
		
		arrStr[2] = "x";
		System.out.println(Arrays.toString(arrStr)); // [e, b, x]
		System.out.println(Arrays.toString(arrStr2)); // [e, b, x]
		System.out.println("-----");
		
		int num = 17;
		changeNum(num);
		System.out.println(num); // 17
		// because it's a primitive, and immutable it won't be changed;
		// primitives don't pass the reference, they always take copy
				
		// The same with String
		String str = "apple";
		changeStr(str);
		System.out.println(str); // apple
		
		System.out.println("-----");
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
		changeArr(arr);
		System.out.println(Arrays.toString(arr)); // [7, 7, 7, 7, 7]
	}
	public static void changeArr(int[] numArr) {
		// numArr = arr; and now it's pointing to the same array
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = 7;
		}
	}
	public static void changeNum(int i) {
		// primitives don't work with references
		i = 10;
	}
	public static void changeStr(String str) {
		str = "orange";
	}
}
