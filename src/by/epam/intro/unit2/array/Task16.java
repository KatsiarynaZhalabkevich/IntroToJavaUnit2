package by.epam.intro.unit2.array;

import java.util.Random;

/**16. Даны действительные числа а1, а2...а2n   .
 *  Найти max(a1+a2n ,a2+a2n-1 ,..., an+an+1 )*/
public class Task16 {
	
	public static void main(String[] args) {
		
		int n=20;
		double array[] = new double[n];
		double mas[] = new double[n/2]; //массив сумм
		
		createArr(array);
		System.out.println("Массив имеет вид:");
		print(array);
		
		createArrOfSum(array, mas);
		System.out.println("Массив сумм имеет вид:");
		print(mas);
		
		System.out.println("Максимальное значение:"+findMax(mas) );
		
		
		
		
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
	
	public static void createArrOfSum(double array[], double mas[]) {
		for(int i=0;i<array.length/2;i++) {
			mas[i]=array[i]+array[array.length-i-1];
		}
	}
	
	public static double findMax(double mas[]) {
		double max=-1;
		for (double d : mas) {
			if(d>max)max=d;
		}
		return max;
	}
	
	

}
