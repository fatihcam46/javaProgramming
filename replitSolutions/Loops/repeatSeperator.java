package Loops;

import java.util.Scanner;
//Given two strings, **word** and a separator **sep**,
// return a big string made of **count** occurrences of the word,
// separated by the separator string.
//      Example:
//        input:
//        Word
//        X
//        3
//        output: WordXWordXWord

public class repeatSeperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write one word:");
        String word = scan.next();
        System.out.println("Write between word:");
        String separator = scan.next();
        System.out.println("How many times you want to write your word:");
        int count = scan.nextInt();

        for(int i=0;i<count;i++)
        {
            if(i!=count-1)
            {
                System.out.print(word.concat(separator));
            }
            else
            {
                System.out.print(word);
            }
        }
    }
}
