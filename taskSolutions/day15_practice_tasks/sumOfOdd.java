package day15_practice_tasks;

public class sumOfOdd {
    public static void main(String[] args) {
        // Write a program that can return the sum of odd  numbers between 1 to 100
        int sum=0;
        for(int i=1 ; i<=100; i++){

            if( !(i % 2 ==0)){
                sum+=i;
            }
        }
        System.out.println("sum = " + sum);









    }
}
