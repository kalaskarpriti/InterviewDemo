package arraydemo;

import java.util.Arrays;

public class ArrayConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,30};
		
		int[] arr1= {1,3,4};
		
		arr=arr1;
		System.out.println(Arrays.toString(arr));
		
		int[] arr2=new int[3];
		arr2[0]=12;
		arr2[1]='c';
		short z=1;
		arr2[2]=z;
		
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		

	}

}
