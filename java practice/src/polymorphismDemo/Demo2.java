package polymorphismDemo;

public class Demo2 extends Demo1{
	{
		int count=0;
		System.out.println(count);
	}

	public void d2method1() {
		System.out.println("I am method1 of Demo2");
	}

	public void d2method2() {
		System.out.println("I am method2 of Demo2");
	}
	public static boolean d1method1() {
		System.out.println("I am overidded method1 of Demo1 running in Demo2");
		return false;
	}
	
	public static int d1method1(int i) {
		System.out.println("I am overloaded method1 of Demo1 running in Demo2");
		return i;
	}

	public void m1(int a) {
		System.out.println("Overloading test in demo2");
	}
	
	public void methodTest() {
		System.out.println("Overridding method in demo2");
	}

	}
