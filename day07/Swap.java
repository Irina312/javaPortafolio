package day07;

public class Swap {
	public static void main(String[] args) {
		String sky = "yellow";
		String sun = "blue";
		
		// TODO - swap values of variables sky and sun
		// without direct reassignment.
		
		String tmp = sky;
		sky = sun;
		sun = tmp;
		
		System.out.println("Sky is " + sky); // Sky is blue
		System.out.println("Sun is " + sun); // Sun is yellow
		
		
	}

}
