package day15_practice_tasks;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = new Scanner(System.in).nextInt();
        if(num <= 0){
            System.out.println("Invalid Number");
        }else{
            double multiply = 1;
            for (int i = 1; i <= num; i++) {
                multiply *= i;
            }

            System.out.println("The factorial number of given number = " + multiply);;
        }

/*
Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = scan.nextInt();

        double result = 1;

        for(int i = (int)num;  i >= 1 ; i-- ){
            result *= i;
        }

        System.out.println("result = " + result);

        scan.close();
 */







        /*        Write a program that can return the factorial number of any given number
            Ex:                input: 5
                output: 120
                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )         */
    }
}
