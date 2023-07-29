package homework_4;

public class Body {

	private int i = 1;
	private Body.Heart heart;
	private Body.Lungs lungs;

	private class Heart {

		private void live() {
			while (i <= Integer.MAX_VALUE) {
				if (i % 100 == 0) {
					System.out.println("Knock-knock-knockin' on heaven's door");
				}
				break;
			}
		}
	}

	private class Lungs {

		private void live() {
			while (i <= Integer.MAX_VALUE) {
				if (i % 50 == 0 && i % 100 != 0) {
					System.out.println("breathe in");
				}
				if (i % 100 == 0) {
					System.out.println("breathe out");
				}
				break;
			}
		}
	}

	public Body() {
		super();
		this.heart = new Body.Heart();
		this.lungs = new Body.Lungs();

	}

	public void live() {
		while (i <= Integer.MAX_VALUE) {
			heart.live();
			lungs.live();
			i++;
		}
		System.out.println("You stand on the shore and feel the salty smell of the wind that blows from the sea. \r\n"
				+ "And I believe that you are free, and life has only begun\r\n" + "");
	}
}
