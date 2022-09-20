package day50_Collections;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        System.out.println(set);//[1, 2, 3, 4, 5]

        // Integer[] array = set.toArray(new Integer[0]);//convert set to array
        List<Integer> list = new ArrayList<>(set);  //convert set to collection
        System.out.println(list);//[1, 2, 3, 4, 5]


        //  List<String> names = null;
        // System.out.println(names.size());

        System.out.println("------------// pop() ==> LIFO-------------------------------------");

        // pop() ==> LIFO
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        System.out.println("chars = " + chars); //[A, B, C, D]last in first out outer>>D is going

        ((Stack) chars).pop();
        System.out.println("chars = " + chars); //[A, B, C]


        //poll() ==> FIFO

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));
        System.out.println(names);//[James, Jimmy, Kathy, Breanna, Max]
        //poll() if you want to use it>>
        ((LinkedList<String>) names).poll();//FIFO:first in first outer>>James is going
        System.out.println(names);//[Jimmy, Kathy, Breanna, Max]

        ((LinkedList<String>) names).poll();
        System.out.println(names);//[Kathy, Breanna, Max]


    }
    }
