package basicJava;

public class ChildDemo extends ParentDemo {

	int i = 20;
	int j = 30;

	public void printvar() {
		System.out.println(j);
		System.out.println(super.j);
	}

	public void sub() {
		System.out.println(super.i);
		System.out.println(i);
		System.out.println("Method running in child class");
	}

	public void add() {
		super.add();
		System.out.println("Method overridding in child class");
		System.out.println(j + super.j);
	}

	public static void main(String[] args) {
		ChildDemo c1 = new ChildDemo();
		c1.add();
		c1.sub();
		c1.printvar();
	}

}
