package basicJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import org.omg.Messaging.SyncScopeHelper;

public class StreamDemo {

	public static void main(String[] args) {

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Priti");
		a1.add("Abhishek");
		a1.add("Abc");
		a1.add("Xyzsc");
		// find string starts with p and print count of that
		long cnt = a1.stream().filter(z -> z.startsWith("P")).count();
		System.out.println(cnt);
		// use limit to get specific number of strings from resultant stream
		a1.stream().filter(s -> s.length() < 5).limit(2).forEach(s -> System.out.println(s));
		// convert stream into upper case
		a1.stream().filter(s1 -> s1.endsWith("c")).map(s1 -> s1.toUpperCase()).forEach(s1 -> System.out.println(s1));
		// concat 2 streams
		Stream<String> str1 = Stream.of("Abcd", "Xysxg", "testhg", "hggsafhg", "hgfsdhgad");
		Stream<String> str2 = Stream.of("XYZ", "testhd", "testn", "testyy", "iytfdf");
		Stream<String> newstream = Stream.concat(str1, str2);
		boolean result = newstream.anyMatch(s -> s.equalsIgnoreCase("XYZ"));
		System.out.println(result);
		// Assert.assertTrue(true);
		// use of collection with streams
		List<String> list1 = Stream.of("abcdp", "efghp", "lmnkop", "lstye").filter(s -> s.endsWith("p"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(list1.get(1));

	}

}
