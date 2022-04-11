package day23;

public class Table {
	public String type;
	public String color;
	public int height;
	public boolean isReserved;
	
	// constructor is a special method to create an object
	// - it has the same name as a class name
	// - by default java provides one empty constructor
	// when you define your own constructor
	// java will no longer provide the default constructor
	public Table() {
		System.out.println("in empty constructor");
	}
	
	public Table(String type, String color, int height, boolean isR) {
		this.type = type;
		this.color = color;
		this.height = height;
		isReserved = isR; // this.isReserved = isR;
	}
	// implement method that prints all properties
	
	public void printDetails() {
		System.out.println("Type: " + type);
		System.out.println("Color: " + color);
		System.out.println("Height: " + height);
		System.out.println("Is reserved: " + isReserved);
	}

}
