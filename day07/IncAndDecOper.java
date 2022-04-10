package day07;

public class IncAndDecOper {
	public static void main(String[] args) {
		int num = 19;
		//     19 + 1
		num = num + 1;
		System.out.println("Original way: " + num); // 20
		
		// post increment operator will increase value by 1
		num++;
		System.out.println("Post increment: " + num);  // 21
		
		// post decrement operator will decrease value by 1
		num--;
		System.out.println("Post decrement: " + num); // 20
		
		++num;
		System.out.println("Pre increment: " + num); // 21
		
		
		--num;
		System.out.println("Pre decrement: " + num); // 20
		
		// Post increment/decrement will be applied when variable is used next time;
		// Pre increment/decrement will be applied immediately.
		
		num = 5;
		System.out.println(num++); // 5
		System.out.println(num); // 6
		System.out.println(num); // 6
		
		System.out.println(++num); // 7
		
		
		num = 10;
		//         10   + 2
		int res = num++ + 2;
		System.out.println(res); // 12
		System.out.println(num); // 11
		
		
		
		
		
		
	}

}
