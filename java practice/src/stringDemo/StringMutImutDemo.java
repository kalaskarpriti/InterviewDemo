package stringDemo;

public class StringMutImutDemo {

	public static void main(String[] args) {

		String s = new String("Priti");
		s.concat("K");
		System.out.println(s);
		s = s.concat(" Kalaskar");
		System.out.println(s);

		String s1 = new String("java");
		s1.concat("Practice");
		String s2 = new String("collection");
		s2 = s1.concat(" Demo");
		s2.concat("Demo2");
		String s3 = s2.concat(" Array");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
