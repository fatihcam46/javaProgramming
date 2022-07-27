package day16_ForLoopStringPractice;

public class removeDublicate {
    public static void main(String[] args) {

        String str ="aaabbaacc";  //abc  : final result   //ayni olanlari yazmadan yaz
        String result ="";   //
        for (int i = 0; i <=str.length()-1 ; i++) {    //i <=str.length()-1  ==>son karakter
          String ch = "" + str.charAt(i);          // i:represents index number starting from 0
            // represents each character of str
           if(!result.contains(ch)){   //if the character is not contained in the result
               result += ch;
           }
        }

        System.out.println(result);

        /*        Write a program that can remove the duplicated characters from a String
			Ex:		input:	AABBCCBC
				Output:	ABC
			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
         */


    }
}
