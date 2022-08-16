package day42_Exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws ArithmeticException {
//without throws ArithmeticException it is compile error
        System.out.println("Test started");

        System.out.println(8/0);//ArithmeticException>>unchecked exception

        System.out.println("Test completed");


    }
}
