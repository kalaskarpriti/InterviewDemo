package collectionPract;

import java.util.TreeSet;

public class CollectionDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(100);
		t.add(1000);
		t.add(405);
		t.add(900);
		t.add(800);
		t.add(704);
		t.add(600);
		
		System.out.println(t);
		System.out.println(t.lower(900));
		System.out.println(t.higher(900));
		System.out.println(t.floor(405));
		System.out.println(t.ceiling(850));
	    t.pollFirst();
	    System.out.println(t);
	    t.pollLast();
	    System.out.println(t);
	    System.out.println(t.descendingSet());
	 

	}

}
