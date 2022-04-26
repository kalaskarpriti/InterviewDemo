package constructorDemo;

public class ConstructorDemo2 extends constructor3 {

	ConstructorDemo2(int i) {
		this();
		System.out.println("Second child constructor");
	}

	ConstructorDemo2() {
	
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		constructor3 c = new ConstructorDemo2(10);
	}

}

	class constructor3 {
	constructor3() {
		System.out.println("Parent class constructor");
	}
}