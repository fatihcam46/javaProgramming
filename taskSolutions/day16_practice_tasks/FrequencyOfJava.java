package day16_practice_tasks;

public class FrequencyOfJava {
    public static void main(String[] args) {
        /*         write a program that can return the frequency of the a word Java from the sentence
        Ex:            sentence = "Java Java";
                       output:                2
            Hint: you need to create          */
        String str = "java java";
        int count = 0;
        for(int i= 0 ; i <= str.length()-4; i++){ //i:0 , 1, 2,3, 4

            String s = str.substring(i, i+4);
            if(s.equalsIgnoreCase("java")){
                count++;
            }

        }

        System.out.println(count);




    }
}
