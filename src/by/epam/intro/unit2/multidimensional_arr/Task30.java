package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*30. ������� 10x20 ��������� ���������� ������� �� 0 �� 15. ������� �� ����� ���� ������� � ������
�����, � ������� ����� 5 ����������� ��� � ����� ���.*/
public class Task30 {
	public static void main(String[] args) {

		int array[][] = new int[10][20];

		System.out.println("\n������:");
		create(array);
		print(array);

		System.out.println("������ �����, � ������� '5' ����������� 3 � ����� ���: ");
		findFive(array);
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

	public static void findFive(int array[][]) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 5)
					count++;
			}
			if (count >= 3)
				System.out.print(" " + (i + 1));
		}
		System.out.println(".");
	}

}
