package stringDemo;

public class StringPract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String str = "abcabcccd";
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == 'c')
				count++;
		}
		System.out.println("Occurance of a in string is =" + count);

		String str1 = "Hi this is priti I am living in pune HHHHHHHHHHHHHHHHH";
		int[] countArr = new int[str1.length()];
		char[] str2 = str1.toCharArray();
		int max, min;

		for (int i = 0; i < str1.length(); i++) {
			countArr[i]=1;
			for (int j = i + 1; j < str1.length(); j++) {
				if (str2[i] == str2[j] && str2[i] != 0 && str2[i] != ' ') {
					countArr[i]++;
					str2[j] = 0;
				}
			}
		}
		    for (int ch : countArr)
			System.out.println(ch);

		max = min = countArr[0];
		char maxChar = str1.charAt(0);
		char minChar = str1.charAt(0);

		for (int k = 0; k < countArr.length; k++) {
			if (min > countArr[k] && countArr[k] != '0'){
				min = countArr[k];
				minChar = str2[k];
			}
			if (max < countArr[k]) {
				max = countArr[k];
				maxChar = str2[k];
			}
		}
		System.out.println(max + " " + min);
		System.out.println("maximun occured character in string is: " + maxChar);
		System.out.println("minimum occured character in string is: " + minChar);
	}

}
