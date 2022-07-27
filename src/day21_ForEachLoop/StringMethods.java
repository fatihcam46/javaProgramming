package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("---------------toCharArray()---------------------------");
        String str = "Java";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));//[J, a, v, a]

        for(char each:str.toCharArray()){
            System.out.println(each); // J  a   v    a    every cahracter
        }

        System.out.println("---------------split() method---------------------------");
       // "I love learning java programming language" .split(" ")===>{"I", "love","java"...
        String ss = "I love learning java programming language";
        String[] sentence3 = ss.split(" ");
        System.out.println(Arrays.toString(sentence3));//[I, love, learning, java, programming, language]

        System.out.println("-------------------------------------");
      //"ABC".split("") ===>{"A" , "B", "C" }
        String sentence = "Wooden Spoon";
       String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));//[Wooden, Spoon]

        System.out.println("-------------------------------------");
        String email = "WoodenSpoon@cydeo.com";
        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));//[WoodenSpoon, cydeo.com]

        System.out.println("-------------------------------------");
        String s = "Today is nice day. Today is Monday. Today we learn Java";
        String[] sentence2 = s.split("\\.");// . atlamak icin  // kullaniriz
        System.out.println(Arrays.toString(sentence2));//[Today is nice day,  Today is Monday,  Today we learn Java]



    }
}
