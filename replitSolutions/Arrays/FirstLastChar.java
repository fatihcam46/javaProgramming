package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class FirstLastChar {
    //Given a String array **words**, iterate through each word and print
    // first and last letter of each element in the format below.
    // Put each first and last letter in an array.
//        Example:
//        words → ["hello", "why", "by", "apple" , "note"]
//        print → [ho, wy, by, ae, ne]

        public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("Write 5 word and let`s do list of first and last letter`s given:");
         String[] words = {input.nextLine(),input.nextLine(),
                    input.nextLine(),input.nextLine(),input.nextLine()};
            //TODO: Write your code below
            String tmp[]= new String[words.length];

            for(int i=0 ; i < words.length ; i++)
            {
        tmp[i]=words[i].substring(0,1) +  words[i].substring(words[i].length()-1);
            }

            System.out.println(Arrays.toString(tmp));
        }
    }
