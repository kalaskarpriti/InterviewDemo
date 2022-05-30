package polymorphismDemo;

public  class Demo1 {
	static Demo0 d = new Demo0();

	public static boolean d1method1() {
		System.out.println("I am method1 of Demo1");
		d.d0method2();
		return true;

	}

	public void d1method2() {
		Demo0.methode1();
		System.out.println("I am method2 of Demo1");
	}
	
	public void methodTest() {
		System.out.println("Overridding method in demo1");
	}
	
	public void m1() {
		System.out.println("Overloading test in demo1");
	}
	
	public void priti() {
		System.out.println("priti");
	}
}
