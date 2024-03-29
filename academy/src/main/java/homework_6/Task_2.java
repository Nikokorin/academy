package homework_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task_2 {
	public static void main(String[] args) {
		File source = new File("test.txt");
		File target = new File("result.txt");

		try {
			if (!target.exists()) {
				target.createNewFile();
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		try (FileInputStream fileIn = new FileInputStream(source);
				FileOutputStream fileOut = new FileOutputStream(target)) {
			int a;
			while ((a = fileIn.read()) != -1) {
				if ((char) a != ' ') {
					fileOut.write(a);
				}
			}
			fileIn.close();
			fileOut.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
