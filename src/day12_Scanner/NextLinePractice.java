package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();    //19

        input.nextLine();   //enter

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA:");
        double gpa = input.nextDouble();  // 3.5 enter

        input.nextLine();  // enter

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("schoolName = " + schoolName);
        System.out.println("gpa = " + gpa);

        input.close();

/*
1. Ask the user to enter age nextInt
2. aske the user enter full name nextLine/
 */



    }
}

