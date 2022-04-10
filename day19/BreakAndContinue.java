package day19;

public class BreakAndContinue { 
	
	public static void main(String[] args) {
		int count = 10;
		
		while (count < 10) {
			System.out.println(count);
			count++;
			if (count == 7) {
				break;
		}
	}
		System.out.println("-----");
		int i = 0;
		//     1 < 10
		while (i < 10) {
			i++;
			
			if (i % 2 == 1) {
				continue; // it skips the rest of the code of the loop 
				          //and goes next iteration (repeat)
				}
			System.out.println(i);
		}
			
		}

}
