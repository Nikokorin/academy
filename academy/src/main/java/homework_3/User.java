package homework_3;

import java.util.Objects;
import java.util.Scanner;

public class User {
	String name;
	int age;
	double money;
	String dateOfBirth;
	String phone;
	String email;
	Validator dateValidator;
	Validator phoneValidator;
	Validator emailValidator;

	@Override
	public String toString() {
		return "User [dateOfBirth=" + dateOfBirth + ", phone=" + phone + ", email=" + email + ", dateValidator="
				+ dateValidator + ", phoneValidator=" + phoneValidator + ", emailValidator=" + emailValidator + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public User(String name, int age, double money) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
		Validator = new Validator();
		phoneValidator = new BelarusPhoneValidator();
		emailValidator = new EmailValidator();

	}

	public void setDateBirdh(String dateBirth) {
		if (dateValidator.validate(dateBirth)) {
			this.dateOfBirth = dateBirth;
		} else {
			System.out.println("Invalid date format. Please enter in the format dd/MM/yyyy or dd-MM-yyyy.");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, dateValidator, email, emailValidator, phone, phoneValidator);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(dateValidator, other.dateValidator)
				&& Objects.equals(email, other.email) && Objects.equals(emailValidator, other.emailValidator)
				&& Objects.equals(phone, other.phone) && Objects.equals(phoneValidator, other.phoneValidator);
	}

	public void setPhone(String phone) {
		if (phoneValidator.validate(phone)) {
			this.phone = phone;
		} else {
			System.out
					.println("Invalid phone number. Please enter a valid Belarusian phone number starting with +375.");
		}
	}

	public void setEmail(String email) {
		if (emailValidator.validate(email)) {
			this.email = email;
		} else {
			System.out.println("Invalid email address. Please enter a valid email address.");
		}
	}

	public void enterUserDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter date of birth (dd/MM/yyyy or dd-MM-yyyy): ");
		setDateBirdh(scan.nextLine());
		System.out.print("Enter phone number (+375): ");
		setPhone(scan.nextLine());
		System.out.print("Enter email address: ");
		setEmail(scan.nextLine());
	}
}
