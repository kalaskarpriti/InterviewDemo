package stringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());

		// append(string)
		sb.append("abcd");
		System.out.println(sb);
		sb.append(true);
		System.out.println(sb);
		sb.append("dhkjhdkjshdjkhskj");
		System.out.println(sb);
		System.out.println(sb.capacity());
		// capacity()
		StringBuffer sb1 = new StringBuffer("abc");
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());

		// SetCharAt(index,character)
		sb1.setCharAt(1, 'd');
		System.out.println(sb1);

		// CharAt(index)
		System.out.println(sb1.charAt(2));

		// insert(index,value)
		System.out.println(sb1.insert(2, 'h'));
		System.out.println(sb1.insert(4, false));
		System.out.println(sb1.insert(9, 11.11));

		// delete(int begins, int ends)
		System.out.println(sb1.delete(4, 7));

		// deleteCharAt(index At)
		System.out.println(sb1.deleteCharAt(7));

	}

}
