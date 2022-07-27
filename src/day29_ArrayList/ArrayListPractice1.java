package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
//// converting array to arraylist:   and   //converting arraylist to array
public class ArrayListPractice1 {
    public static void main(String[] args) {
            String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};
            // converting array to arraylist:
            ArrayList<String> list = new ArrayList<>( Arrays.asList(countries) );
//more than 10 character ===> removeIf method:
            list.removeIf( p -> p.length() >= 10 );

            //converting arraylist to array
            countries = list.toArray(new String[0]);//I have specify size of array(any number write[0]

            System.out.println(Arrays.toString(countries));//[Japan, Korea, Turkey, Canada]
        }
    }
/*
1. create an Array of string called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */
