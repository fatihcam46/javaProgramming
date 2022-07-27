package week02;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class PrimitiveExamples {
    public static void main(String[] args) {
        // variables:Primitive types: Numbers\\characters\\boolean
        //  numbers: Byte >>short>>int>>long
         //        decimals (floating) >>>>float and double
        //  caharacters: char data type
        //                not primitive however String: collection of chars
        //   boolean:   true/false
        // 1- data types:
        /*
        DataType variableName=Value; 1-declare  2- initialize
        DataType variableName 1-declare
       variableName=Value;  2- initialize


         */
        byte num1;   //
        num1=123;   //  assign a value
        num1=121;  // reassigne a different value
        short num2 = 12398;
        int distance = 1_000_000_000;
        System.out.println("distance = " + distance);
                long distanceMore= 3_000_000_000L; // passing the limit  I have put L
        long distanceShorter= 1_000_000_000;  //inisde the limit
        float rate = 1000.5F;
        double dNumber=123.4;
        System.out.println("---------------After Castings--------------");
        // i will assign  num1(byte)  num2(short)
  num2=num1 ; // there is implicit castings>>>done by complier
  System.out.println("num2 = " + num2);
        //i will assign  distance variable value to num1
num2 =(short) distance;  // explicit casting>>>>>done by developer/tester from bigger dataType to a smaller type
  System.out.println("num2 = " + num2);

    char ch = 'a';
        System.out.println("ch = " + ch);
        int x = 5+ ch;  // 97='a'  ASCII TABLE
        System.out.println("x = " + x);  // 97+5=102

        String str= ""+'J'+'a'+'v'+'a'; // empty""; makes to turn string  "" KALDIRSAN CALISMAZ
        System.out.println("str = " + str);
        int y = 'J'+'a'+'v'+'a';  // every letter has a number from ASCII TABLE
        System.out.println("y = " + y);  //386
/*
JAVA runs from left to right        "">>>>>String   ''  >>>>  char
 */
        boolean b1=true;  // you can assign condition
        boolean b2 = false;
        System.out.println("b2 = " + b2);
        /*
        valid(I)  Invalid(I)
        _average:V we can use beginning of sentence _  $
         EU09:V  we can use numbers not first character
         println:I a reserved word
         for: I  reserved
         "hello"  for:I  reserved word
         sum_of_data: V
         first-name  : cannot use -:dash
         sumOfData:   camel case   use it
         42isTheSolution : I   we cannot numbers

         */








    }
}
