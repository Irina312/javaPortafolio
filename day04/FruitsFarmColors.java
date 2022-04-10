package day04;

public class FruitsFarmColors {
	
	public static void main(String[] args) {
		String apple = "pink";
		String banana = "yellow";
		String orange = "orange";
		String kiwi = "kiwi";
		String pear = "red";
		
		System.out.println(apple);
		System.out.println(banana);
		System.out.println(orange);
		System.out.println(kiwi);
		System.out.println(pear);
		
		System.out.println(apple + "," + banana); //apple, banana
		
		String allFruits = apple + ", " + banana + ", " + orange + ", " + kiwi + ", " + pear; 
		System.out.println("Fruits: " + allFruits);
	}
}
