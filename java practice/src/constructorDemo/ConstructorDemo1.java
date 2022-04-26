package constructorDemo;

//constructor is responsible for object initialization 
//New keyword is responsible for object creation
public class ConstructorDemo1 {

	int i;
	ConstructorDemo1(int j){
		this.i=j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo1 d=new ConstructorDemo1(40);
		System.out.println(d.i);
		ConstructorDemo1 d1=new ConstructorDemo1(50);
		System.out.println(d1.i);
	}

}
