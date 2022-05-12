package programPractice;

public class Demo8 {

	public static void main(String[] args) {
		String str="asdgfgfsssghghssgsss";
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
		 if(ch[i]=='s'){
		  count++;
		}
		}
		System.out.println("Frequency of s character in given string is:" + count);

	}

}
