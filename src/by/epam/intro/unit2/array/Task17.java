package by.epam.intro.unit2.array;

import java.util.Random;

/*17. Дана последовательность целых чисел n a ,a , ,a 1 2  . Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( , , , ) 1 2 n a a  a .*/
public class Task17 {

	public static void main(String[] args) {
		int n = 20;

		int array[] = new int[n];
		int mas[] = new int[n - 1];

		createArr(array);
		System.out.println("Исходный массив:");
		printArray(array);

		int min = findMin(array);
		
		newMas(array, mas, min);
		
		System.out.println("Конечный массив имеет вид:");
		printArray(mas);

	}

	public static void createArr(int array[]) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(10); // запись элементов в массив (ИНИЦИАЛИЗАЦИЯ)

		}
	}

	public static int findMin(int array[]) {

		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static void newMas(int array[], int mas[], int min) {
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != min) {
				mas[j] = array[i];
				j++;
			}
		}
	}

	public static void printArray(int array[]) {

		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}
