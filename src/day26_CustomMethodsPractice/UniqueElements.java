package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,4,5,5,6,7,7,7};
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));//[2, 4, 6] unique elements

        double[] array2 = {1.5, 2.5, 1.5, 3.5, 4.5, 4.5, 5.5, 5.5};
        double[] unique2 = uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));//[2.5, 3.5]

        char[] array3 = {'A', 'A', 'B','C', 'D', 'E', 'E', 'D'};
        char[] char2 = uniqueElements(array3);
        System.out.println(Arrays.toString(char2));//[B, C]

        String [] array4 = {"Adam", "David", "David", "Jon", "Jon","David","Jon"};
        String[] string2 = uniqueElements(array4);
        System.out.println(Arrays.toString(string2));//[Adam]

    }

    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {}; //new int[0]
        for (int each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    // returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {}; //new int[0]
        for (double each : array) {
            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {}; //new int[0]
        for (char each : array) {
            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }

   // returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {}; //new int[0]
        for (String each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}
