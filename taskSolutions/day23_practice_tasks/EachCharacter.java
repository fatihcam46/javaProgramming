package day23_practice_tasks;

public class EachCharacter {
    public static void main(String[] args) {
        String str ="Hello World";
        printEachChar(str);
    }
    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "\t");
        }
    }
}
/*
	12. create a method named printEachChar that can print each characters of a string
 */