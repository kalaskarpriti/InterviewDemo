package basicJava;

public class aa {
	public static void main(String args[]) {
        int a = 200;
        foo(a);
        System.out.println(a);
        
        StringBuffer s1= new StringBuffer("HEllotttt");
        String s2="world";
        s1.substring(5);
        s1.append(s2);
        System.out.println(s1);
    }
    static void foo(int a) {
        a = 100;
    }
    
    
    


}
