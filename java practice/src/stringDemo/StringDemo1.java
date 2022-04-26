package stringDemo;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=new String("priti");
		s.concat("kalaskar");
		s=s.concat("k");
		s="Sogtware tester";
		System.out.println(s);
		
		String str=new String("spring");
		str.concat("gc");
		str=str+"winter";
		String str2 = str.concat("summer");
		System.out.println(str);
		System.out.println(str2);
		
		
	    String s2="Hi";
	    s2=s2.concat("Hello");
	    s2=s2.concat("Hello");
	    s2.concat("Done");
	    System.out.println(s2);
		
	}

}
