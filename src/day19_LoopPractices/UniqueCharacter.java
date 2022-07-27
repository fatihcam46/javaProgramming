package day19_LoopPractices;

public class UniqueCharacter {
    public static void main(String[] args) {  //unique means frequency==1
        String str = "aabccdeef";
        String result = "";   //bdf
        /*        Write a program that can find the unique characters from a
        string without using indexOf() and lastIndexOf() methods
    			Ex:       str = "aabccdeef";
                output:   bdf                                                  */

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);  // char ch ='a'; bu sadece a icindi
            int count = 0;  // represents the frequency of the char ch
            for (int i = 0; i < str.length(); i++) {   //compares the character that outer loop picked,with each character
                char each = str.charAt(i);  // ecah character of str
                if( ch == each){
                    count ++;
                }
            }
        if(count == 1){  // unique means frequency==1
            result+= ch;
            /*   if(count !=1){
                continue;   // continue: skips the current iteration of the loop
            }                   */
        }
      }

        System.out.println(result);






    }
}
