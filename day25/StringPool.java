package day25;

public class StringPool {
	public static void main(String[] args) {
		// == equal operator
		// is used to compare primitives on equality
		
		// How does == work with references?
		// it doesn't work with equality, it works with pointing
		// It will return true if two references(objects)
		// are pointing to the same object
		// otherwise false
		
	  //pointer
		A ref = new A();
		A ref1 = new A();
		System.out.println(ref == ref1); // false
		
	 //now ref points where the ref1 is pointing
		ref = ref1;
		System.out.println(ref == ref1); // true
		System.out.println("-----");
		
		String str = "apple";
		String str1 = "apple";
		String str2 = new String("apple");
		
		// They both are pointing to the same object
		System.out.println(str == str1); // true
		
		// str & str2 are pointing to different objects
		System.out.println(str1 == str2); //false
		
	}
}
class A {
	
}

