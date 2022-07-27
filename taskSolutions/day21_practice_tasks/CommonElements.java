package day21_practice_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
   /*3. Write a program that can print out the common elements from two integer array
          Ex:  arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
          output:   4 5
          MUST use for each loops
 */
      int[]  arr1 = {1,2,3,4,5};
      int[]  arr2 = {4,5,6,7,8};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("CommonElements");
        for (int each: arr1) {
            for (int element:arr2) {
                if(each==element){
                    System.out.print(each+" ");
                }
            }
        }
        System.out.println();
// to append a new line after printing all the elements in one line

    }
}
