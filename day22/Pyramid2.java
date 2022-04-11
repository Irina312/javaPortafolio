package day22;

public class Pyramid2 {
	public static void main(String[] args) {
		int num = 5;
		/*
		 *     #
		 *    ##
		 *   ###
		 *  ####
		 * #####    
		 */
		String p = "#";
		do {
			System.out.println(p);
		
		} while (num <  1 || num > 8);
		for (int i = 0; i < num; i++) {
			String space = "";
			for (int a = 0; a < num - 1 - i; a++) {
				space += " ";
			}
			
			System.out.println(space + p);
			p += "#";
		}
	}
}