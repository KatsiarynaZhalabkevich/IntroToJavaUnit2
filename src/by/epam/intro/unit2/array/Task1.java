package by.epam.intro.unit2.array;

import java.util.Random;

/*
 * 1. � ������ A [N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �.
*/
public class Task1 {
	public static void main(String[] args) {

		int n = 15; // ���-�� ���������
		int k = 3; // ���������
		
		int array[] = new int[n];
		
		createArr(array);
		System.out.println("������ ������ ���");
		printArray(array);
		System.out.println("����� ���������, ������� " + k + " ����� " + countSum(array, k));

	}

	public static void createArr(int array[]) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(100); // ������ ��������� � ������ (�������������)

		}
	}

	public static int countSum(int array[], int k) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {
				sum += array[i];
			}
		}

		return sum;

	}

	public static void printArray(int array[]) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

		System.out.println();

	}
}
