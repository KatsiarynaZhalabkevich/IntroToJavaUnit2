package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*34.34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце
число единиц равно номеру столбца.*/

//что-то не работает (n, m работало)

public class Task34 {
	public static void main(String[] args) {

		Random random = new Random();
		int n = random.nextInt(7) + 1;
		int m = n + 1;
		int array[][] = new int[n][m];
		
		
		System.out.println("Столбцов" + m + " строк" + n);
		System.out.println("Матрица:");
		/* ������ ��������� �� �������� */
		create(array);
		print(array);

	}

	public static void create(int array[][]) {
		int count;

		for (int i = 0; i < array[i].length; i++) {
			count = 0;
			for (int j = 0; j < array.length; j++) {
				if (count == i)
					array[j][i] = 0;
				else {
					array[j][i] = 1;
					count++;
				}
			}
		}
	}

	public static void print(int array[][]) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%5d ", array[i][j]);
			}
			System.out.println();
		}

	}
}
