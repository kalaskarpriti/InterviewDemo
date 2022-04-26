package methods;

public class Varargmethod {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		sum(10, 60, 80, 20);
		sum(10, 20, 'N', 35, 46, 78);
		sum();
		sum('m', 'N', 'L');
		sum(new int[]{ 10, 20, 30, 40 });
		flotsum(22.44f,34.789f,44.987f);
		flotsum(23.444f,39.779f,48.9997f,39.77779f);
	}

	public static void sum(int... s) {
		int total = 0;
		for (int i = 0; i < s.length; i++) {
			total = total + s[i];
		}
		System.out.println(total);
	}
	
	 public static strictfp void flotsum(float...f) {
		float total = 0;
		for (int i = 0; i < f.length; i++) {
			total = total + f[i];
		}
		System.out.println(total);
	}

}
