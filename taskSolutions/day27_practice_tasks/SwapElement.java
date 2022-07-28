package day27_practice_tasks;

import java.util.Arrays;

public class SwapElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(array));//[10, 20, 30, 40, 50]
        swap(array, 2, 4);
        System.out.println(Arrays.toString(array));//[10, 20, 50, 40, 30]

        double[] array2 = {2.3,3.3,4.3,5.3,6.3};
        System.out.println(Arrays.toString(array2));//[2.3, 3.3, 4.3, 5.3, 6.3]
        swap(array2, 2, 4);
        System.out.println(Arrays.toString(array2));//[2.3, 3.3, 6.3, 5.3, 4.3]

        char[] array3 = {'A','B','C','D','E','F','G'};
        System.out.println(Arrays.toString(array3));//[A, B, C, D, E, F, G]
        swap(array3, 2, 4);
        System.out.println(Arrays.toString(array3));//[A, B, E, D, C, F, G]

        String[] array4 = {"Wooden","Spoon","Cydeo","School","2022","July"};
        System.out.println(Arrays.toString(array4));//[Wooden, Spoon, Cydeo, School, 2022, July]
        swap(array4, 2, 4);
        System.out.println(Arrays.toString(array4));//[Wooden, Spoon, 2022, School, Cydeo, July]
    }
    public static int[] swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static double[] swap(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static char[] swap(char[] array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    public static String[] swap(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

}
/*
2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array,
	integer i, integer j. the method swaps the element at index i with the element at index j,
	 and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};
				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}
	2.2 Create the same function for double array, char array and string array
 */