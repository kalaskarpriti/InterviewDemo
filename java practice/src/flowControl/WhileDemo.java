package flowControl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhileDemo {

	public static void main(String[] args) {
		
	List<Integer>	l=new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
		itr.next();
		System.out.println(l);
	}
		
		/* while (true) {
			System.out.println("hi");
		}
		 while(flase){
		 System.out.println("Hi");
		 }System.out.println("hello");
		 unreachable statement error as hello statement never be in picture*/
		
		/* while(true){
		 System.out.println("Hi");
		 }System.out.println("hello");
		 unreachable statement error as hello statement never be in picture*/
		
	}
}
