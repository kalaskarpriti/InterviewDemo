package collectionPract;

import java.util.Comparator;
import java.util.TreeSet;

public class PracrticeJava {

	public static void main(String[] args) {
		int[] arr={2,18,4,11,7,8,10};
		TreeSet myset=new TreeSet(new myComparator());

		for(int i=0; i<arr.length; i++){
		    myset.add(arr[i]);
		}
		System.out.println(myset);
		System.out.println(myset.headSet(10));
		System.out.println(myset.tailSet(8));

	}

}
class myComparator implements Comparator {

	public int compare(Object num1, Object num2){
	    Integer value1=(Integer) num1;
	    Integer value2=(Integer) num2;
	    return -value1.compareTo(value2);
	}
	}
