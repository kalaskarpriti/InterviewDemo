package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Xoriant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		String str = "XYZ"; // 97
		String str1 = "XYZ"; 
		// 67 null value will give null pointer exception for compareTO method
		System.out.println(str.equals(str1));
		System.out.println(str.compareTo(str1));
		System.out.println(str.compareToIgnoreCase(str1));

		//2
		try {
			int data = 100 / 0;
		}  catch (ArithmeticException e) {
			System.out.println("This is Arithmetic Exception");
		}
		catch (Exception ex) {
			System.out.println("This is Exception");
		}
		
		//3
		int[] arr= {23,54,34,23,54,12,43,25,67,87,97,54};
		List myList=new ArrayList();
		for(int i=0;i<arr.length;i++) {
			myList.add(arr[i]);
		}
		Collections.sort(myList);
		System.out.println(myList);
		System.out.println(myList.get(myList.size()-3));
	}
}
