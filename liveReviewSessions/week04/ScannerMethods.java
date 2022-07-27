package week04;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        /*
        Scanner is a class, from this class we create object so we can input from console
        Scanner scan/input =new Scanner(System.in)
         */
        int x=5;
        //create your scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer number:");
        int y = scan.nextInt();
       int sum=x+y;
        System.out.println("x = " + x);
        System.out.println("sum = " + sum);
        scan.close();
        System.out.println("---------------------------------------");






    }
}
