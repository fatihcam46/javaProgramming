package day42_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException{
//i used InterruptedException, if it is checked exception
        //throw method temporary solution,but try catch block permanent solution.
        //I can use many exception I want.
        System.out.println("-------- Test 1------------");
//i am not using try catch block,we are using throws keyword>>
        System.out.println("Hello");
        Thread.sleep(3000); //compile error//3 seconds=3000miliseconds
        System.out.println("Cydeo");

        System.out.println("-------- Test 1 Completed------------");


        System.out.println("-------- Test 2------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 25");

        System.out.println("-------- Test 2 Completed------------");




    }
}
