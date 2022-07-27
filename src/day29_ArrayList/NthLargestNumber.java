package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();//is given
        list.addAll(Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));//is given

        int n = 1;
// for loop use:
        for (int i = 1; i < n; i++) {
            list.removeIf( p -> Collections.max(list) == p);
        }

        int max = Collections.max(list);
        /* without directly you can find max number:
           int n = 1;
        for (int i = 1; i < n; i++) {
            list.removeIf( p -> Collections.max(list) == p);        }
         */

        System.out.println(max);// 1st max number:8. 2nd max number:7
    }
}
/*
1. write a program that can return the nth largest number from an arraylist
			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5
			output:
				4
 */