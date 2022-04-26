package stringDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Hi I am software engineer");
		String str2 = new String("Hi I am software engineer");
		
		if(str==str2) {
			System.out.println("references are same");
		}
		else {
			System.out.println("references are not same");
		}
		
		str.concat("Working as SDET");
		String str3 = str+"In pune location..";
		str2=str2.concat("In pune location");
		String str4 = "Hi I am software"+" engineerIn pune location";
		if(str3.equals(str2)) {
			System.out.println("content are same");
		}
		else if (str4.equals(str2)) {
			System.out.println("content not same 2");
		}
		else {
			System.out.println("content are not same");
		}
	}

}
