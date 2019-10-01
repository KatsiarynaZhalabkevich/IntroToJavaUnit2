package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*28. ������ ������� ��������������� �����. ��������� ����� ��������� � ������ �������. ����������,
����� ������� �������� ������������ �����.*/
public class Task28 {
	public static void main(String[] args) {

		Random random = new Random();
		int n = 2 * (random.nextInt(7) + 1);
		int array[][] = new int[n][n];
		int sum[];

		System.out.println("n = " + n + "\n������:");
		create(array);
		print(array);

		sum = countSum(array);

		System.out.println("����� �� ��������:");
		for (int a : sum) {
			System.out.print(a + " ");

		}
		System.out.println("/n������������ ����� " + countMaxSum(sum) + " � " + (findMaxRow(sum) + 1) + " �������!");
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

	public static int[] countSum(int array[][]) {

		int sum[] = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum[i] += array[j][i];
			}
		}
		return sum;
	}

	public static int countMaxSum(int sum[]) {

		int sumMax = 0; // ��� ������
		for (int i = 0; i < sum.length; i++) {
			if (sum[i] > sumMax) {
				sumMax = sum[i];
				
			}
		}
		return sumMax;
	}

	public static int findMaxRow(int sum[]) {

		int sumMax = 0, max = 0; // ��� ������
		for (int i = 0; i < sum.length; i++) {
			if (sum[i] > sumMax) {
				sumMax = sum[i];
				max = i;
			}
		}
		return max;
	}

}
