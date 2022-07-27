package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        StringUtility.printEachChar(str);
        System.out.print(" str = " + str);
        System.out.println();
System.out.println("--------Cydeo School-reverse-----------");

        String s1 = "Cydeo School";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

 System.out.println("---------Java----isPalindrome-------------");

        String word = "Java";//false  is not a palindrome

        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);

 System.out.println("-----names------isPalindrome----------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;
// looop  we are using
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

 System.out.println("----------removeDuplicates---------------------");
        String s2 = "aaaaabbbbbbccccddddd";

        String nonDup = StringUtility.removeDuplicates(s2);

        System.out.println(nonDup);

    }

}
