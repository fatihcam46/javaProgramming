package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);//[100, 200, 200, 200, 300, 400, 500]
        /*
        int num =1;
        list.remove(num);//remove 200
         */
       // Integer num =200;
        list.remove(1);//compile error: there is no index number  200
        System.out.println("list = " + list);//list = [100, 200, 200, 300, 400, 500]
        Integer num = 2000;
        //list.remove(200);
        boolean r = list.remove(num);

        System.out.println(list);
        System.out.println(r);//false there is no 2000---> false

   System.out.println("----------clear(): method-------------------------------");
//clear(): remove all the elements of the arraylist, size will be 0
        System.out.println(list.size());//6

        list.clear();

        System.out.println(list.size());//0

        System.out.println(list);//[]

    System.out.println("----------indexOf(Data): method-------------------------------");
//indexOf(Data): returns the first matching element's index number, returns int
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');            //0   1  2  3  4index number
        System.out.println(characters);//[A, A, A, A, A]
        int a =  characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A'); //4

        System.out.println(a);//0
        System.out.println(b);//4

  System.out.println("----------lastIndexOf(Data): method-------------------------------");
       // lastIndexOf(Data): returns the last matching element's index number, returns int
//look UniqueElement`s class-->

   System.out.println("---------contains(Data): method-------------------------------");
//contains(Data): returns true if the element is contained in the arraylist, otherwise returns false
                //[A, A, A, A, A]
        boolean r2 =  characters.contains('A');//is there any A on the list?
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);//true
        System.out.println("r3 = " + r3);//false


  System.out.println("----------equals(ArrayList): method-------------------------------");
//equals(ArrayList): returns true if two arraylists are equal
// (same elements in same order), otherwise returns false
        //same element and same index is checking
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        System.out.println("list1 = " + list1);//list1 = [100, 100, 100]

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);
        System.out.println("list2 = " + list2);//list2 = [100, 100, 100]

        System.out.println(list1 == list2);//false//new ArrayList oldgndn onceki gorunmuyor
        System.out.println(list1.equals(list2));//true

 System.out.println("----------equals(ArrayList): method-------------------------------");
        list1.clear();
        boolean r4 =  list1.isEmpty(); // true  oncesinden clear oldgndn empty-->true

        System.out.println("r4 = " + r4);

 System.out.println("----------addAll method-------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        //Bulk Operation: CollectionType
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7) );

        System.out.println(numbers);//[1, 2, 3, 4, 5, 6, 7]






    }
}
