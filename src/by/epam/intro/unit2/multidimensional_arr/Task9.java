package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали..*/

public class Task9 {
	public static void main(String[] args) {
        int n = 3;
        int array[][] = new int[n][n];
        
        create(array);
        print(array);
        System.out.println("Элементы главной диагонали: ");
        printMainDiag(array);
        System.out.println("\nЭлементы побочной диагонали: ");
        printAnotherDiag(array);
        
    }
	
	public static void create(int array[][]) {
		
		Random random = new Random();
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j]=random.nextInt(100);
                
            }
           
        }
	}
	
	public static void print(int array[][]) {
		
		for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
               
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
	}
	
	public static void printMainDiag(int array[][]) {
		for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i][i]+" ");

        }
	}
	
	public static void printAnotherDiag(int array[][]) {
		for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i][array.length-i-1]+" ");

        }
	}

}
