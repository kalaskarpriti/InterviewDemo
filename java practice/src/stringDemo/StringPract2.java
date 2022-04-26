package stringDemo;

public class StringPract2 {

	public static void main(String[] args) {
		String str="Hiibbcyecey";
		char[] str2 = str.toCharArray();
		for(int i=0;i<str2.length-1;i++) {
			for(int j=i+1;j<str2.length;j++) {
			if(str2[i]==str2[j]){
				str2[j]='0';
			}
			}
		}
		for(int k = 0;k<str2.length-1;k++)
				{
					if(str2[k] !='0') {
						System.out.println(str2[k]);
					}
				}	
		}	
	}
