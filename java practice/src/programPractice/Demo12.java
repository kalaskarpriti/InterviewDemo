package programPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Demo12 {

	public static void main(String[] args) {
		int[] a= {2,4,5,6,7,8,4,6,'A'};
		List<Object> myList1=new ArrayList<Object>();
		for(int i=0;i<a.length;i++) {
			myList1.add(a[i]);
		}
		List<Object> myList=new ArrayList<Object>();
		myList.add(2);
		myList.add(4);
		myList.add(8);
		myList.add(6);
		myList1.retainAll(myList);
		myList1.set(4, 'A');
		System.out.println(myList1);
		
		LinkedHashSet mylist3=new LinkedHashSet();
		
		for(int j=0;j<a.length;j++) {
			mylist3.add(a[j]);
		}
		System.out.println(mylist3);
		
		

	}
	
	

}
