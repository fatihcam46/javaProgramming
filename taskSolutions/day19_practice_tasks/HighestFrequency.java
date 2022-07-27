package day19_practice_tasks;

public class HighestFrequency {
    public static void main(String[] args) {
        /*        	6.  Write a program that can find the character that has
         the highest frequency from a string
         */
        String str = "aaabbbbbccd";
        int highestFrequency = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (count > highestFrequency) {
                highestFrequency = count;
            }
        }
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)){
                    count++;
                }
            }
            if(count == highestFrequency && !result.contains(ch+"")){
                result += ch;
            }
        }
        System.out.println( result);//b
    }
}
