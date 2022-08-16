package day41_Exceptions;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {
System.out.println("------------------unchecked exception----------------------");
        //unchecked exception:example:

        int a = 10;   int b = 0;

     // System.out.println(  a / b  );//ArithmeticException: / by zero
     // System.out.println("Wooden Spoon");//it is not possible continue to print
System.out.println("----------------------------------------");
        char[] characters = {'A', 'B', 'C'};
        //                    0,   1,   2

     //    System.out.println( characters[99] );I dont have this character,i have max index number 2,I must check.
            //ArrayIndexOutOfBoundsException:Index 99 out of bounds for length 3
System.out.println("----------------------------------------");
//day39; student object
      //  Student student = null;
       // System.out.println( student.getName() );//NullPointerException: I dont have object, i cannot get name
       // student.study();  //NullPointerException

       //  String str = "Wooden Spoon";
       // final String str = "Wooden Spoon";
       //  str = null;

      //     System.out.println( str.toUpperCase() );// i don't have

        String str2 = ""; // object != null
        System.out.println(str2.isEmpty());//true
   //     System.out.println("Java".charAt(1000)); // unchecked  // I have 0;1;2;3 index number.
System.out.println("------------checked Exception----------------------------");
        // checked Exception: while you are writing code

        System.out.println("Hello");//Hello

        //  Thread.sleep(3000); // sleep is error: checked

        System.out.println("Cydeo"); //Cydeo

        // FileInputStream file = new FileInputStream("path of the file");  //selenium class
    }}
