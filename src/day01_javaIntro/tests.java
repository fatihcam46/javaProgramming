package day01_javaIntro;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodPractice4;

public class tests {
    public static void main(String[] args) {

String str = "aaaaaaaaaaaaaaaaabbbbbbbbbbbbbcccccccc";
str = ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);


        String name = "Java Programming";
       String reversedName = ReturnMethodIntro.reverse(name);
        System.out.println("reversedName = " + reversedName);


    }
}
