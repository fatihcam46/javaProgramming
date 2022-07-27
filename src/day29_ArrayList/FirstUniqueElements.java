package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElements {
    public static void main(String[] args) {
        /*
1. Write a program that can return the first unique elements from an arraylist
			Do not use indexOf & lastIndexOf methods
 */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//add method we use
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println("list = " + list); //list = [1, 1, 2, 3, 3, 4, 5, 5]//unique elements: 2 and 4
//nested loop we need

        for (Integer each : list) {

            int frequency = 0;
            for (Integer element : list) {
                if(element == each){
                    frequency++;//every single element we look, unique or not?
                }
            }

            if(frequency == 1){
                System.out.println(each);//2
                break;// we use break; that`s why unique first element
            }

        }

    }
}
