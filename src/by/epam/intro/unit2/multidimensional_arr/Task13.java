package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/

public class Task13 {
	public static void main(String[] args) {

		Random random = new Random();
		int n = 2 * (random.nextInt(7) + 1);
		int array[][] = new int[n][n];

		System.out.println("n = " + n + "\n Матрица:");
		create(array);
		print(array);

	}

	public static void create(int array[][]) {
		int count;
		for (int i = 0; i < array.length; i++) {
			count = array.length;
			for (int j = 0; j < array.length; j++) {
				if (i % 2 == 0)
					array[i][j] = j + 1;
				else {
					array[i][j] = count;
					count--;
				}

			}

		}
	}

	public static void print(int array[][]) {
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
