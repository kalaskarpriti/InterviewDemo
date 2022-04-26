package datatypedemo;

public class FloatingPointDatatypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float f = 102.234f;
		float f1 = 120000000000l;
		double d = 12334.87766;
		// float f3 = 10.2;
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * Type mismatch: cannot convert from double to float
		 */
		float f4 = 1.2f;
		// double d2 = "True";
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * Type mismatch: cannot convert from String to double
		 */
		System.out.println(f);
		System.out.println(f1);
		System.out.println(d);
		// System.out.println(f3);
		System.out.println(f4);
		// System.out.println(d2);

		char c = 72;
		char c2 = 'Q';
		//char c3='an';//Invalid character constant
		// char c3="True"; //Type mismatch can not convert from string to char.
		char c4 = 65532;
		System.out.println(c);
		System.out.println(c2);
		//System.out.println(c3);
		System.out.println(c4);

	}

}
