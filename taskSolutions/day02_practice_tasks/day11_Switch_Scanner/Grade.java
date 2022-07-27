package day02_practice_tasks.day11_Switch_Scanner;

import javax.lang.model.SourceVersion;
import java.sql.SQLTransactionRollbackException;

public class Grade {
    public static void main(String[] args) {
        char ch = 'A';  // ==

        switch(ch) { // ABCDF
            case 'A':
                System.out.println("Excelent");
                break;
            case 'B':
                System.out.println("Great job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println("----------------------------------------");
        char ch1 = 'A';  // ==
        String result = "";  //  baska bilgi girildigonde yazilsin
        switch(ch) { // ABCDF
            case 'A':
                result=("Excelent");
                break;
            case 'B':
                result=("Great job");
                break;
            case 'C':
                result=("Good");
                break;
            case 'D':
                result=("Passed");
                break;
            case 'F':
                result=("Failed");
                break;
            default:
                result=("Invalid");
        }
        System.out.println("result = " + result);




        /*3. a char variable named grade is given. use switch statement to print the following messages:
        'A': excellent
        'B': great job
        'C': good
        'D': passed
        'F': failed
        other wise: invalid

         */
    }
}
