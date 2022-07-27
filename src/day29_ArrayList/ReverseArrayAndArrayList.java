package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};//Array to ArrayList

        int[] result = new int[array.length];  // {6,5,4,3,2,1}  make sure enough capacity

        int j = 0;//we need another variable ===>j
        for (int i = array.length - 1; i >= 0; i--, j++) { //i index number, j starting
            result[j] = array[i];
        }
        System.out.println(Arrays.toString(result));//from Arrays utility class //[6, 5, 4, 3, 2, 1]

        System.out.println("---------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));//Arraylist reverse Array

        ArrayList<Integer> reversedList = new ArrayList<>();
//for loop
        for (int i = list.size() - 1; i >= 0; i--) {

            int each = list.get(i);
            reversedList.add(each);
        }
        System.out.println(reversedList);//[8, 7, 6, 5, 4, 3, 2, 1]


    }
}
