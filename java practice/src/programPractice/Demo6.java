package programPractice;

public class Demo6 {

	public static void main(String[] args) {
		String str="test 4 test 5 tets 8 test 9trt 4 test55 tests5";
		char[] myChar=str.toCharArray();
		StringBuilder builder=new StringBuilder();
		
		for(int i=0;i<myChar.length;i++) {
			char temp=myChar[i];
			if(Character.isDigit(temp)) {
				builder.append(temp);
			}
			
		}
		
		for(int j=0;j<builder.length();j++) {
			System.out.println(builder.charAt(j));
		}
		

	}

}
