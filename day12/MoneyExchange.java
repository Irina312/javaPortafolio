package day12;

public class MoneyExchange {
	public static final double RUBLE_EXCHANGE_RATE = 0.013;
	
	public static double exchangeRub(final int rub) {
		return rub * RUBLE_EXCHANGE_RATE;
		}
	public static void main(String[] args) {
		int rub = 150;
		System.out.println(exchangeRub(rub)); 
		
		final String name = "John";
		// name = "Will"; we can't change the original value because it's FINAL
		
		// Constants:
		// 1. static final is making the variables as a constant
		// 2. it's common approach to name constants with  all UPPER CASES
		// 3. we can't change value of constants after it's being assigned
		
		// final keyword
		// when we tag our variables with final, we can't reassign new value
		// 1. we can tag our local variables as final;
		// 2. we can tag our method arguments as final
		// 3. class level (static, instance) variables are also can be final
		
	}

}
