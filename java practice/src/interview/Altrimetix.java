package interview;

public class Altrimetix {
	static boolean val;

	public static void main(String[] args) {

		// Print number of words in string
		String str1 = "Hi Hello Bye TC Good";
		String[] words = str1.split(" ");
		System.out.println(words.length);

		// Print true if all the strings in array has same letter at 1st 2 position
		// else print false
		String[] arr = { "aab", "aac", "aad", "bca", "bbc" };

		for (int i = 0; i < arr.length; i++) {
			char[] mychar = arr[i].toCharArray();
			if (mychar[0] == mychar[1]) {
				val = true;
			} else {
				val = false;
				break;
			}
		}
		System.out.println(val);

		// Remove special characters from string
		String str = "Hi@yej%Y_7";
		char[] myc = str.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < myc.length; i++) {
			char temp = myc[i];
			if (Character.isLetter(temp)) {
				builder.append(temp);
			}
		}
		System.out.println(builder);
	}

}
