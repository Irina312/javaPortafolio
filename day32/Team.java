package day32;

import java.util.Arrays;

public class Team {
	public static void main(String[] args) {
		String[][] rows = {{ "apple", "orange" }, { "kiwi", "banana" }, { "blueberry", "pineapple", "berry" } };

		System.out.println(rows.length); // 3
		System.out.println(rows[0].length); // 2
		System.out.println(rows[1].length); // 2
		System.out.println(rows[2].length); // 3

		// print each element of rows 2 dim array on new lines
		// way # 1 if you need to change the array because it uses indexes
		// for example to change to upper case
		
			for (int i = 0; i < rows.length; i++) {
			for (int j = 0; j < rows[i].length; j++) {
				// rows[i][j] = roes[i][j].toUpperCase();
				System.out.println(rows[i][j]);
			}
		}
		// System.out.println(Arrays.deepToString(rows));
		System.out.println("-----");
		
		// way # 2 this is mainly for reading arrays
		for (String[] arr : rows) {
			for (String str : arr) {
				System.out.println(str);
			}
		}
		System.out.println("-----");
		// we can label our loops & while using break or continue
		// we can specify by label which loop to break/continue
		outerLoop:
		for (int i = 0; i < rows.length; i++) {
			for (int j = 0; j < rows[i].length; j++) {
				if (rows[i][j].equals("banana")) {
					System.out.println("Banana is here");
					break outerLoop;
				}
			}
		}		
	}
}
