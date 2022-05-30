package patternProgram;

public class NumPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		   1 1 1 1 1 1 1 1 1
		     2 2 2 2 2 2 2
		       3 3 3 3 3 
		         4 4 4
		           5
		 */
		
		int num=5;
		int count=0;
		for(int i=1;i<=num;i++) {
			count++;
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=i; j<=num; j++) {
				System.out.print(count+" ");
			}
			for(int j=i; j<num; j++) {
				System.out.print(count+" ");
			}
			System.out.println();
		}

	}

}
