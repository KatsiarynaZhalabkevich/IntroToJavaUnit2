package by.epam.intro.unit2.multidimensional_arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Random;

/*27. � �������� ������� �������� ������� ��� ������� ����� �������, �. �. ��� �������� ������ �������
��������� �� ��������������� �� ������� �������, � ��� �������� ������� ����������� � ������. ������
�������� ������ ������������ � ����������.*/

public class Task27 {
	public static void main(String[] args) throws IOException {

		Random random = new Random();
		int n = 2 * (random.nextInt(7) + 1);
		int array[][] = new int[n][n];

		System.out.println("n = " + n + "\n�������:");
		create(array);
		print(array);

		System.out.println("������� ����� ������� 1 <= " + n);
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String str = bufferedReader.readLine();
		int x = Integer.parseInt(str);

		System.out.println("������� ����� ������� 2 <= " + n);
		str = bufferedReader.readLine();
		int y = Integer.parseInt(str);

		if (x > n || y > n)
			System.out.println("������� �������� �������� ��������! ");
		else {
			if (x != y) {
				change(array, x, y);
				System.out.println("����� ������: ");
				print(array);

			} else
				System.out.println("������� ���������! ������ ������ �� �����!");
		}
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
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void change(int array[][], int x, int y) {
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			k = array[i][x - 1];
			array[i][x - 1] = array[i][y - 1];
			array[i][y - 1] = k;
		}
	}
}
