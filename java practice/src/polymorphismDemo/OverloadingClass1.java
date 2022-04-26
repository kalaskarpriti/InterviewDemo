package polymorphismDemo;

public class OverloadingClass1 {

	int x = 100;

	public void method1() {
		System.out.println("Method one-1");
	}

	public void method1(int x) {
		System.out.println("Method one-2");
	}
	
	public void method1(String x) {
		System.out.println("Method one-3");
	}

}
