package homework_2;

import java.util.Scanner;

public class Task_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество слов: ");
		int n = sc.nextInt();

		String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Введите " + (i + 1) + "-e слово: ");
			array[i] = sc.next();
		}
		sc.close();

		int indexMin = 0;
		for (int i = 0; i < n; i++) {
			if (array[i].length() < array[indexMin].length())
				indexMin = i;
		}

		System.out.println("Первое слово с минимальным количеством символов: " + array[indexMin]);
	}
}
