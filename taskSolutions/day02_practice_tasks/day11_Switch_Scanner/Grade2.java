package day02_practice_tasks.day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch = 'p';
        String result = "";
        switch (ch){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result=("Passed");
                break;
            case 'F':
                result=("Failed");
                break;
            default:
                result = "Invalid";

                }
        System.out.println(result);






/*
if the grade is A B C D  =====> PASSED
Otherwise   ===> failed
 */

    }
}
