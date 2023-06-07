package homework_1;

public class Cat {
	int age;
	String nickname;
	char initials;
	String money;
	boolean isHomeAnimal;

	public Cat() {

	}

	public Cat(String nickname) {
		this.nickname = nickname;
	}

	public void grow() {
		age = age + 1;
	}

	public void sleep() {
		System.out.println(nickname + " спит");
	}

	public void eat() {
		System.out.println(nickname + " ест");
	}

	public void walk() {
		System.out.println(nickname + " гуляет");
	}

	public char getInitials() {
		initials = nickname.charAt(0);
		return initials;
	}

	public void setInitials(char initials) {
		this.initials = initials;
	}

	public boolean isHomeAnimal() {
		isHomeAnimal = true;
		return isHomeAnimal;
	}

	@Override
	public String toString() {
		return "nickname: " + nickname + " age: " + age + " initials: " + initials + " money: " + money;
	}
}
