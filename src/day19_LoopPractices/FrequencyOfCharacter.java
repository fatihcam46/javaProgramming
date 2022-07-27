package day19_LoopPractices;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = "";  //a2b1c3d1
  // we need loop every single character
        for (int j = 0; j < str.length(); j++) {  // each character
            char ch = str.charAt(j); //first a
            int count =0;

            for (int i = 0; i < str.length(); i++) {  //find the frequency each character
                char each = str.charAt(i); //each characters of the string str
                if (ch == each) {
                    count++; // one by one increasing
                }
            }
          if(result.contains(""+ch)){   // contains method only accept string  ""+  we changed
                continue;
          }
            result +=ch;
            result +=count;
        }
        System.out.println(result);
        /*   Write a program that can find the frequency of the characters from a string
			 Ex:      str = "aabcccd";
                        output: a2b1c3d1
                 */
    }
}
