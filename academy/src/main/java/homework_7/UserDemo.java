package homework_7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;

public class UserDemo {
	public static void main(String[] args) throws NoSuchMethodException {
		User user = new User("Kai", "Lontner", 19, 8, 2002, "vaninIvan", "1982002Kai", "diamondkai@gmail.com");
		user.printUserInfo();

		Class<User> userClass = User.class;
		try {
			System.out.println(userClass.getMethod("printUserInfo"));
			System.out.println(Arrays.toString(userClass.getMethods()));

			System.out.println(userClass.getField("email"));
			System.out.println(Arrays.toString(userClass.getFields()));

			System.out.println(userClass.getDeclaredMethod("printUserInfo"));
			System.out.println(Arrays.toString(userClass.getDeclaredMethods()));

			System.out.println(userClass.getDeclaredField("email"));
			System.out.println(Arrays.toString(userClass.getDeclaredFields()));

			Field userFirstName = userClass.getSuperclass().getDeclaredField("firstName");
			userFirstName.setAccessible(true);
			userFirstName.set(user, "Kai");

			Field userSecondName = userClass.getSuperclass().getDeclaredField("secondName");
			userSecondName.setAccessible(true);
			userSecondName.set(user, "Lontner");

			Field userAge = userClass.getSuperclass().getDeclaredField("age");
			userAge.setAccessible(true);
			userAge.set(user, 0);

			Field userDateOfBirth = userClass.getSuperclass().getDeclaredField("dateOfBirth");
			userDateOfBirth.setAccessible(true);
			userDateOfBirth.set(user, LocalDate.now());

			Field userEmail = userClass.getDeclaredField("email");
			userEmail.setAccessible(true);
			userEmail.set(user, "diamondkai@gmail.com");

			Method toString = userClass.getDeclaredMethod("toString");
			toString.invoke(user);

		} catch (SecurityException | NoSuchMethodException | NoSuchFieldException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			System.out.println(e.getMessage());

		}
	}

}
