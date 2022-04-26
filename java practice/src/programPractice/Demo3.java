package programPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Demo3 {

	public static void main(String[] args) {

		int x = 6;
		int y = 7;

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("value of x: " + x);
		System.out.println("value of y: " + y);

		int num = 12345;
		int reverse = 0;

		while (num != 0) {
			int reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		System.out.println(reverse);
	
	    
	}

}
