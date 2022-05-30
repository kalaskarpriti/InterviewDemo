package patternProgram;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 		  * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 
    * * * * * * * 
      * * * * * 
        * * * 
          * 

 */

	int num=5;
	
	for(int i=1;i<num; i++) {
		for(int j=i;j<=num;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print("* ");
		}
		for(int j=1;j<i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for(int i=1; i<=num; i++) {
		for(int j=1; j<=i;j++) {
		System.out.print("  ");
		}
		for(int j=i;j<=num;j++) {
			System.out.print("* ");
		}
		for(int j=i;j<num;j++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
	
	}

}
