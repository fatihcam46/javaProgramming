package day24_practice_tasks;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String  sentence = "Java java java python python";
        String word = "java";
        System.out.println(frequencyOfWord(sentence, word));
    }
    public static int frequencyOfWord(String sentence, String word){
        int count = 0;
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }


}
/*
1.  create a method named frequencyOfWord that passes two parameters:
string sentence and String word, then returns the frequency of word from the sentence
                 Ex: sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */
