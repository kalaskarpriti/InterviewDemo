package interfaceDemo;

public class Imlementaionone extends ClassOne implements PracticeOne,PracticeTwo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imlementaionone one=new Imlementaionone();
		one.method1();
		one.method2();
		one.method3();
		ClassOne.cassmethod1();
		one.methodone();
		
	}

	@Override
	public final void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method one declared as final");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method two running");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Method three running");
	}

	@Override
	public void methodone() {
		// TODO Auto-generated method stub
		System.out.println("Method one ruuning from interface two");
	}

	@Override
	public void method2(int a) {
		// TODO Auto-generated method stub
		
	}


}
