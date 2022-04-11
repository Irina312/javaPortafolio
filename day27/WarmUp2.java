package day27;

public class WarmUp2 {
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 5, 9};
		 System.out.println(is7There(nums)); //false
		 
		 nums = new int[] {2, 5, 7, 8, 10, 11};
		 System.out.println(is7There(nums)); // true
		 
		 nums = new int[] {7, 2, 3};
		 System.out.println(is7There(nums)); // true
	}
	/*
	 * return true if argument arrNumhas 7
	 * is7There([1, 3, 4, 5, 9])  -> false
	 * is7There([2, 5, 7, 8, 10, 11]) -> true
	 * is7There([7, 2, 3]) -> true 
	 */
	public static boolean is7There(int [] arrNum) {
		
		// 1. Using for loop, go over each element of array
		// 2. Check if element is 7, if yes return true 
		//    otherwise keep checking next element
		// 3. After the loop if 7 wasn't there return false
		
		//           0  1  2  3  4   5
		// arrNum = [2, 5, 7, 8, 10, 11]
		for (int i = 0; i < arrNum.length; i++) {
			//         2
			//  arrNum[0] ==  -> false
			if (arrNum[i] == 7) {
			return true;
		}
	}
		return false;
  }

}
