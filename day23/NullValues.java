package day23;

public class NullValues {
  public static void main(String[] args) {
	  
	  String name = "John";
	  String str = null; // str doesn't point to any object
	  
	  Person person = new Person();
	  Person person2 = null;
	  
	  // NullPointExeption
	  // When you use properties or method of reference that points to null,
	  // you will get NullPointExeption
	  
	  System.out.println(person2); // null
	  // person2.name = "Kuba": // NullPointExeption here
	  
	  // Garbage Collector
	  // The main role of GC is to clean up unused objects
	  // It's 100% automatic process so we, developers, don't touch it
	  // 
	  // 
	  
	  Person obj1 = new Person("John", 28);
	  Person obj2 = new Person("Alex", 34);
	  
	  // obj1 will point where the obj2 is pointing
	  // and a new Person("John", 28); is eligible for GC
	  
	  obj1 = null;
	  obj2 = null;
  }
}

class Person {
	public String name;
	public int age;
	
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
