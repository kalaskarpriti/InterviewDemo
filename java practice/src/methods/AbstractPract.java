package methods;

public class AbstractPract extends test {

	protected int i = 10;

	public static void main(String[] argss) {
		test.multiple();
		AbstractPract p = new AbstractPract();
		p.sum();
		p.substract();
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("First abstract method");
	}

	@Override
	public void substract() {
		// TODO Auto-generated method stub
		System.out.println("Second abstract menthod");
	}

	protected void example() {
		System.out.println(i);
	}

}

abstract class test {
	public abstract void sum();

	public abstract void substract();

	public static void multiple() {
		System.out.println("Implemented method in abstarct class");
	}
}