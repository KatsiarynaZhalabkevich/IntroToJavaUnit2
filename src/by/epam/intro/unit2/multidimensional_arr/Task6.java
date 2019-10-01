package by.epam.intro.unit2.multidimensional_arr;

import java.util.Random;

/*
 * 6. ���� �������. ������� �� ����� ��� �������� �������, � ������� ������ ������� ������
����������.
 * */
public class Task6 { 
	public static void main(String[] args) {
    int n = 3, m = 4;
    int array[][] = new int[n][m];
    
    createArr(array);
    print(array);
    
    System.out.println("\n����� ������");
    //��������� ����� �� ������ ��������
    newArr(array);


}
	public static void createArr(int array[][]) {
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
		            System.out.printf("%d ",array[i][j]);
		           
		        }
		        System.out.println();
		    }
		
	}
	
	public static void newArr(int array[][]) {
	
		//������� ������ �� ������������ ��� ������������!
		//�� ����� ��������� ������ �������, �.�. ��������� ���������� � 0.
		for (int i = 0; i <array.length ; i++) {
	        for (int j = 0; j < array[i].length; j++) {
	            if(j%2==0) System.out.print("  ");
	            else if(array[0][j]>array[array.length-1][j]) System.out.print(array[i][j]+" ");
	            else System.out.print("  ");
	        }
	        System.out.println();

	    }
	}

}
