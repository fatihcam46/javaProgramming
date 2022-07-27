package day23_practice_tasks;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
       anagram(str1,str2);

    }


    /*    16. create a method that can check if two strings are anagram
    		ex:    			anagram("silent", "listen")
			output:				silent and listen are anagram
 */
    public static void anagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2)){
            System.out.println(str1 + " and "+ str2+" are Anagram");
        }else{
            System.out.println(str1 + " and "+ str2+" are Not anagram");
        }

    }
}
