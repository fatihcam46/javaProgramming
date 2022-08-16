package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {
    public static void main(String[] args)  {

        System.out.println("Hello");//Hello

        //    sleep(2.5); // throws, compile error, throws we need

        System.out.println("Hello world");//Hello world

        System.out.println("----------------------------------------");

        System.out.println("Hello");//Hello

        MorningWorkOut.sleep(2.5); // try & catch//MorningWorkOut another class>>

        System.out.println("Cydeo");//Cydeo

    }
    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep( (long) (seconds * 1000) );

    }
}
