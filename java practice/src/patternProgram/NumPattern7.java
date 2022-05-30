package patternProgram;

public class NumPattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
          1 
        2 2 2 
      3 3 3 3 3 
    4 4 4 4 4 4 4 
  5 5 5 5 5 5 5 5 5 
    4 4 4 4 4 4 4 
      3 3 3 3 3 
        2 2 2 
          1 
          
		 */
		
		int num=5;
		int count=0;
		for(int i=1;i<num; i++) {
			count++;
			for(int j=i;j<=num;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(count+" ");
			}
			
			System.out.println();
		}
		
		int count1 = 6;
		for( int i=1;i<=5;i++) {
			count1--;
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i; j<=num;j++) {
				System.out.print(count1+" ");
			}
			for(int j=i; j<num;j++) {
				System.out.print(count1+" ");
			}
			
			System.out.println();
		}
	}

}
