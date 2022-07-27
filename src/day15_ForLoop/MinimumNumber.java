package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int min = 2147483647;  //max = 1   // any user entered will be less than 2147483648

            for (int i = 10; i < 15; i++) {
                System.out.println("Enter a number:");
                int num = scan.nextInt();  //23,-10 ,42,5,67 less min , choose,
                if (num < min) {
                    min = num;
                }
        }
        System.out.println("min = " + min);  scan.close();
/*
Write a program that asks the user to enter a number for 5 times. return the minium number
 */

        }
}
