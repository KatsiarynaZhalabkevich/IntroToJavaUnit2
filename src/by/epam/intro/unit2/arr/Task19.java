package by.epam.intro.unit2.arr;

import java.util.Random;

/*19. 
 * � ������� ����� ����� � ����������� ��������� n ����� �������� ����� ������������� �����. 
 * ���� ����� ����� ���������, �� ���������� ���������� �� ���.*/
public class Task19 {
	public static void main(String[] args) {
		/* ������ ������ ������ ����� HashMap */
		int n = 20;
		int array[] = new int[n];
		int rez[] = new int[2 * array.length]; // ���� ������ ������� ��������, �� ������ ������� ���������� � 2 ����
		// ���� �������: �� �������� ������ ����� ��������, � �� ������ - ���-��
		// ���������� � �������� �������

		createArr(array);
		System.out.println("������ ����� ���: ");
		print(array);
		createNewArr(array, rez);
		
		findMaxRepit(rez);

	}

	public static void createArr(int array[]) {

		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}
	}

	public static void print(int array[]) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void createNewArr(int array[], int rez[]) {

		int j = 0, count = 1;
		for (int i = 0; i < array.length; i++) {
			rez[j] = array[i];
			for (int k = i + 1; k < array.length; k++) {
				if (array[i] == array[k])
					count++;
			}
			rez[j + 1] = count;
			j+=2;
			count = 1;
		}
	}

	public static void findMaxRepit(int rez[]) {
		int max = 0, min = rez[0];
		// ���� ������������ ���-�� ����������
		for (int i = 1; i < rez.length; i += 2) {
			if (rez[i] > max) {
				max = rez[i];
				min = rez[i - 1];

			}
		}
		System.out.println("\n������������ ����� ���������� " + max + " � ����������� ��������� " + min);
	}
}
