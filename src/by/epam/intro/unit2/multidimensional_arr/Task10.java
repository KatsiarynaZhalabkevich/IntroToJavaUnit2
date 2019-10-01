package by.epam.intro.unit2.multidimensional_arr;
/*10. ���� �������. ������� k-� ������ � p-� ������� �������.*/

import java.util.Random;

public class Task10 {
	public static void main(String[] args) {
		
		int n = 3, m = 4;
		int array[][] = new int[n][m];
		
		Random random = new Random();
		int k = random.nextInt(n);
		int p = random.nextInt(m);
		
		System.out.println("������ ����� ���:");
		createArr(array);
		print(array);
		System.out.println("������� " + (k + 1) + "-� ������ � " + (p + 1) + "-� �������");
		
		System.out.println("������ ");
		printLine(array, k);
		
		
		System.out.println("\n������� ");
		printRow(array, p);
		
	}

	public static void createArr(int array[][]) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(100);

			}

		}
	}

	public static void print(int array[][]) {
		 for (int i = 0; i <array.length ; i++) {
		        for (int j = 0; j <array[i].length ; j++) {
		            System.out.printf("%d ",array[i][j]);
		           
		        }
		        System.out.println();
		    }
}
	public static void printLine(int array[][], int k) {
		for (int j = 0; j < array[k].length; j++) {
			System.out.print(array[k][j] + " ");
		}
	}
	
	public static void printRow (int array[][], int p) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i][p]);
		}
	}
}
