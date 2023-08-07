package homework_6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task_4 {
	public static void main(String[] args) {
		File dir = new File("Task4");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		Random rand = new Random();
		File source = new File("test.txt");

		for (int i = 1; i <= 100; i++) {
			try {
				File text = new File("Task4", i + ".txt");
				File result = new File("Task4", "result.txt");
				if (!text.exists()) {
					text.createNewFile();
				}
				int limit = rand.nextInt((int) source.length());
				FileReader reader = new FileReader("test.txt");
				FileWriter writer = new FileWriter(text);
				try (FileWriter resultFile = new FileWriter(result)) {
					{
						char[] buffer = new char[(int) source.length()];
						int c;
						while ((c = reader.read(buffer)) > 0) {
							writer.write(buffer, 0, limit);
						}
						for (File file : dir.listFiles()) {
							if (file.isFile() && !file.getName().equals("result.txt")) {
								resultFile.write("Name: " + file.getName() + " lenght " + file.length() + ", " + "\n");
							}
						}
						reader.close();
						writer.close();
					}
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
