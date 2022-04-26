package methods;

public class Methodhide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("class Main method");
	}
	
	public static class parent {
		public static void main(String[] args) {
			System.out.println("parent class main method");
		}
	}
	
	public static class child extends parent {
		public static void main(String[] args) {
			System.out.println("child class main method");
		}
	}


}
