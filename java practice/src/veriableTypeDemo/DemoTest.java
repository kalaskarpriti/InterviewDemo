package veriableTypeDemo;

public class DemoTest {

	public static void main(String[] args) {
		Demo4 d=new Demo4();
		Demo3 d1=new Demo4();
		Demo3 d2=new Demo3();
		
		System.out.println(d.x);
		System.out.println(d.s);
		System.out.println(d1.x);
		System.out.println(d1.s);
		System.out.println(d2.x);
		System.out.println(d2.s);
		d.method1();
		d1.method1();
		d2.method1();
		d.method2();
		d1.method2();
		d2.method2();
	
		

	}

}
