package day13_practice_tasks;

import java.util.Scanner;

public class StringWithThreeCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.nextLine();
        scan.close();

        int length = word.length();
        String result ="";

        if(length== 0){
            System.out.println("empty");
        }else if(length > 0){
            int lastIndex = word.length() - 1;
            result = ""+ word.charAt(length - 3)+ word.charAt(length - 2)+ word.charAt(length - 1);
        }else {
            result = word;
        }
        System.out.println(result);
      /*
      Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
       */




    }
}
