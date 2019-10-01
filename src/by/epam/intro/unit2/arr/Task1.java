package by.epam.intro.unit2.arr;
import java.util.Random;

/*
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
*/
public class Task1 {
	public static void main(String[] args) {

		int n = 15; // кол-во элементов
		int k = 3; // кратность
		
		int array[] = new int[n];
		
		createArr(array);
		System.out.println("Массив имееет вид");
		printArray(array);
		System.out.println("Сумма элементов, кратных " + k + " равна " + countSum(array, k));

	}

	public static void createArr(int array[]) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(100); // запись элементов в массив (ИНИЦИАЛИЗАЦИЯ)

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
