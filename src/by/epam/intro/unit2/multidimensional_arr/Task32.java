package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/
public class Task32 {
	public static void main(String[] args) {
		Random random = new Random();
		int n = 2 * (random.nextInt(7) + 1);
		int array[][] = new int[n][n];
		
		System.out.println("n = " + n + "\nМассив:");
		create(array);
		print(array);

		System.out.println("Сортировка строк  по убыванию:");
		sortToByMin(array);
		print(array);

		System.out.println("Сортировка строк по возрастанию:");
		sortByMax(array);
		print(array);

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

	public static void sortToByMin(int array[][]) {
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i].length - 1; k++) {
					if (array[i][k] < array[i][k + 1]) {
						x = array[i][k];
						array[i][k] = array[i][k + 1];
						array[i][k + 1] = x;
					}
				}
			}

		}
	}

	public static void sortByMax(int array[][]) {
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i].length - 1; k++) {
					if (array[i][k] > array[i][k + 1]) {
						x = array[i][k];
						array[i][k] = array[i][k + 1];
						array[i][k + 1] = x;
					}
				}
			}

		}
	}
}
