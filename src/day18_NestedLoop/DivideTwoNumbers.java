package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a =30, b =7;  //a=30-7=23 -7= 16-7=9-7=2 remainder
        int count  = 0;

        while(a >= b){  // count = 1+1=2+1=3+1=4
            a -= b;
            count ++;
        }
        System.out.println(count + " with a remainder of "+ a);

       /*        Write a program that can divide two positive numbers without using
        / (division) and * (multiplication) and % operators
                        20 / 6 ==> 3 with the reaminder of 2
                          a = 20
                        b = 6;
                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2
                        x = 100;
                        y = 8;
                        while(a >= b){
                                a -= b;
                                count++;     }
         */
            }
}
