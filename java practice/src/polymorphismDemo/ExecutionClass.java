package polymorphismDemo;

public class ExecutionClass {

	public static void main(String[] args) {

		System.out.println("child reference child object......");
		Practice2 p = new Practice2();
		p.method1();
		p.method3();
		p.method2();
		p.method5();
		System.out.println("Parent reference parent object......");
		Practice1 p1 = new Practice1();
		p1.method1();
		p1.method3();
		p1.method2();
		System.out.println("Parent reference child object......");

		Practice1 p2 = new Practice2();
		p2.method1();
		p2.method3();
		p2.method2();
		p2.method5();

		IntImplementationClass n = new IntImplementationClass();
		n.methodone();
		n.methodtwo();
		
		ParentInterface n1=new IntImplementationClass();
		n1.methodone();
		n1.methodtwo();
	}

}
