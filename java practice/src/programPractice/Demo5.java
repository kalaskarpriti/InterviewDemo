package programPractice;

public class Demo5 {

	public static void main(String[] args) {
		String str="Hi 6 to test 56 demo 3";
		StringBuilder builder=new StringBuilder();
		char[] myChar=str.toCharArray();
		
		for(int i=0; i<myChar.length;i++) {
			char temp=myChar[i];
			if(Character.isDigit(temp)) {
				builder.append(temp);
			}
		}
		
		for(int j=0; j<builder.length();j++) {
			System.out.println(builder.charAt(j));
		}
	}

}
