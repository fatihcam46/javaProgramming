package day15_practice_tasks;

public class Palindrome {//tersten ayni sekilde olan sozcukler
    public static void main(String[] args) {
        /*        Write a program that can check if the given String is palindrome
			Ex:	input:					Level
				output:					true
				input:					Anna
				output:					true
         */
        String str = "Level";
        String result ="";
        for (int i = str.length()-1; i >=0 ; i--) {
           result += str.charAt(i);
        }
        boolean isPalindrome = str.equalsIgnoreCase(result);
        System.out.println(isPalindrome);


    }
}
