package interfaceDemo;
import interfaceDemo.PracticeOne;

public class ClassOne extends ClassTwo {
	
	public static void cassmethod1() {
		System.out.println("method running from classone");
		
	}

	public void test( ) {
		PracticeOne s = null;
		s.method1();
	}
}
