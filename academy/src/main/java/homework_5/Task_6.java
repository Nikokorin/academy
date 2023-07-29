package homework_5;

import java.util.Arrays;

public class Task_6 {
	
	public static void main(String[] args) {
		int[] array = new int[8];

		try {
			array[0] = 1;
			array[1] = 2;
			array[2] = 3;
			array[3] = 4;
			array[4] = 5;
			array[5] = 6;
			array[6] = 7;
			array[7] = 8;
			array[8] = 9;
			array[9] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is too small, expand the array");

		}
		System.out.println(Arrays.toString(array));
	}

}
