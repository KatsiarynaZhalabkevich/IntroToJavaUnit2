package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*19. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
*/
public class Task19 {
	public static void main(String[] args) {

		Random random = new Random();
		int n = 2 * (random.nextInt(7) + 1);
		int array[][] = new int[n][n];

		System.out.println("n = " + n + "\nМатрица:");
		create(array);
		print(array);

	}

	public static void create(int array[][]) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j < array.length - i) {
					if(j==0) array[i][j]=i+1;
					else array[i][j] = array[i][j-1]+1;
					
				} else
					array[i][j] = 0;

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

}
