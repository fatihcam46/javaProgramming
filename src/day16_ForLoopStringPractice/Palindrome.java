package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {
        String word ="Level";  // try   racecar    , dad, civic,
        String reversed = "";
        for (int i =word.length()-1; i >=0 ; i--) {
           reversed += word.charAt(i);
         }
     boolean isPalindrome = word.equalsIgnoreCase(reversed);  //equals method olsaydi  buyuk harf kucuk harften true olmazdi
     System.out.println("isPalindrome = " + isPalindrome);



        /*       "Java"   ==>  "avaJ"   false -(not Palindrome)
        Anna   ==> "annA"  ==>  true Palindrome   //  level   racecar    dad    mom  ==>Palindrome word tersten
         */

    }
}
