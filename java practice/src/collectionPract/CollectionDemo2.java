package collectionPract;

import java.util.LinkedList;

public class CollectionDemo2 {

	public static void main(String[] args) {
		// Linked List
		
		/*Dubly linked list is internal dta structure, duplicates allowed, insertion order preserved,
		 * ,serializable and clonbale interface implementation,null insertion allowed*/
		
		LinkedList li=new LinkedList();
		li.add("Hi");
		li.addFirst("Hello");
		li.addLast("Last elemnet");
		li.add(1,"Say");
		li.add("Hi");
		li.add(null);
		System.out.println(li);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		li.removeLast();
		System.out.println(li);
		System.out.println(li.contains("Hello"));

	}

}
