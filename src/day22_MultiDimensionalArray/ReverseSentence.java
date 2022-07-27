package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
         /* Write a program that can reverse a sentence
			Ex:	sentence = "Today is a good day to learn Java";
			output:		Java learn to day good a is Today
 */    // firstly  split method  after  reverse::
        String sentence = "Today is a good day to learn Java";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));//[Today, is, a, good, day, to, learn, Java]

        String reversedSentence = ""; //Java learn to day good a is Today
        for (int i = words.length - 1; i >= 0; i--) { // reverse the string
            reversedSentence += words[i]+" ";
        }
        System.out.println(reversedSentence);
    }
}