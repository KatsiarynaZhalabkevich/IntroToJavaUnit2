package by.epam.intro.unit2.array;

import java.util.Random;

/*
 * 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z,
этим числом. Подсчитать количество замен.
 * */
public class Task7 {
	public static void main(String[] args) {

		double z = 5.365;
		int n = 15;
		double array[] = new double[n];
		
		createArray(array);
		
		System.out.println("Массив имеет вид: ");
		print(array);
		
		changeArr(array, z);
		System.out.println("\nНовый массив:");
		print(array);
		
		System.out.println("\nКоличество замен равно "+countChanges(array, z));
		
		

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

	// можно ди объединить методы в 1,
	// т.к. есть вероятность, что в массиве изначально будет элемент равный z,
	// в этом случае замену делать не надо

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
