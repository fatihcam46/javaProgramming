package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces2 {
    /*
    static BiPredicate<Integer[], Integer> contains = (a, b) -> {
        boolean result = false;
        for (Integer each : a) {
            if(each == b){
                result = true;
                break;
            }
        }
        return result;
    };                                */
    public static void main(String[] args) {
System.out.println("-4-BiPredicate--------------------------------------------");
        //Create a function that can check if the Integer is contained in an array of integer, return boolean
                                            //Integer[] :a Integer:b 
        BiPredicate<Integer[], Integer> contains = (a, b) -> {
            boolean result = false;

            for (Integer each : a) {
                if(each == b){
                    result = true;
                    break;
                }
            }
            return result;
        };

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean r1 = contains.test(arr, 11);//11 contains or not?
        System.out.println(r1);//false

 System.out.println("---BiPredicate---argument any  return boolean--------------------------------------");
        // create a function that can check if two strings are anagram
        //                              a= bac,   b= cab
        BiPredicate<String, String> anagram = (a, b) -> {
            String[] arr1 = a.split(""); //[b, a, c]
            String[] arr2 = b.split(""); //[c, a, b]
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        };
 System.out.println("---5-BiConsumer----String, Integer-----printMultipleTimes------------------");
        // create a function that can print the given string for given number of times
                                                   //String, Integer
        BiConsumer<String, Integer> printMultipleTimes = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.print(s+" ");
            }
        };
        printMultipleTimes.accept("Java", 5);//Java Java Java Java Java

 System.out.println("-BiConsumer interface-Map---forEach method----using lambda expression------------");
        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");
        /* normally entry set>>>forEach loop
        for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " : "+v);
        }         */        //  k:key  v:value
        scrumTeam1.forEach(  (k, v) -> System.out.println(k+" : "+v) );
//Abdulhamid : SM
//Nikita : Developer
//Alina : Developer
//Mert : PO
//Lee : SDET

 System.out.println("---6-BiFunction-------maxNum---------------------");

        //1. create a function that takes two integers and returns the maximum integer
        BiFunction<Integer, Integer, Integer> maxNum = (a, b) -> (a>b)?a:b;
                                                                //a>b answer a otherwise :b
        int max = maxNum.apply(100, 200);

        System.out.println(max);//200
System.out.println("---6-BiFunction--------merge-----into a list---------");
        //2. create a function that can merge two integer arrays into a list
                    //1st, 2nd,  list
        BiFunction<int[], int[], List<Integer>> merge = (x, y) -> {
            List<Integer> result = new ArrayList<>();
//for loop
            for (int each : x) result.add(each);

            for( int each: y) result.add(each);

            return result;
        };

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};

        List<Integer> nums = merge.apply(arr1, arr2);
        System.out.println("nums = " + nums);//nums = [1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("----BiFunction---List<String>, List<Integer>--merge-----into a map------------");
        // 3. create a function that takes a  list of String and a list of Integer and merge them into a map
        /*
        names ==> {"Josh", "Daniel"}
        score ==> {100, 110}
        map ==> {Josh=100, Daniel=110}
         */
                        //T             U           R
        BiFunction<List<String>, List<Integer>, Map<String, Integer>>  merge2 = (j, k) ->{
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < j.size(); i++) {
                map.put( j.get(i),  k.get(i));
            }
            return map;
        };


        List<String> names = new ArrayList<>(Arrays.asList("Layan", "Kseniia", "Aygun"));

        List<Integer> scores = new ArrayList<>(Arrays.asList(90, 95, 98));

        Map<String, Integer> students = merge2.apply(names, scores);

        System.out.println(students);//{Kseniia=95, Aygun=98, Layan=90}

    }
}
