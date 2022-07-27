package day16_ForLoopStringPractice;

public class uniqueCharacter {
    public static void main(String[] args) {
        String str = " aaabccc";
                      //0123456
        String result = "";   //"b"

        for (int i = 0; i <= str.length()-1 ; i++) {  //i index numbers of str (starting from 0)
            char ch = str.charAt(i);  //char : each character of str   //bastan ve sondan esitse unique karakter olur

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {  // if the first and last index number of character
                result += ch;                           // are the same then is unique number
            }
        }
        System.out.println(result);   //System.out.println(ch);  bu  hepsini yazdiriyor

        /*
        char ch = 'b';
        //
        if(str.indexOf('a') == str.lastIndexOf('a')){  // if the first and last index number of character
                                                          // are the same then is unique number
            result += ch;  //  0 index sirasi         ==   2  index sirasi
        }
         */

        /*        Write a program that can return the unique characters from a String
			Ex:		input:	AABCCD
				    output:		BD    ( A C is not unique   but B and D unique )
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1

				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2
         */





    }
}
