package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {  //eligible to alcholol
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter your age:");
            int age =scan.nextInt();

            while (!(age>=1 && age<=120)){  //while the age is invalid
                System.err.println("Invalid entry , please re-enter your age");
                age =scan.nextInt();
            }
            System.out.println("Would you like to continue?");
            String a= scan.next().toLowerCase();
            while (!( a.equals("yes") || a.equals("no" ))){  //! yes no haricindekileri aliyor
                System.err.println("Invalid entry , please re-enter your age.Would you like to continue?");
                a= scan.next().toLowerCase();
            }
            if(a.equals("no")){
           break;
            }
        }
        scan.close();

    }
}
