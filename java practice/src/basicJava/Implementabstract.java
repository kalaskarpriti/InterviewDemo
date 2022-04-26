package basicJava;

public class Implementabstract extends AbstractDemo1 {

	public static void main(String[] args) {

		Implementabstract a1 = new Implementabstract();
		a1.abdemo1();
		a1.abdemo2();
		a1.abdemo3();
		

	}

	@Override
	public void abdemo2() {
		System.out.println("Running method abdemo2");

	}

	@Override
	public void abdemo3() {
		System.out.println("Running method abdemo3");
	}
	
	public class abc{
		
	}

}
