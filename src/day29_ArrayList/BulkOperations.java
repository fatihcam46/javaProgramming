package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,3,3,5,5,5,5,8,8,8,8));
//bulk operation`s addAll:
        System.out.println(list);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3, 3, 3, 3, 3, 5, 5, 5, 5, 8, 8, 8, 8]

        list.removeAll( Arrays.asList(3,5,8) );
//bulk operation`s removeAll: //3,5,8,remove
        System.out.println(list);//[1, 2, 4, 6, 7, 9, 10]

        System.out.println("---bulk operation`s-addAll --retainAll------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll( Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900) );

        numbers.retainAll(Arrays.asList(100, 200, 300));//opposite of remove method of retain all

        System.out.println(numbers);//[100, 200, 300, 100, 200, 300]

        System.out.println("-------------retainAll-----------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll( Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll( Arrays.asList("QA", "SDET") );

        System.out.println(jobTitles);//[QA, SDET, QA, SDET] other does not need to print,rest of them remove

        System.out.println("--------------contains--------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(  Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10) );

        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r3 = nums.containsAll( Arrays.asList(2, 5, 10, 1000) );

        System.out.println("r1 = " + r1);//true element inside 10?
        System.out.println("r2 = " + r2);//true element inside 2,5,10?
        System.out.println("r3 = " + r3);//false


        System.out.println("----------------namesList-------------------------");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        /*
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll( Arrays.asList(names) );
        */

        System.out.println(namesList);//[Josh, Jack, Daniel, Shay, Breanna]

        System.out.println("------------convertToArrayList------------------------");

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
//if non primitive we can use asList method
        ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList(arr));

        System.out.println(list2);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("-----------convertArrayToArrayList------------------");
//costum method use:
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
//asList method we cannot use becouse it is primitive
        ArrayList<Integer> list3 = new ArrayList<>( convertArrayToArrayList(arr2) );

        System.out.println("list3 = " + list3);//list3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }

   public static ArrayList<Integer>  convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);//add method
        }

        return list;


    }
}
