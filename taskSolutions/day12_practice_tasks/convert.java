package day12_practice_tasks;

import java.util.Scanner;

public class convert {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();
        scan.close(); // we no longer need scanner after this line

        int dollar = cents / 100;
        cents = cents - (dollar * 100);
        System.out.println(dollar+" dollars and "+cents+" cents");

        /*        Write a program that can convert cents to dollars,
         if there is any remainder include them in the result as cents
            Ex:     Enter cents
                225
              output:
                225 cents equal to: 2 dollars and 25 cents


         */




    }
}
