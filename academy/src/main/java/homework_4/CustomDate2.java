package homework_4;

import java.util.Scanner;

public class CustomDate2 {

	public static void main(String[] args) {
		System.out.println(CustomDate.setCustomDate());

		String inputDate;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Введите первую дату в формате dd-mm-yyyy");
			inputDate = sc.next();

		} while (!DateValidation.isValidDate(inputDate));
		CustomDate date1 = new CustomDate(inputDate);

		do {
			System.out.println("Введите вторую дату в формате dd-mm-yyyy");
			inputDate = sc.next();

		} while (!DateValidation.isValidDate(inputDate));
		sc.close();

		CustomDate date2 = new CustomDate(inputDate);
		System.out.println(date1);
		System.out.println(date2);

		date1.isLeapYearCheck(date1.getYear().getYear());
		date2.isLeapYearCheck(date1.getYear().getYear());

		date1.counDaysBetweenDates(date1, date2);
		date1.printDayofWeek(date1);

	}
}
