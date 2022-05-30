package basicJava;

public class ImplementationClass implements InterfacDemo1 {

	public static void main(String[] args) {

		ImplementationClass c1 = new ImplementationClass();
		c1.demo1();
		c1.demo2();
		c1.demo3();
		System.out.println(c1.demo4());
		System.out.println(i);

	}

	@Override
	public void demo1() {
		System.out.println(i);
		System.out.println("Running method demo1");

	}

	@Override
	public void demo2() {
		System.out.println("Running method demo2");

	}

	@Override
	public void demo3() {
		System.out.println("Running method demo3");

	}

	int b = 10;
	int c = 20;

	public int demo4() {
		int a = b + c;
		return a;
	}
}
