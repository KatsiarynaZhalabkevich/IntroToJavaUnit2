package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить,
какой столбец содержит максимальную сумму.*/
public class Task28 {
	public static void main(String[] args) {

		Random random = new Random();
		int n = 2 * (random.nextInt(7) + 1);
		int array[][] = new int[n][n];
		int sum[];

		System.out.println("n = " + n + "\nМАтрица:");
		create(array);
		print(array);

		sum = countSum(array);

		System.out.println("Суммы столбцов:");
		for (int a : sum) {
			System.out.print(a + " ");

		}
		System.out.println("/nМаксимальная сумма равна " + countMaxSum(sum) + " в " + (findMaxRow(sum) + 1) + " столбце!");
	}

	public static void create(int array[][]) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {

				array[i][j] = rand.nextInt(20);

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

	public static int[] countSum(int array[][]) {

		int sum[] = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum[i] += array[j][i];
			}
		}
		return sum;
	}

	public static int countMaxSum(int sum[]) {

		int sumMax = 0; 
		for (int i = 0; i < sum.length; i++) {
			if (sum[i] > sumMax) {
				sumMax = sum[i];
				
			}
		}
		return sumMax;
	}

	public static int findMaxRow(int sum[]) {

		int sumMax = 0, max = 0; 
		for (int i = 0; i < sum.length; i++) {
			if (sum[i] > sumMax) {
				sumMax = sum[i];
				max = i;
			}
		}
		return max;
	}

}
