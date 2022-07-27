package day15_practice_tasks;

public class sumOfEven {
    public static void main(String[] args) {
        // Write a program that can return the sum of even numbers between 1 to 100
        int sum=0;
    for(int i=0 ; i<=100; i++){
       
        if( i % 2 ==0){
            sum+=i;
        }
    }
        System.out.println("sum = " + sum);






    }
}
