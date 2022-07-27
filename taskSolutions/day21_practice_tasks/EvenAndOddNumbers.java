package day21_practice_tasks;

import java.util.Arrays;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        /*
2. Write a program that can count the even and odd number from an array of integers
			Note: MUST use for each loop
 */
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        System.out.println("Even And Odd Numbers" );
        int countOdd = 0;
        int countEven = 0;
        for(int each:arr){
            if(each%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("Has " + countEven+" " +
                "even numbers and "+countOdd+" odd numbers.");
    }
}
