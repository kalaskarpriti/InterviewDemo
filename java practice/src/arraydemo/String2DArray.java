package arraydemo;

import java.util.Arrays;

public class String2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] str= {{"Priti","java","Learning"},{"Welcome","Java","World"}};
		System.out.println(Arrays.deepToString(str).replace("], [", ", ").replace("[[", "[").replace("]]", "]"));
		 for(String[] s:str) {
			 for(String y:s) {
				 System.out.println(y);
				 
			 }
		 }
		
		
	}

}
