package day49_Collections;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {
//moving duplicates>>"Wooden Spoon" take just one, remove others
        //order is not important,hashSet, it should be String
        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
           "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);//0 by default
/*
   Set<String> set1 = new HashSet<>( Arrays.asList(arr));
   arr = set1.toArray(new String[0]);
   System.out.println(set1);//[Paper towels, Wooden Spoon, Book, Phone, Coke, Pen, Eggs, Milk]
     */
        System.out.println(Arrays.toString(arr));
//[Wooden Spoon, Book, Pen, Phone, Milk, Eggs, Coke, Paper towels]
System.out.println("------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
 list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));
        System.out.println(list);
        //[1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10]

  list = new ArrayList<>(new LinkedHashSet<>(list));//any duplicate element,
        //we convert Set to ArrayList>>does not allow duplicate element
        System.out.println(list);

//[1000, 300, 200, 400, 500, 600, 10, 20, 30, 40]
        list = new ArrayList<>(new TreeSet<>(list));
        System.out.println(list);//ascending order from TreeSet
//[10, 20, 30, 40, 200, 300, 400, 500, 600, 1000]
        System.out.println("---------addAll bulk operations-----------------------------------");

        String[] array = {"A", "A", "B", "C"};

        List<String> s = new ArrayList<>(Arrays.asList(array));
        System.out.println("s = " + s);//s = [A, A, B, C]

        s.addAll(Arrays.asList("E", "F", "G"));//addAll method is all collection`s method
        System.out.println("s = " + s);//s = [A, A, B, C, E, F, G]

        System.out.println("-----------------------------------------------");
        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */
  Integer[] nums = {1, 2, 1, 1, 2, 2, 2, 3, 3, 3, 3, 2, 3, 4, 5, 1, 2, 3, 4,
          5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);//usually use 0, minimum length
        //

        System.out.println(Arrays.toString(nums));
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("-----------------------------------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";//how many a b c d e ? are there?
        //  eabcd
        //10 4 4 4 3

        String result = ""; //e10a4b4c4d3
        //before frequency method>>here>>

//frequency>>use loop>>
        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each + Collections.frequency(Arrays.asList(str.split("")), each);
        }
        System.out.println(result);//e10a4b4c4d3


        System.out.println("----------------------------------------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));
        System.out.println("names = " + names);
//names = [Ahmet, John, James, Breanna, Shay]

        System.out.println(names.toArray(new String[0])[2]);//James//index number2>>3rd element

        System.out.println(new ArrayList<>(names).get(4));//Shay

//for each loop>> for(data structure:name)
        for (String each : names) {
            System.out.print(each+", ");//Ahmet, John, James, Breanna, Shay,
        }


    }}
