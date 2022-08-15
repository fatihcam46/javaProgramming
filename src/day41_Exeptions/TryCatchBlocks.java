package day41_Exeptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test1 started"); //Test1 started

        try{
            System.out.println(9/0);//it is an exception.after this time it will not able to run/I need try&catch
            System.out.println("Try Block"); //it will not print, it will jump catch block

        }catch (ArithmeticException e){//i must write which class exception  after write e( write any variable)

            System.out.println("Catch Block"); //Catch Block
            System.out.println("Arithmetic Exception was occurred"); //Arithmetic Exception was occurred

        }
        System.out.println("Test1 Completed");//Test1 Completed

        System.out.println("----------------------Test2--------------------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try {
            System.out.println(numbers[200]);//there is no 200`s index
            System.out.println("Try Block");
        }catch (RuntimeException e) { //i need to write what exception type?RuntimeException(always lets use if unchecked)
           // System.out.println("Catch Block");//Catch Block
          //  System.out.println("Run time Exception was occurred" );
            e.printStackTrace();//if you want to learn all details of the exception, for your reports
          //  System.out.println( e.getMessage() ); //print:Index 200 out of bounds for length 5
        }

        System.out.println("Test2 Completed");

        System.out.println("-------------Test3----------------------------------------------------------------");

        System.out.println("Test3 started");

        try {
            System.out.println("Cydeo".substring(2, 0)); //unchecked
        }catch (RuntimeException e){ //RuntimeException, I must use.
            e.printStackTrace();
         //   System.out.println( e.getMessage() ); //full report: begin 2, end 0, length 5
        }
        System.out.println("Test3 Completed");

        System.out.println("---------Test4-----------------------------------------------------");

        System.out.println("Hello");

        try {  //I hanle it, try catch block
            Thread.sleep(3000);//it is written InterruptedException

        } catch (InterruptedException e) {
            e.printStackTrace();
         //   System.out.println( e.getMessage() );
        }

        System.out.println("Cydeo");

        System.out.println("----------Test5----------------------------------------------");


        try {
            FileInputStream file = new FileInputStream("File path");  //in the selenium
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}