package day20_Arrays;

import day04_Variables.SalaryCalculator;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumberOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");//  repeating 10 times
            numbers[i] = scan.nextInt();// each user enterd will be assigned to the indexes of the array numbers

        }
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]> max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        scan.close();
/*          Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number
 */
    }
}
