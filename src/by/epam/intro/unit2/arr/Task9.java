package by.epam.intro.unit2.arr;
/*9. ���� �������������� ����� �1 ,�2 ,..., �n . �������� ������� ���������� � ���������� ��������.*/

import java.util.Random;

public class Task9 {
	public static void main(String[] args) {

		int n = 15;
		double array[] = new double[n];

		createArray(array);
		System.out.println("������ ����� ���");
		print(array);
		changeMaxMin(array);
		System.out.println("\n����� ������ ����� ���:");
		print(array);

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

	public static void changeMaxMin(double array[]) {
		int countMax = 0, countMin = 0;
		double min = array[0];
		double max = array[0];

		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > max) {
				max = array[i];
				countMax = i;
			}
			if (array[i] < min) {
				min = array[i];
				countMin = i;
			}
		}
		array[countMin] = max;
		array[countMax] = min;
	}

}
