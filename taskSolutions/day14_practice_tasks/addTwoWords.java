package day14_practice_tasks;

import java.util.Scanner;

public class addTwoWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words: First word:");
        String firstWord = scan.next();

        System.out.println("Second word:");
        String secondWord = scan.next();
        scan.close();
        String result = "";

        if(firstWord.charAt( firstWord.length()-1) == secondWord.charAt(0)){ // firstWord.length()-1 son harf
            result = firstWord+ secondWord.substring(1);            //secondWord.charAt(0)  ilk harf
        }else{
            result = firstWord+secondWord;
        }

        System.out.println(result);



        /*
        Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
         */
    }
}
