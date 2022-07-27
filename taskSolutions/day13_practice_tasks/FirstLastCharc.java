package day13_practice_tasks;

import java.util.Scanner;

public class FirstLastCharc {
    public static void main(String[] args) {

        String word = "I am learning step by step Java";
        // index:      01234
        System.out.println("word = " + word);

        char firstChar = word.charAt(0);
        System.out.println("firstChar = " + firstChar);
        int totalChars = word.length();
        char lastChar = word.charAt(word.length()-1);   //last index number
        System.out.println("lastChar = " + lastChar);
/*
write a program that asks user to enter a sentence.
  then print the first & last characters of the sentence

 */  System.out.println("------------------------------------------");
String str1 = "Java is fun";
String str2 = "Java is very funny";
        int totalChars11 = str1.length();
        int totalChars22 = str2.length();
if(totalChars11>totalChars22){
    System.out.println("str1 = "+ str1);
}else{
    System.out.println("str2 = " + str2);
}
/*
write a program that asks user to enter two strings, and print out the longest string
 */

 System.out.println("------------------------------------------");
        String str3 = "level grade all";
        char firstChar3 = str3.charAt(0);
        char lastChar3 = str3.charAt(str3.length()-1);
        if(firstChar3==lastChar3){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
        /*        write a program that can check if the first and last characters of the string are same
            ex:  level
            output:  same
         */
 System.out.println("------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();  //java

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initial =  f+"." + l;
        System.out.println("initial = " + initial);



 /*
 write a program that can return the initials of the user
 ex:        cybertek
            school
        output: C.S    Note: Pay attention to the example output
  */





    }

}
