package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*23. 23. Сформировать квадратную матрицу порядка N по правилу:
и подсчитать количество положительных элементов в ней.
a[i][j]=sin((i*i-j*j)/n)*/

public class Task23 {

	public static void main(String[] args) {

		Random random = new Random();
		int n = 2 * (random.nextInt(7) + 1);
		double array[][] = new double[n][n];

		System.out.println("n = " + n + "\nМатрица:");
		create(array);
		print(array);

		System.out.println("Количество положительных элементов  " + countPositive(array));
	}

	public static void create(double array[][]) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / array.length);

			}
		}
	}

	public static void print(double array[][]) {
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {
				System.out.printf("%7.3f",array[i][j]);
			}
			System.out.println();
		}

	}

	public static int countPositive(double array[][]) {
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {
				if (array[i][j] > 0)
					count++;
			}

		}
		return count;
	}
}
