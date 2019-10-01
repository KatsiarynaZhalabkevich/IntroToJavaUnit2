package by.epam.intro.unit2.arr;

import java.util.Random;

/*12. ������ ������������������ N ������������ �����. ��������� ����� �����, ���������� ������
������� �������� �������� �������.*/

public class Task12 {
	public static void main(String[] args) {
		int n=20;
		double array[] = new double[n];
		createArr(array);
		System.out.println("������ ����� ���:");
		print(array);
		
		System.out.println("����� ���������, ������� ������� ������� �����, ����� "+countSum(array));
	}

	public static void createArr(double array[]) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextDouble() * 10 - 5;

		}

	}

	public static void print(double array[]) {

		for (double arr : array) {
			System.out.printf("%5.3f ", arr);
		}
		System.out.println();
	}

	private static boolean isSimple(int i) {
		int count = 0;
		for (int j = 2; j <= Math.sqrt(i); j++) {

			if (i % j == 0) { // ��� ������� ����� ���-�� �������� ����� ���������,
								// �������� ������ ���������� j<sqrt(i)
				count++;
			}

		}
		if (count == 1)
			return true;
		else
			return false;
	}
	
	public static double countSum(double array[]) {
		double sum=0;
		for (int i = 2; i < array.length; i++) {
			// 0, 1 �� �������� �������� �������.
			if (isSimple(i))
				sum+=array[i];
		}
		
		return sum;
	}

}
