package collectionPract;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class CollectionDemo3 {

	public static void main(String[] args) {
		// Vector
		/*
		 * duplicates allowed, insersion order preserved, initial capacity 10, new
		 * capacity=cc*2, 4 constructor, clonable,serializable,random access
		 */
		Vector v = new Vector();
		Vector v1 = new Vector();
		v1.add("bye");
		v.add("Hi");
		v.addElement("Hello");
		v.addAll(v1);
		System.out.println(v);

		
		
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println("This is Vector printed by enumeration: " + e.nextElement());
		}
		Stack s = new Stack();
		s.push("say");
		s.push(null);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);

		Enumeration e1 = s.elements();
		System.out.println(e1.getClass().getName());
		while (e1.hasMoreElements()) {
			System.out.println("This is stack printed by enumeration: " + e1.nextElement());
		}
		Vector v3 = new Vector(s);
		Vector v4 = new Vector(200, 5);
		Vector v5 = new Vector(200);

	}

}
