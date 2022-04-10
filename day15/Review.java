package day15;

public class Review {
	 public static void main(String[] args) {
	        // how to find out the number of characters in the string
	        // By using length() method

	        String str = "Tech Lead Academy";
	        int size = str.length();  // <- statement which calls a method, in this case will return a number

	        System.out.println("size: " + size);
	        // or
	        System.out.println("size2: " + str.length());

	        System.out.println(str); // Tech Lead Academy
	        // toUpperCase()
	        // toLowerCase()

	        String upperStr = str.toUpperCase(); // to change to upper case, str should be reassigned
	        System.out.println(str); // Tech Lead Academy
	        System.out.println(upperStr); //TECH LEAD ACADEMY

	        String lowerCase = str.toLowerCase();
	        System.out.println(lowerCase); // tech lead academy
	        
	        //             0123456789
	        String str1 = "Softskills";
	        System.out.println(str1);
	        
	        // when substring is used with two indexes
	        // first index is a starting point which will include the current char
	        // second index is an ending point. Substring goes till that index exclusive
	        

	    }

	}