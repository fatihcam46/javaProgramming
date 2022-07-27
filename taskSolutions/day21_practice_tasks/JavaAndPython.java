package day21_practice_tasks;

public class JavaAndPython {
    public static void main(String[] args) {
     /*
6. Write a program that can return the number of appearances of “java” and “python”
anywhere in the sentence.
(similar to the task in repl.it, but this time you MUST use arrays and for each loop)
 */
        String sentence = "java java python python java python";
        System.out.println("sentence = " + sentence);
        String[] words = sentence.split(" ");
        int countJava = 0,
            countPython = 0;
        for (String each : words) {
            if(each.equalsIgnoreCase("java")){
                countJava++;
            }else if(each.equalsIgnoreCase("python")){
                countPython++;
            }
        }
        System.out.println(countJava+" Java and "+countPython+" Python");
    }
}
