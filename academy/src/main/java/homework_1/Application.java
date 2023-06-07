package homework_1;

public class Application {

	public static void main(String[] args) {
			Cat cat1 = new Cat();
			cat1.nickname = "Облачко";
			cat1.initials = 'С';
			System.out.println(cat1);
			Cat cat2 = new Cat("Моська");
			System.out.println(cat2);

			cat2.eat();

			cat2.sleep();

			cat2.walk();

			cat1.grow();
			cat1.grow();
			cat1.grow();
			System.out.println(cat1.age);
		}
	}
