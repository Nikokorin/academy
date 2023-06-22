package homework_3;

import java.util.Scanner;

public class Deal {


		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			User x = new User("Lex", 10, 700);
			User y = new User("Arnold", 49, 880);

			Product[] products = new Product[10];
			products[0] = new Product ("Apple", 10, 2);
			products[1] = new Product("Chocolate", 15, 6);
			products[2] = new Product("Plum", 20, 4);

			products[0] = new Apple("Apple", 20, 5);
			products[1] = new Chocolate ("Alenka", 5, 9);
			products[2] = new Plum ("Spelaja", 2, 13);

			Deal deal = new Deal();
			System.out.println("Full deal cost" + deal.calcPrice());

		}

		private String calcPrice() {
			return null;
		}
}
