package by.epam.intro.unit2.array;

import java.util.Random;

/* 10. Даны целые числа а1 ,а2 ,..., аn .
 *  Вывести на печать только те числа, для которых аi > i.*/

public class Task10 {
	public static void main(String[] args) {

		int n = 20;

		int array[] = new int[n];

		createArr(array);
		System.out.println("Исходный массив:");
		printArray(array);
		System.out.println("Итоговый массив:");
		changeArr(array);

	}

	public static void createArr(int array[]) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(100)-20;

		}
	}

	public static void printArray(int array[]) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

		System.out.println();

	}

	public static void changeArr(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > i)
				System.out.print(array[i] + " ");
		}

	}
}
