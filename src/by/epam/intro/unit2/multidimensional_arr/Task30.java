package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*30.  Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера
строк, в которых число 5 встречается три и более раз.*/
public class Task30 {
	public static void main(String[] args) {

		int array[][] = new int[10][20];

		System.out.println("\nМатрица:");
		create(array);
		print(array);

		System.out.println("Номера строк, которых '5' встречается 3 и более раз: ");
		findFive(array);
	}

	public static void create(int array[][]) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {

				array[i][j] = rand.nextInt(15);

			}

		}
	}

	public static void print(int array[][]) {
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {
				System.out.printf("%5d ", array[i][j]);
			}
			System.out.println();
		}

	}

	public static void findFive(int array[][]) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 5)
					count++;
			}
			if (count >= 3)
				System.out.print(" " + (i + 1));
		}
		System.out.println(".");
	}

}
