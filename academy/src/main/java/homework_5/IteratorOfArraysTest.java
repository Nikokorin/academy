package homework_5;

public class IteratorOfArraysTest {
	public static void main(String[] args) {
		String[][] array = { { "Peach", "Apple", "Onion", "Potato" },
				{ "Peachh", "Applee", "Onionn", "Potatoo", "Peachh", "Applee", "Onionn", "Potatoo" } };

		IteratorOfArrays<String> itetator = new IteratorOfArrays<>(array);

		while (itetator.hasNext()) {
			System.out.println(itetator.next());
		}

		System.out.println();

		Integer[][] array2 = { { 1, 5, 5, 7, 8 }, { 9, 38, 340, 480, 600, 5, 750, 780, 5 } };
		IteratorOfArrays<Integer> itetator2 = new IteratorOfArrays<>(array2);

		while (itetator2.hasNext()) {
			System.out.println(itetator2.next());
		}
	}

}
