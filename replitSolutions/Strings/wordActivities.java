package Strings;

import java.util.Scanner;

public class wordActivities {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write one word:");
        String txt = scan.next();
        //your code here
        System.out.println(txt.substring(0,txt.length()-1));
//Given a String **txt** print the value without the last letter
 //   Ex: Input: foo  Output:fo

        System.out.println("--- Example:-java--output: jaja----------------------------");
        //Write a program that will print out first half of the word twice.
        System.out.println("Write one word:");
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int stringLength=word.length();
        String tmp="";
        for(int i=0; i<stringLength/2;i++)        {
            //tmp+=Character.toString(input.charAt(i));
            tmp+=word.valueOf(word.charAt(i));
        }
        for(int i=0; i<stringLength/2;i++)        {
            //tmp+=Character.toString(input.charAt(i));
            tmp+=word.valueOf(word.charAt(i));
        }
        System.out.println(tmp);
    }
}
