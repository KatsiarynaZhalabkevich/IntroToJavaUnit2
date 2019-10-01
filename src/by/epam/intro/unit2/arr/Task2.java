package by.epam.intro.unit2.arr;

import java.util.Random;

/*
 * � ������������� ������������������ ���� ������� ��������. ������� ������ �� ������� ���� ���������.
 * */

public class Task2 {
	public static void main(String[] args) {

		int n = 20;

		int array[] = new int[n];
		int mas[] = new int[n];

		createArr(array);
		System.out.println("�������� ������:");
		printArray(array);

		int count = createNewMas(array, mas);

		if (count == 0) {
			System.out.println("� �������� ������� ��� ���������!!!");
		} else {
			System.out.println("�������� ������:");
			printArray(mas);
		}
	}

	public static void createArr(int array[]) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(100); // ������ ��������� � ������ (�������������)

		}
	}

	public static int createNewMas(int array[], int mas[]) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				mas[count] = i;
				count++;
			}
		}
		return count;
	}

	public static void printArray(int array[]) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

		System.out.println();

	}
}
