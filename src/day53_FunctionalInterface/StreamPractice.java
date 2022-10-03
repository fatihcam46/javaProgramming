package day53_FunctionalInterface;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StreamPractice {
    public static void main(String[] args) {
  System.out.println("--------distinct()--method-:eliminate dublicate------collect method--------------------------");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
//remove dublicate >>loop you can use >>we are using stream  we must convert tolist
        list1 = list1.stream().distinct().collect( Collectors.toList());

        System.out.println(list1);//[1, 2, 3, 4, 5, 6]
  System.out.println("--------distinct()-and--toArray() method------------------------------");
        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};//Arrays utility class stream we need to write toArray() method
        arr1 = Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));//[1, 2, 3, 4, 5, 6]

System.out.println("--------skip method-------toList------------------");
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2 = list2.stream().skip(5).collect(Collectors.toList());//first 5 element skip

        System.out.println(list2);//[6, 7, 8, 9, 10]
System.out.println("--------skip method--------toArray------------------");
        int[] nums2 =  {1,2,3,4,5,6,7,8,9,10};
        nums2 = Arrays.stream(nums2).skip(4).toArray();//first 4 element skip

        System.out.println(Arrays.toString(nums2));//[5, 6, 7, 8, 9, 10]
 System.out.println("--------limit method------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3 = list3.stream().limit(7).collect(Collectors.toList());//till 7 , others remove
        System.out.println(list3);//[1, 2, 3, 4, 5, 6, 7]
        list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());//limit and skip

        System.out.println(list3);//[4, 5, 6, 7]

System.out.println("--------map method--------change element--------------");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4 = list4.stream().map( p -> p * 10 ).collect(Collectors.toList());//every element *10
                                //inside lamda expression
        System.out.println(list4);//[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

System.out.println("--------map method------------------------------");
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
//after stream map>>>>lamda exp>>index number look 0,3  >>>collect method>>
        days =  days.stream().map( p -> p.substring(0, 3) ).collect(Collectors.toList());

        System.out.println(days);//[Mon, Tue, Wed, Thu, Fri, Sat, Sun]
 System.out.println("--------filter method--getting spesific ones--------------------------");

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens = list5.stream().filter( p -> p%2==0).collect(Collectors.toList());
                                                    //divisible by 2
        System.out.println(evens);//[2, 4, 6, 8, 10] take all evens
 System.out.println("--------count method----how many do we have-mostly using filter together-------");

        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));
//loop you can use
        //use count from stream>>>              lambda                          how many are there? count method
        long countJava = names.stream().filter( p -> p.equalsIgnoreCase("java")).count();

        System.out.println(countJava);//3

//forEach method
        names.stream().filter( p -> p.equalsIgnoreCase("java")).forEach( p -> System.out.println(p));
//Java
//java
//jAvA   which ones matching
System.out.println("--------allMatch method---------------------------");
        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,30,4,5,6,7,8,9,10));

        boolean r1 = list6.stream().allMatch(p -> p%2==0);//all of them divisible by 2
        System.out.println(r1);//false

        boolean r2 = list6.stream().anyMatch(p -> p>20);//any match p>20  one or more match
        System.out.println(r2);//true

        boolean r3 = list6.stream().noneMatch(p -> p%3==0);//
        System.out.println(r3);//false


    }


}
