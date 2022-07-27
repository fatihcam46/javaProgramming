package day17_While_DoWHile;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {   // slayt 6 look: which loop you can use//for loop/while/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");   //repeat many times, till valid age:::::use while loop:::
        int age = scan.nextInt();  //-20 ask re-enter age, until provide valid age //valid age :1~120

        while (!(age>=1 && age<=120 )){
            System.err.println("Invalid entry; please re-enter:");
            System.err.println("Enter your age:");
            age=scan.nextInt();
        }
        System.out.println("Are you a US citizen? yes/no");
        String answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no") )) {
            System.err.println("Invalid entry; please re-enter:");
            System.err.println("Are you a US citizen? yes/no");
            answer = scan.next();
        }
        if(age>=18 && answer.equalsIgnoreCase("yes")){  // yES nO seklinde cevap verirse equals ignore kulln
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }












    }
}
