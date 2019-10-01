package by.epam.intro.unit2.array;

import java.util.Random;

/*20. ��� ������������� ������ � ����������� ��������� �. 
 * ����� ������, �������� �� ���� ������ ������
 * ������� (�������������� �������� ��������� ������). 
* ����������. �������������� ������ ��
������������.*/

public class Task20 {
	public static void main(String [] args) {
		
		int n=20;
		int array[] = new int[n];
		createArr(array);
		print(array);
		changeArr(array);
		print(array);
		
		
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
	
	public static void changeArr(int array[]) {
		
		for(int i=1;i<array.length;i+=2) {
			array[i]=0;
		}
		print(array); // ��� ����������� 
		for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == 0) {
                    array[j] = array[j + 1];
                    array[j + 1] = 0;
                }
            }
        }
		
		
	}

}
