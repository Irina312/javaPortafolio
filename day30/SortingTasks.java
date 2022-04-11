package day30;

import java.util.Arrays;

public class SortingTasks { // interview questions
	public static void main(String[] args) {
		System.out.println(isAnagram("abc", "bca")); // true
		System.out.println(isAnagram("triangle", "integral")); // true
		System.out.println(isAnagram("aaa", "a")); // false
		System.out.println(isAnagram("a", "aa")); // false
		System.out.println("-----");
		
		int[] numArr = {4, 3, 2, 8, 9, 5};
		System.out.println(maxN(numArr, 1)); // 9
		System.out.println(maxN(numArr, 2)); // 8
		System.out.println(maxN(numArr, 3)); // 5
		System.out.println(maxN(numArr, 100)); // 0
	}
	/*
	 * maxN([4, 3, 2, 8, 9, 5], 1); -> 9
	 * maxN([4, 3, 2, 8, 9, 5], 2); -> 8
	 * maxN([4, 3, 2, 8, 9, 5], 3); -> 5
	 * maxN([4, 3, 2, 8, 9, 5], 100); -> 0
	 * 
	 * 1. handle negative case when n > array size
	 * 2. sort array
	 * 3. return n biggest by using array length and n
	 */
	public static int maxN(int[] arr, int n) {
		if (n > arr.length) {// || n < 1) { // n < 1 -> isn't a part of requirement
			return 0;
		}
		Arrays.sort(arr);
		
		return arr[arr.length - n];
	}
	/*
	 * anagram where each char of str exist in str1
	 * isAnagram("abc", "bca"); -> true
	 * isAnagram("Hello", "Heelo"); -> false
	 * isAnagram("triangle", "integral"); -> true
	 * isAnagram("aaa", "a"); -> false
	 * 
	 * 1. sort both strings
	 * 2. compare them
	 */
	public static boolean isAnagram(String str, String str1) {
		// 1. compare the length of strings
		if (str.length() != str1.length()) {
			return false;
		}
		// 2. create elements for each char 
		char[] strArr = str.toCharArray(); // [a, b, a]
		char[] strArr1 = str1.toCharArray(); // [b, c, a]
		// 3. sort arrays
		Arrays.sort(strArr); // [a, b, c]
		Arrays.sort(strArr1); // [a, b, c]
		// 4. compare each element from strArr & strArr1
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != strArr1[i]) {
				return false;
			}
		}
		
		return true;
	}

}
