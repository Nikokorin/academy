package homework_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class Method {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		addElement(arrayList);
		addElement(linkedList);

		System.out.println("Количество элементов в arrayList: " + arrayList.size());
		System.out.println("Количество элементов в linkedList: " + linkedList.size());

		long start = System.currentTimeMillis();
		getElement(arrayList);
		long finish = System.currentTimeMillis();
		System.out.println("Время, за которе появилось 100000 рандомных элементов с arrayList(в миллисекундах): "
				+ (finish - start));

		long start2 = System.currentTimeMillis();
		getElement(linkedList);
		long finish2 = System.currentTimeMillis();
		System.out.println("Время, за которое появилось 100000 рандомных элементов с linkedList(в миллисекундах): "
				+ (finish2 - start2));

		System.out.println(
				"Время, затраченное на получение 100000 элементов с arrayList намного меньше, чем для linkedList, "
						+ "потому что в linkedList медленный доступ по индексу, а у arrayList быстрый");
	}

	public static Collection<Integer> addElement(Collection<Integer> collection) {
		Random rand = new Random();

		for (int i = 0; i < 1000000; i++) {
			collection.add(rand.nextInt(1000));
		}
		return collection;
	}

	public static void getElement(ArrayList<Integer> arrayList) {
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			arrayList.get(random.nextInt(1000000) - 1);
		}
	}

	public static void getElement(LinkedList<Integer> linkedList) {
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(random.nextInt(1000000) - 1);
		}
	}

}
