package by.epam.intro.unit2.arr;
/*
 * 8. ��� ������ �������������� �����, ����������� �������� N. ����������, ������� � ��� �������������,
������������� � ������� ���������.*/

import java.util.Random;

public class Task8 {

	public static void main(String[] args) {

		
		int n = 15;
		double array[] = new double[n];
		
		createArray(array);
		System.out.println("������ ����� ���");
		print(array);
		

		System.out.println("\n ������ co������ "+countNegative(array)+" ������������� ��������� "+countNull(array)+" ������� ��������� "+countPositive(array)+" ������������� ���������!");

	}

	public static void createArray(double array[]) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextDouble() * 10 - 5;

		}

	}

	public static void print(double array[]) {

		for (double arr : array) {
			System.out.printf("%5.3f ", arr);
		}
	}

	public static int countPositive(double array[]) {

		int count = 0;

		for (double arr : array) {
			if (arr > 0)
				count++;
		}
		return count;
	}

	public static int countNegative(double array[]) {

		int count = 0;

		for (double arr : array) {
			if (arr < 0)
				count++;
		}
		return count;
	}

	public static int countNull(double array[]) {

		int count = 0;

		for (double arr : array) {
			if (arr == 0)
				count++;
		}
		return count;
	}

}