package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.*/
public class Task35 {
	public static void main(String[] args) {

		Random random = new Random();
		int n, m;
		int max = 0;
		n = random.nextInt(10);
		m = random.nextInt(10);
		int[][] array = new int[n][m];

		System.out.println("Строк " + n + " столбцов " + m);
		System.out.println("Исходная матрица имеет вид:");
		create(array);
		print(array);

		System.out.println("Максимальное значение в матрице равно " + maxvalue(array));
		System.out.println("Конечная матрица имеет вид:");
		change(array, maxvalue(array));
		print(array);
	}

	public static void create(int array[][]) {
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

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

	public static int maxvalue(int array[][]) {
		int max = array[0][0];
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] > max)
					max = array[i][j];

			}

		}
		return max;
	}

	public static void change(int array[][], int val) {
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] % 2 != 0)
					array[i][j] = val;
			}

		}
	}

}
