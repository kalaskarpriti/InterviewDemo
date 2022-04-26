package veriableTypeDemo;

public class Demo1 {
	public static int x;
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		System.out.println(d.x);
		d.method2();
		System.out.println(d.x);
		Demo1 d1=new Demo1();
		System.out.println(d1.x);
		Demo2 d2=new Demo2();
		x=d2.method1();
		System.out.println(x);
		x=d2.method3();
		System.out.println(x);
		System.out.println(d1.x);
	}

	public int method2() {
		x = x + 10;
		return x;
	}

}
