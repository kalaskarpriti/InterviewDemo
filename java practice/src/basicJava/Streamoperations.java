package basicJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int a1[]={2,3,4,5,4,3,7};
		List<Integer> list1 = Arrays.asList(2, 2, 4, 3, 4, 5, 4, 3, 7);

		list1.stream().distinct().forEach(s -> System.out.println(s));
		System.out.println("-----------------------------------");
		List<Integer> sorted = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		System.out.println("-----------------------------------");
		System.out.println(sorted.get(2));
	}

}
