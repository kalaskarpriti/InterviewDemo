package basicJava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class collectionlist {

	public static void main(String[] args) {
		
		List<Integer> l1= new LinkedList<Integer>();
		l1.add(4);
		l1.add(6);
		l1.add(9);
		l1.add(8);
		l1.add(8);
		
		Iterator<Integer> itr = l1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Garima");  
		v.add("Garima");  
		Iterator<String> itr1=v.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		     }  
		
		}  

}
