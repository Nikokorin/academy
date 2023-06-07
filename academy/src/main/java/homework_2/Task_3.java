package homework_2;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое слово: ");
		String firstWord = sc.next();
		System.out.println("Введите второе слово: ");
		String secondWord = sc.next();

		sc.close();

		if (firstWord.length() % 2 == 0 && secondWord.length() % 2 == 0) {
			String newFirst = firstWord.substring(0, firstWord.length() / 2);
			String newSecond = secondWord.substring(secondWord.length() / 2, secondWord.length());

			String result = newFirst + newSecond;

			System.out.println(result);
		} else
			System.out.println("Введите слова, состоящие из четного числа букв: ");

	}

}
