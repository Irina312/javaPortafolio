package day25;

public class SbMethods {
	public static void main(String[] args) {
		// StringBuilder supports most of the String methods
		// and it has it's own methods
		// charAt(), length(), index(), equals, substring()
		
		StringBuilder day = new StringBuilder("Tuesday");
		System.out.println(day); // Tuesday
		System.out.println(day.length()); // 7
		
		char ch = day.charAt(0);
		System.out.println(ch); // T
		
		int i = day.indexOf("y"); 
		System.out.println(i); // 6
		
		// substring() will return String
		String str = day.substring(0, 3); 
		System.out.println(str); // Tue
		System.out.println("-----")
		;
		
		StringBuilder sb = new StringBuilder();
		sb.append("animals");
		System.out.println(sb); // animals
		
		// insert(index, string); inserts the specific string 
		// in the given index. The char in that index will be pushed to the right
		sb.insert(3,  "-");
		System.out.println(sb); // ani-mals
		
		sb.insert(0, "?"); 
		System.out.println(sb); // ?ani-mals
		
		sb.insert(7,  "=");
		System.out.println(sb); // ?ani-ma=ls
		
		sb.insert(sb.length(), "abc"); // to add to the end
		System.out.println(sb); // ?ani-ma=lsabc
		// but in this case it's better to use append()
		System.out.println("-----");
		
		// delete(start, end); very intuitive than substring
		// removes characters from start(included) till end(excluded)
		//                                     012345
		StringBuilder sb2 = new StringBuilder("abcdef");
		System.out.println(sb2); // abscdef
		
		sb2.delete(1, 3);        // 0123
		System.out.println(sb2); // adef
		
		sb2.delete(1,  2);
		System.out.println(sb2); // aef
		
		StringBuilder sb3 = new StringBuilder();
		//          012345678
		sb3.append("123456789");
		
		sb3.delete(1, sb3.length() - 1);
		System.out.println(sb3); // 19
		
		// deleteCahrAt(index)
		StringBuilder sb4 = new StringBuilder("apple");
		System.out.println(sb4);
		sb4.deleteCharAt(3); // it will delete char under the provide index
		System.out.println(sb4); // appe
		System.out.println("-----");
		
		// reverse
		StringBuilder sb5 = new StringBuilder("Wooden spoon");
		System.out.println(sb5);
		sb5.reverse();
		System.out.println(sb5); // noops nedoow
	}
}
