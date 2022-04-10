package day11;

public class AirPressure {
	public static void main(String[] args) {
		double pressure = 13.5;

		// if pressure is from 13.5 to 15.5 inclusive then "normal pressure"
		// if pressure is less than 13.5 then "low pressure"
		// if pressure is greater than 15.5 then "high pressure"

		if (pressure >= 13.5 && pressure <= 15.5) {
			System.out.println("normal pressure");
			
		} else if (pressure < 13.5) {
			System.out.println("low pressure");

		} else if (pressure > 15.5) {
			System.out.println("high pressure");

		} else {
			System.out.println("unknown");
		}
		
		// 1. Only one branch can be executed
		// 2. The more specific condition should go first

	}
}