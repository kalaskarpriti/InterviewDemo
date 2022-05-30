package patternProgram;

public class Pattern5 {

	public static void main(String[] args) {
		// Butterfly pattern
		/*
		   1 2 3 4 5 4 3 2 1 
    		 1 2 3 4 3 2 1 
               1 2 3 2 1 
                 1 2 1 
                   1 
                 1 2 1 
               1 2 3 2 1 
             1 2 3 4 3 2 1 
           1 2 3 4 5 4 3 2 1 
		 */
		
		int num=5;
		
		for(int i=1;i<num;i++) {
			int count=1;
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<num;j++) {
				System.out.print(count++ +" ");
				
			}
			for(int j=i;j<=num;j++) {
				System.out.print(count-- +" ");
			}
			System.out.println();
		}
		  for(int i=1;i<=num;i++) {
			  int count=1;
			for(int j=i;j<=num;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(count++ +" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(count--+" ");
			}
			System.out.println();
		}

	}

}
