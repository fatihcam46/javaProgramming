package day14_practice_tasks;

import java.util.Scanner;

public class withoutFirstChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words=> First word is:");
        String firstWord = scan.next();
        System.out.println("Second word is:");
        String secondWord = scan.next();
        scan.close();
        System.out.println(firstWord.substring(1)+secondWord.substring(1));





        /*
        Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
         */
    }
}
