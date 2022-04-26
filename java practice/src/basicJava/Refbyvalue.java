package basicJava;

public class Refbyvalue {

	int data=60;
	
	public void add(Refbyvalue ref) {
		ref.data=ref.data+90;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Refbyvalue ref=new Refbyvalue();
		System.out.println("before passing value:"+ref.data);
		ref.add(ref);
		System.out.println("after passing value:"+ref.data);

		
		
	}

}
