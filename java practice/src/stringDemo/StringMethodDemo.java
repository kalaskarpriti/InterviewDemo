package stringDemo;

public class StringMethodDemo {

	public static void main(String[] args) {

		String str = "Hi Hello";

		// CharAt
		System.out.println(str.charAt(4));

		// Concat
		String str2 = str.concat("How are you?");
		String str3 = str2 + "All good?";
		str3 += "OK";
		System.out.println(str2);
		System.out.println(str3);

		// Equals
		System.out.println(str2.equals(str3));

		// EqualignoreCase
		String str4 = "Hi";
		String str5 = "hi";
		System.out.println(str4.equalsIgnoreCase(str5));

		// substring(start at)
		System.out.println(str3.substring(8));

		// Substring(start at, end at)
		System.out.println(str3.substring(3, 9));
		System.out.println(str3.subSequence(3, 9));
		
		//Lenght
		System.out.println(str3.length());
		
		//Replace
		System.out.println(str3.replace('A','i'));
		
		//toLowerCase()
		System.out.println(str2.toLowerCase());
		
		//toUpperCase()
		System.out.println(str2.toUpperCase());
		
		//trim()
		String str6=" Hi Everyone   ";
		System.out.println(str6.trim());
		
		//indexof()
		System.out.println(str6.indexOf('E'));
		
		//Lastindexof()
		System.out.println(str6.lastIndexOf('e'));
		
	}

}
