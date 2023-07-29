package homework_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ObjectCollection {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Ball");
		arrayList.add("Sun");
		arrayList.add("Rock");
		arrayList.add("Sun");
		arrayList.add("Sun");
		arrayList.add("Rock");
		arrayList.add("Ball");

		System.out.println(arrayList);

		System.out.println();
		System.out.println(removeDublicates(arrayList));

		ArrayList<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(4);
		arrayList2.add(2);
		arrayList2.add(2);
		arrayList2.add(1);

		System.out.println(arrayList2);

		System.out.println();
		System.out.println(removeDublicates(arrayList2));
	}

	public static <T> Collection<T> removeDublicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}

}
