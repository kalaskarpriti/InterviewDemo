package polymorphismDemo;

public class OverloadingImplementation {

	public void m1(OverloadingClass1 a) {
		System.out.println("OverloadingClass1 type");
	}

	public void m1(OverloadingClass2 b) {
		System.out.println("OverloadingClass2 type");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingClass1 one = new OverloadingClass1();
		one.method1();
		one.method1(0);

		OverloadingClass1 two = new OverloadingClass2();
		two.method1();
		two.method1(6);

		OverloadingClass2 three = new OverloadingClass2();
		three.method1(2,3);
		three.method1(8);

		OverloadingImplementation four = new OverloadingImplementation();
		four.m1(one);
		four.m1(two);
		four.m1(three);

	}

}
