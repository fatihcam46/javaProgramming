package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        System.out.println("----------int replace-------------------");
        int[] arr = {1,2,3,4,5};

        arr = replace(arr, 2, 30);

        System.out.println(Arrays.toString(arr));//[1, 2, 30, 4, 5]

        System.out.println("-------String replace------------------------");
        String[] arr2 = {"Java", "Python", "C++", "Ruby"};

        arr2 = replace(arr2, 2, "C#");

        System.out.println(Arrays.toString(arr2));//[Java, Python, C#, Ruby]

    }

    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){
                  //or//        // integer array, integer index, integer newElement
        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    /*
1. Replace Task:
		1.1 Create a method named replace that passes three parameters:
		integer array, integer index, integer newElement. The method replaces
		the element of the array at given index with the new element, and returns the new array.
				Ex:  //    0 1 2 3 4 ==> index number
					arr = {1,2,3,4,5};
					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}
					        arr,index number,new element
		1.2 Create the same functions for double arrays, char arrays, and String arrays
 */
}