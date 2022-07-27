package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
    System.out.println("----------Collections-sort---------------");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 9, 8, 7,6,5,4,3,2,1));
// Collections utility class >>> method after sort--->ascending order
        Collections.sort(list);

        System.out.println(list);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

  System.out.println("----Collections-reverse--------------");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        System.out.println(list2);//[A, B, C, D, E]

        Collections.reverse(list2);

        System.out.println(list2);//[E, D, C, B, A]

   System.out.println("----------Collections-swap---------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
                                  //0   1    2    3   4   5   6 th index
        Collections.swap(list3, 4, 1 );//4th index----swap 1st index

        System.out.println(list3);//[10, 50, 30, 40, 20, 60, 70]

  System.out.println("---------Collections--min--max-----------");
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        int max = Collections.max(list3);//integer before int max =  yazdik.
        int min = Collections.min(list3);

        System.out.println("min = " + min);//10
        System.out.println("max = " + max);//70

  System.out.println("----------Collections-replaceAll--------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list4, 10, 1000);//replace 10---->1000 write

        System.out.println(list4);//[1000, 1000, 20, 30, 40, 50, 1000, 1000, 1000]

 System.out.println("------int------Collections--frequency-------------");
            //[1000, 1000, 20, 30, 40, 50, 1000, 1000, 1000]
        int frequency = Collections.frequency(list4, 1000 );//list is int we started int freq...

        System.out.println("frequency = " + frequency);//frequency = 5

   System.out.println("---String------Collections-frequency----Java--Python---");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#", "Java"));

        int countJava = Collections.frequency(words, "Java");//how many are there?
        int countPython = Collections.frequency(words, "Python");

        System.out.println("countJava = " + countJava);//3
        System.out.println("countPython = " + countPython);//2


    }
}
