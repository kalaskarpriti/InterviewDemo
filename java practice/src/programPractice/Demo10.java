package programPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo10 {

	public static void main(String[] args) {
		int[] arr= {2,2,4,4,7,-1,5,1};
		Set mySet=new LinkedHashSet();
		for(int i=0; i<arr.length;i++) {
			mySet.add(arr[i]);
		}
		List myList=new ArrayList(mySet);
		
	   for(int j=0;j<myList.size();j++) {
		   for(int k=j+1; k<myList.size();k++) {
			   Integer a=(Integer)myList.get(j);
			   Integer b=(Integer)myList.get(k);
			   if(a+b==6) {
				   System.out.println("Pair of numbers whoes addition is 6 = "+myList.get(j)+ " and "+myList.get(k));
			   }
		   }
	   }
		
	}

}
