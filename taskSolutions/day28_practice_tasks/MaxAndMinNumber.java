package day28_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));// adding multiple elements at once by using bulk operation
        System.out.println(list);//[1,2,3,4,5]

        int max = list.get(0);
        for (Integer each : list) {
            if(each > max){
                max = each;
            }
        }
        System.out.println("max = " + max);//max = 5
        
        int min = list.get(0);
        for(Integer each:list){
            if(each<min){
                min=each;
            }
        }
        System.out.println("min = " + min);//min = 1
    }
}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */