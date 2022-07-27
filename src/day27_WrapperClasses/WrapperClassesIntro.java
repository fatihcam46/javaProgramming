package day27_WrapperClasses;

import java.util.Arrays;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        int num1 = 200; //int oldugundan
                        // Integer olmali
        // Long n1 =num1;
        Integer n1 = num1; //autoboxing
        System.out.println("n1 = " + n1);//n1 = 200

        int num2 = n1;  //unboxing
        System.out.println("num2 = " + num2);//num2 = 200

        System.out.println("----------Integer==>long--------------------------");
        Integer integerValue = 100;

        long longValue = integerValue;
        System.out.println("--------Byte==>----------------------------");
        
        Byte b1 = 25;

        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;
        System.out.println("a4 = " + a4);//a4 = 25

        System.out.println("-------int ==> Integer-----------------------");

        int num3 = 200;
        // Long l2 = num3;  it cannot
        //  Double d1 = num3;  it cannot

        Integer num4 = num3; //autoboxing
        System.out.println("num4 = " + num4);//num4 = 200


        System.out.println("-------Integer==>Integer-----------------------------");

        Integer z = 900;
        Integer y =z;
        System.out.println("y = " + y);//y = 900

        System.out.println("---------------------------------");

        int[] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers2));//[1, 2, 3, 4, 5]







    }
}
