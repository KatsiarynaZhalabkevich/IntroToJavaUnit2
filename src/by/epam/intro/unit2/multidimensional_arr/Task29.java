package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*29. Найти положительные элементы главной диагонали квадратной матрицы.*/
public class Task29 {
	 public static void main(String[] args) {
	        Random random = new Random();
	        int n = 2 * (random.nextInt(7) + 1);
	        int array[][] = new int[n][n];


	        System.out.println("n = " + n + "\nМассив:");
	        create(array);
	        print(array);
	        
	        System.out.print("Положительные элементы главной диагонали: ");
	        positiveOnMainDiag(array);

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
		
		public static void positiveOnMainDiag(int array[][]) {
			
			for (int i = 0; i <array.length ; i++) {
	            if(array[i][i]>0) System.out.print(array[i][i]+" ");

	        }
	        System.out.println();
		}

}
