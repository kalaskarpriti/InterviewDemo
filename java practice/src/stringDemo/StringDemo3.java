package stringDemo;

public  class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ch= {'a','b','c','d'};
		String str=new String(ch);
		System.out.println(str);
		
		byte[] b= {49,75,98,97,100};
		String str2=new String(b);
		System.out.println(str2);
		
		String str3 = str2.intern();
		System.out.println(str3==str2);

	}

}
