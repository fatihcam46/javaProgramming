package day12_practice_tasks;

import java.util.Scanner;

public class convertMilesKm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles = scan.nextInt();
        scan.close(); // we no longer need scanner after this line

        double kilometers = miles*1.609;
        System.out.println(miles+" miles equal to "+kilometers +" kilometers.");


/*Write a program that can convert Miles to KM
            Ex:   Enter miles:
                10.0
                output:
                10.0 miles equal to 16.09 kilometers
 */








    }






}

