package day17_While_DoWHile;

public class FrequencyOfWord {
    public static void main(String[] args) {
              /*        write a program that can return the frequency of the a word Java from the sentence
               Ex :    sentence = "JavaJavaJava";
              output: 3
                */

        String str = "JavaJavaJavaJavaJavaJavaJavaJava";  //how many Java are there?
        int frequency = 0;    // 8-4=4
        for (int i = 0; i <= str.length()-4; i++) {  //i:0,1,2,3      //  i < str.length()-3
        String eachSub = str.substring(i,i+4);
           //  System.out.println(eachSub);
            if(eachSub.equals("Java")){
                frequency++;
            }
        }
        System.out.println(frequency);


    }
}
