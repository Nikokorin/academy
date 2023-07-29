package homework_4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class CustomDate {
	private String inputDate;
	private LocalDate date;
	private Year year;
	private Month month;
	private Day day;

	public CustomDate() {
		super();
	}

	public CustomDate(String inputDate) {
		super();
		if (DateValidation.isValidDate(inputDate)) {
			this.year = new Year(DateValidation.parse(inputDate).getYear());
			this.month = new Month(DateValidation.parse(inputDate).getMonthValue());
			this.day = new Day(DateValidation.parse(inputDate).getDayOfMonth());
			this.date = LocalDate.parse(inputDate, DateValidation.FORMATTER);
		}
	}

	public class Year {
		int year;

		public Year(int year) {
			super();
			this.year = year;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public String toString() {
			return " " + year;
		}
	}

	public class Month {
		int month;

		public Month(int month) {
			super();
			this.month = month;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		@Override
		public String toString() {
			return " " + month;
		}
	}

	public class Day {
		int day;

		public Day(int day) {
			super();
			this.day = day;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		@Override
		public String toString() {
			return " " + day;
		}

	}

	public void isLeapYearCheck(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " year is Leap year");
		} else {
			System.out.println(year + " year is not a Leap year");
		}
	}

	public static CustomDate setCustomDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите дату в формате dd-mm-yyyy");
		String inputDate = sc.next();
		CustomDate customDate = new CustomDate(inputDate);
		sc.close();
		return customDate;
	}

	public void printDayofWeek(CustomDate customDate) {
		ZoneId defaultZoneId = ZoneId.systemDefault();
		Date date = Date.from(customDate.getDate().atStartOfDay(defaultZoneId).toInstant());
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
			System.out.println(dayOfWeek);
			break;
		case 2:
			DayOfWeek dayOfWeek1 = DayOfWeek.MONDAY;
			System.out.println(dayOfWeek1);
			break;
		case 3:
			DayOfWeek dayOfWeek2 = DayOfWeek.TUESDAY;
			System.out.println(dayOfWeek2);
			break;
		case 4:
			DayOfWeek dayOfWeek3 = DayOfWeek.WEDNESDAY;
			System.out.println(dayOfWeek3);
			break;
		case 5:
			DayOfWeek dayOfWeek4 = DayOfWeek.THURSDAY;
			System.out.println(dayOfWeek4);
			break;
		case 6:
			DayOfWeek dayOfWeek5 = DayOfWeek.FRIDAY;
			System.out.println(dayOfWeek5);
			break;
		case 7:
			DayOfWeek dayOfWeek6 = DayOfWeek.SATURDAY;
			System.out.println(dayOfWeek6);
			break;
		default:
			System.out.println("Не существующий день недели");
		}
	}

	public void counDaysBetweenDates(CustomDate date1, CustomDate date2) {
		System.out.println(ChronoUnit.DAYS.between(date1.getDate(), date2.getDate()));
	}

	public String getInputDate() {
		return inputDate;
	}

	public void setInputDate(String inputDate) {
		this.inputDate = inputDate;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, day, inputDate, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomDate other = (CustomDate) obj;
		return Objects.equals(date, other.date) && Objects.equals(day, other.day)
				&& Objects.equals(inputDate, other.inputDate) && Objects.equals(month, other.month)
				&& Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		return "CustomDate year:" + year + ", month:" + month + ", day:" + day;
	}

}
