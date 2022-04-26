package basicJava;

public class ChildDemo1 {

	//Instance variable
	long contact;
	String name;
	int age;
	static String City= "Pune"; // class variable
	static int j=0; // class variable

	public ChildDemo1(String name, long contact, int age) {
		int i=10; // local variable
		this.name = name;
		this.contact = contact;
		this.age = age;
	
	}
	
	public void getname(){
		System.out.println(name + " " + age + ", "+ City);
		System.out.println(contact);
		j++;
		System.out.println(j);
	}
	

	public static void main(String[] args) {

		ChildDemo1 d1 = new ChildDemo1("Priti", 889999409932L, 24);
		ChildDemo1 d2 = new ChildDemo1("Anuraj",9799654999933L, 26);
		d1.getname();
		d2.getname();
	
		
	}

}
