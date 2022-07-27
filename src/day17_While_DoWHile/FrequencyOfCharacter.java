package day17_While_DoWHile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AAABBBCAADDACCCAAEEAABBAFFFACCAAA";
        char ch = 'A';
        int frequency = 0;  //+1+1+1==>3
        for (int i = 0; i < str.length() ; i++) {   //i <= str.length()-1   last character also===i < str.length()
            char eachChar = str.charAt(i);  // eachChar:ecah character of str
            // 'A' == 'A'
            if(ch == eachChar){   //if given ch is matching with eachChar , then ch is appeared in the string
                frequency++;
            }
        }
        System.out.println(frequency);

        /*   Write a program that can return the frequency of a char from a String
		Ex:		str = "AAABBBC"
				ch = 'A'
			Output:	3
         */
        System.out.println("--------------frequency2-F------------------------------");
        String str2 = "AAABBBCAADDACCCAAEEAABBAFFFACCAAA";
        char ch2 = 'F';
        int frequency2 = 0;  //+1+1+1==>3
        for (int i = 0; i < str.length() ; i++) {   //i <= str.length()-1   last character also===i < str.length()
            char eachChar2 = str.charAt(i);  // eachChar:ecah character of str
            // 'A' == 'A'
            if(ch2 == eachChar2){   //if given ch is matching with eachChar , then ch is appeared in the string
                frequency2++;
            }
        }
        System.out.println(frequency2);





    }
}
