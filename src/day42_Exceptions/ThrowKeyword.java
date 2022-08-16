package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    //it is different throws keyword//
    public static void main(String[] args) {

        System.out.println("Enter your age:");  // -20
        int age = new Scanner(System.in).nextInt();

        if (age < 0) { //invalid age >> System.err.println("Invalid age");
            throw new InputMismatchException("Age can not be negative: " + age);
            //InputMismatchException create class>>it is much more understandable
           // System.exit(1); we can use but throw keyword is better
        }

        if (age > 21) {
            System.out.println("You are eligible");
        } else {
            throw new RuntimeException("You must be at least 21 years old");
        }


    }
}
