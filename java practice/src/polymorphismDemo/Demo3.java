package polymorphismDemo;

public class Demo3 extends Demo2 {

	public static void main(String[] args) {
		

		d1method1();
		Demo1.d1method1();
		
		Demo1 d = new Demo2();
		d.d1method2();
		d.d1method1();
		d.m1();
		d.methodTest();
		d.priti();
		
		Demo2 d1 = new Demo2();
		d1.d2method1();
		d1.d1method1();
		d1.m1(0);
		d1.m1();
		d1.methodTest();
		d1.priti();
		
		Demo1 d2 = new Demo1();
		d2.d1method1();
		d2.m1();
		d2.methodTest();
		d2.priti();
		
		Demo0 d3 = new Demo0();
		d3.methode1();

	}

}
