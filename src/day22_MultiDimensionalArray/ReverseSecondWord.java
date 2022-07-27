package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
/* Write a program that can reverse the second word of the sentence
			Ex:	sentence = "I Love Java";
			output:		I evoL Java
 */
        String sentence = "I Love Java";// split method afetr reverse

        String[] words = sentence.split(" ");
        String reverse = "";//
        for (int i = words[1].length()-1 ; i >=0 ; i--) {
            reverse += words[1].charAt(i);   //if I want to change last character word[2] yazilir
        }
        System.out.println(reverse);  //evoL

     //   sentence = sentence.replaceFirst(words[1],reverse);
       words[1]=reverse;
        System.out.println(Arrays.toString(words)); //[I, evoL, Java]

        for (String word : words) {
            System.out.print(word+ " ");//I evoL Java
        }
















    }
}
