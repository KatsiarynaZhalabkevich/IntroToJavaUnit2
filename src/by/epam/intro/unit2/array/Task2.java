package by.epam.intro.unit2.array;

import java.util.Random;

/*
 * В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 * */

public class Task2 {
	public static void main(String[] args) {

		int n = 20;

		int array[] = new int[n];
		int mas[] = new int[n];

		createArr(array);
		System.out.println("Исходный массив:");
		printArray(array);

		int count = createNewMas(array, mas);

		if (count == 0) {
			System.out.println("В итоговом массиве нет элементов!!!");
		} else {
			System.out.println("Итоговый массив:");
			printArray(mas);
		}
	}

	public static void createArr(int array[]) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(100); // запись элементов в массив (ИНИЦИАЛИЗАЦИЯ)

		}
	}

	public static int createNewMas(int array[], int mas[]) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				mas[count] = i;
				count++;
			}
		}
		return count;
	}

	public static void printArray(int array[]) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

		System.out.println();

	}
}
