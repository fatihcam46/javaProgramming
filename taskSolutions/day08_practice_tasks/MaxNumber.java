package day08_practice_tasks;

public class MaxNumber {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 200;
        boolean maxn1 = n1 > n2;
        boolean maxn2 = n1 < n2;
        boolean equal = n1 == n2;

        if(maxn1){
            System.out.println(n1 + " is maximum number.");}
        if(maxn2){
            System.out.println(n2 + " is maximum number.");}
        if(equal){
            System.out.println(n1 + " is equal" + " to "+ n2);}



        /*        Write a program that can print the maximum number
         between two numbers, if both are equal then print Equal
			Ex:				n1= 100, n2 = 200;
			output:				200 is maximum number
         */




    }
}
