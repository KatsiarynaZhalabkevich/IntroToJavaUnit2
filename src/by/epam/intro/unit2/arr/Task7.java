package by.epam.intro.unit2.arr;

import java.util.Random;

/*
 * 7. ���� ������������������ �������������� ����� �1 ,�2 ,..., ��. �������� ��� �� �����, ������� ������� Z,
���� ������. ���������� ���������� �����.
 * */
public class Task7 {
	public static void main(String[] args) {

		double z = 5.365;
		int n = 15;
		double array[] = new double[n];
		
		createArray(array);
		
		System.out.println("������ ����� ���: ");
		print(array);
		
		changeArr(array, z);
		System.out.println("\n����� ������:");
		print(array);
		
		System.out.println("\n���������� ����� ����� "+countChanges(array, z));
		
		

	}

	public static void createArray(double array[]) {
		
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextDouble() * 10;

		}

	}

	public static void print(double array[]) {
		
		for (double arr : array) {
			System.out.printf("%5.3f ",arr);
		}
	}

	// ����� �� ���������� ������ � 1,
	// �.�. ���� �����������, ��� � ������� ���������� ����� ������� ������ z,
	// � ���� ������ ������ ������ �� ����

	public static void changeArr(double array[], double z) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > z)
				array[i] = z;
		}
	}

	public static int countChanges(double array[], double z) {
		
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == z)
				count++;
		}
		return count;
	}

}
