package datatypedemo;

public class IntegralDatatypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Byte : Size =1byte =8bit. Range -128 to 127.(-2^7 to 2^7-1)

		byte a = 10;
//		byte b = 130;
//		byte c = 10.5;
//		byte d = "abc";
		byte e = 'c';
//		byte f = true;

		System.out.println("Byte value is:" +a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		System.out.println("Byte value is:" +e);
//		System.out.println(f);
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problems:
		 * Type mismatch: cannot convert from int to byte Type mismatch: cannot convert
		 * from double to byte Type mismatch: cannot convert from String to byte Type
		 * mismatch: cannot convert from boolean to byte at
		 * datatypedemo.IntegralDatatypeDemo.main(IntegralDatatypeDemo.java:11)
		 */

		// Short- Size 2byte=16bit, Range: -32768 to 32767(-2^15 to 2^15-1)

		short a1 = 24526;
//		short b1 = "abcd";
//		short c1 = true;
		short d1 = 'D';
//		short e1 = 32768;

		System.out.println("Short value is:" +a1);
//		System.out.println(b1);
//		System.out.println(c1);
		System.out.println("Short value is:" +d1);
//		System.out.println(e1);
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problems:
		 * Type mismatch: cannot convert from String to short Type mismatch: cannot
		 * convert from boolean to short Type mismatch: cannot convert from int to short
		 * at datatypedemo.IntegralDatatypeDemo.main(IntegralDatatypeDemo.java:35)
		 */

		// int - size:4byte=64bit, Range:-2147483648 to 2147483647 (-2^31 to 2^31-1)

		int a2 = 10;
//		int b2 = 2147483648;
//		int c2 = "hi";
		int d2 = 'a';
//		int e2 = true;

		System.out.println("int value is:" +a2);
//		System.out.println(b2);
//		System.out.println(c2);
		System.out.println("int value is:" +d2);
//		System.out.println(e2);
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problems:
		 * The literal 2147483648 of type int is out of range Type mismatch: cannot
		 * convert from String to int Type mismatch: cannot convert from boolean to int
		 * at datatypedemo.IntegralDatatypeDemo.main(IntegralDatatypeDemo.java:54)
		 */

		// Long 8byte=128bit (-2^63 to 2^63-1)

		long a3 = 2147483649L;
		// long b3='abcd';
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		// Invalid character constant
		System.out.println("Long value is:" +a3);
		// System.out.println(b3);
		
		int x=0xbeed;
		int x1=06_6_7; //Underscore is used to increase readability of long numbers. 
		//compiler will remove it at the time of compilation and then convert octal to decimal.
		int x2=0765;
		System.out.println(x);
		System.out.println(x1);
		System.out.println(x2);
	}

}
