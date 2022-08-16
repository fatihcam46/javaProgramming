package day41_Exceptions;
import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;//day39_Recap.cydeoTask.Employee; //lets say null //salary

      try {
//without knowing any exception class, we can try exceptions
        System.out.println(employee.getSalary()); // Null Pointer Exception
        }catch (NullPointerException e){
            System.out.println("First Catch Block:NullPointerException");//if there is no here, it will pass RuntimeException
            e.printStackTrace();
          System.out.println( e.getMessage() ); //null
        }catch(IndexOutOfBoundsException e){
            System.out.println("Second catch block:IndexOutOfBoundsException");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Third catch block:ArithmeticException");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Fourth catch block:ClassCastException");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth catch block:RuntimeException");
            e.printStackTrace();
        }

        System.out.println("Tested Completed");

        System.out.println("---------------------------------------------------");

        try {
            System.out.println("Java".charAt(-1));//it cannot index number negative
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println( e.getMessage() );//String index out of range: -1
        }
    }
}