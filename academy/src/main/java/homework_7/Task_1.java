package homework_7;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_1 {
	public static void main(String[] args) {

		Map<Double, String> map = Stream.generate(() -> new Random().nextLong(100)).limit(100)
				.map(i -> ((i * Math.PI) - 20)).filter(i -> i < 100).sorted().skip(3).distinct()
				.collect(Collectors.toMap(value -> value, value -> ("Number: " + value)));

		System.out.println(map);
	}
}
