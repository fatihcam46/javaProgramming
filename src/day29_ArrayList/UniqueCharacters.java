package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";
        String[] arr = str.split("");//firstly use split method,
//convert string to arraylist
        ArrayList<String> list = new ArrayList<>( Arrays.asList(arr) );//asList method use

        System.out.println("list = " + list);//list = [a, a, a, b, c, c, c, d, e,
        // e, e, f, g, g, g, g, g, g, g, g, h, i, i, i, i, i, i, i, i, i, j, k, k, k, k, k, k, k, k, k, l]

        String unique = "";//for each loop ---->
        for (String each : list) {
            int frequency =  Collections.frequency(list, each);
            if(frequency == 1){//freq=1 means that unique
                unique += each;//String does not have add method, concetination we use +=
            }
        }
        System.out.println("unique = " + unique);//unique = bdfhjl


    }
}
