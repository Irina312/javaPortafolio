package day19;

public class WhileLoop {
	public static void main(String[] args) {
		// print 30 times "Java is great!"
		
		// it will looping while the condition is true
		// when it's false it will exit
		
		int count = 0;
		//
		while (count < 30) {
			System.out.println(count + ". Java is great!");
			count++;
		}
	}

}
