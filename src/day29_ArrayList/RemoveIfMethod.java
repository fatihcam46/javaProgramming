package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
     //why we cannot use loop inside:

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        /*  //
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 != 0 ){
                list.remove(i);   // remove odd number
            }
        }
*/
        System.out.println("--------------using -Lambda Expression:---------------");
        System.out.println(list);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//we are using removeIf method:any collection type we can use
        list.removeIf( p ->  p < 5 ); //Lambda Expression: predicate one variable(p) after ->(arrow) after expressn
                                    //remove less than 5
        System.out.println(list);//[5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9]

        System.out.println("----removeIf-2nd example------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
            //int we used, each-> also int
        list2.removeIf( each ->  each%2 ==0 );//remove all even numbers

        System.out.println(list2);//[1, 3, 5, 7, 9]

        System.out.println("------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));
                    //string we used. p->  also string
        list3.removeIf( p ->  p.startsWith("J") );//remove all starting J  :[Python, C#, C++]

        System.out.println(list3);//:[Python, C#, C++]

        System.out.println("-------------which is palindrome?-------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

        names.removeIf( name -> !StringUtility.isPalindrome(name));//which is palindrome?
                     // variable ->(we have to use all Lambda expression)
        System.out.println(names);//[Anna, Racecar, Level, Eye]

    }
}
