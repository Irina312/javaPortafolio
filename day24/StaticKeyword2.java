package day24;

public class StaticKeyword2 {
	// - inside static methods we can call/used
	// only static methods & variables
	// - inside non static methods we can use
	// static variables & methods directly
	public static String str;
	public int num;

	public static void m() {
		System.out.println("inside m()");
		m2();
		// m3(); non static methods can't be called
		// from static method directly

		// if you really want to use then
		// you have to create object & call
		// StaticKeyword2 obj = new StaticKeyword2();

		System.out.println(str);
		// System.out.println(num); non static, can't be used
	}

	public static void m2() {
		System.out.println("inside m2()");
	}

	public void m3() {
		System.out.println("inside m3()");
		m2();
		System.out.println(str);
		System.out.println(num);
	}
}
