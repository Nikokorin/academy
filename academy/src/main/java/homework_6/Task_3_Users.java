package homework_6;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task_3_Users {
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();

		users.add(new User("Preston", "Kai", 23));
		users.add(new User("Jackson", "Robin", 34));
		users.add(new User("Pernell", "Phoebe", 22));
		users.add(new User("Lundgren", "Maks", 28));
		users.add(new User("Kent", "Peter", 17));
		users.add(new User("Sanderson", "Alexander", 25));
		users.add(new User("Farell", "Oliver", 49));
		users.add(new User("Sternson", "Olivia", 56));
		users.add(new User("Sallivan", "Piper", 14));
		users.add(new User("Kreiden", "Arthur", 33));

		File dir = new File("users");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File serializableObjectDemoFile = null;
		for (int i = 0; i < users.size(); i++) {
			try {
				serializableObjectDemoFile = new File("users",
						users.get(i).getSurname() + "_" + users.get(0).getName() + ".txt");
				if (!serializableObjectDemoFile.exists()) {
					serializableObjectDemoFile.createNewFile();
				}
				try (ObjectOutputStream os = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream(serializableObjectDemoFile)))) {
					os.writeObject(users.get(i));
					os.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
