package homework1;

public class Task1 {

	public static void main(String[] args) {
		double x = 200;
		double age = 19;
		if (x < 100) {
			x = x - x * 0.05;

		} else if (100 <= x && x < 200) {
			System.out.println(x = x - x * 0.07);
		} else if (200 <= x && x < 300) {
			if (age > 18) {
				x = x - 0.16 * x;
			} else
				x = x - 0.09 * x;
		} else if (300 <= x && x < 400) {
			x = x - x * 0.15;
		} else if (x > 400) {
			x = x - x * 0.2;
		}
		System.out.println(x);
	}
}
