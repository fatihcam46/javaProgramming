package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,4};

        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4]

        System.out.println("-------String removeDuplicates----------------------------------");

        String[] words = {"Java", "Java", "Python", "C#", "Java", "Java"};

        words = removeDuplicates(words);

        System.out.println( Arrays.toString(words) );//[Java, Python, C#]

        System.out.println("-----------int-removeDuplicates---------------------");

        int[] numbers = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,5,5,5};
        numbers = removeDuplicates(numbers);

        System.out.println(Arrays.toString(numbers));//[1, 2, 3, 4,5]

    //  numbers = Arrays.stream(numbers).distinct().toArray();
    //   System.out.println(Arrays.toString(numbers));//[1, 2, 3, 4,5]
    }

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};//{1,

        for (int each : array) {
            if(!ArraysUtility.contains(result, each)){ //contains method
                result = ArraysUtility.addElement(result, each);// addElement method
            }
        }
        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};//{1,

        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};//{1,

        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};//{1,

        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}
