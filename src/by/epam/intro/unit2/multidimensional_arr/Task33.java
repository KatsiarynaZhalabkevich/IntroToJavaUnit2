package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*отсортировать столбцы по убыванию/возрастанию*/
public class Task33 {
	public static void main(String[] args) {
		Random random = new Random();
		int n = 2 * (random.nextInt(7) + 1);
		int array[][] = new int[n][n];

		System.out.println("n = " + n + "\nМассив:");
		create(array);
		print(array);

		System.out.println("Сортировка столбцов по убыванию:");
		sortByMin(array);
		print(array);

		System.out.println("Сортировка столбцов по возрастанию:");
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

	public static void sortByMin(int array[][]) {
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				
				for (int k = 0; k < array.length - 1; k++) {
					
					if (array[k][i] < array[k + 1][i]) {
						x = array[k][i];
						array[k][i] = array[k + 1][i];
						array[k + 1][i] = x;
					}
				}
			}

		}
	}

	public static void sortByMax(int array[][]) {
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				for (int k = 0; k < array.length - 1; k++) {
					
					if (array[k][i] > array[k + 1][i]) {
						x = array[k][i];
						array[k][i] = array[k + 1][i];
						array[k + 1][i] = x;
					}
				}
			}
		}
	}

}
