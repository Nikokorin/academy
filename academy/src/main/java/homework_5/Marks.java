package homework_5;

import java.util.ArrayList;
import java.util.Random;

public class Marks {

	public static void main(String[] args) {
		ArrayList<Integer> Petrov = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			Petrov.add(rand.nextInt(9) + 1);
		}
		System.out.println(Petrov);

		IteratotForTask_4<Integer> itetator = new IteratotForTask_4<>(Petrov);
		int maxValue = 0;
		int value;
		while (itetator.hasNext()) {
			value = itetator.next();
			if (value > maxValue) {
				maxValue = value;
			}
		}
		System.out.println("Самая высокая оценка: " + maxValue);
	}

}
