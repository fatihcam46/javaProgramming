package day14_practice_tasks;

import java.util.Scanner;

public class withoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        scan.close();
        if(word.charAt(0) == 'x'){
            //  word = word.replaceFirst("x", "");, or:
            word = word.substring(1);
        }

        System.out.println(word);


        /*
        Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
         */

    }
}
