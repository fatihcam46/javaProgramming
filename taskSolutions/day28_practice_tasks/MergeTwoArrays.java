package day28_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        System.out.println(Arrays.toString(arr1));//[A, B, C]

        String[] arr2 = {"D", "E", "F", "G"};
        System.out.println(Arrays.toString(arr2));//[D, E, F, G]

        ArrayList<String> list = new ArrayList<>();
        for (String each : arr1) {
            list.add(each);
        }
        for (String each : arr2) {
            list.add(each);
        }
        System.out.println("list = " + list);//list = [A, B, C, D, E, F, G]

    }

}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */