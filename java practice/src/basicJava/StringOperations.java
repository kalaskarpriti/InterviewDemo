package basicJava;

public class StringOperations {
	static String str = "Java training_program";
	
	
	public static void main(String[] args) {
		
        System.out.println(str); // print a string
        
        //split string
        String[] str1 = str.split("_");
        System.out.println(str1[0]);
        System.out.println(str1[1]);
        
        //contact string
        System.out.println(str.concat(" started"));
        
        //upercase & lower case
        System.out.println(str.toLowerCase());
        System.out.println(str1[0].toUpperCase());
        
        //charAt
        System.out.println(str.charAt(2));
        
        //Replace
        System.out.println(str.replace("v","n"));
        
        //Substring
        System.out.println(str.substring(5));
        System.out.println(str.substring(2, 7));
		
	}

}
