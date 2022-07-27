package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
                //  123Enter
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your programming language");
        String programming = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();   //24enter    //String e  cevirirsek nextLine yazabilirzz

        input.nextLine();  //Enter

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();   //enter

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
input.close();
         }
}
