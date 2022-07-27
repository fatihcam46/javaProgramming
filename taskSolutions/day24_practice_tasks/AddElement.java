package day24_practice_tasks;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] array ={1,2,3,5,6,7};
        int element = 4;

        System.out.println(Arrays.toString(addElement(array,element)));
    }
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];
        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;

    }
}

/*
 6. create a method named addElement that takes one integer array and one integer,
 the method can add the Integer number after the  last index of the integer array
 and returns the new array
    			Ex:   arr ={1,2,3};    	num = 4;
    				addElement(arr, num) ==> {1,2,3,4}
 */