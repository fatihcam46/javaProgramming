package day02_practice_tasks.day11_Switch_Scanner;

public class DaysInWeek {
    // long number = 9L    kullanilamaz      String,short , char,int   kullanilabilir
    // float number = 9F  kullanilamaz
    // double number = 9D  kullanilamaz
    // boolean number = true   kullanilamaz
    public static void main(String[] args) {
        int number= 155;  //1~7   8 possible outcomes  1234567  and invalid
         /*
        if(number==1){

            System.out.println("Monday");
        }  ...         */
        switch(number){ //1,2,3,4,5,6,7  ==
            case 1:
                System.out.println("Monday");
                break;  // exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;   // exits the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                break;    // exits the switch after executing the case block
             case 4:
                System.out.println("Thursday");
                break;   // exits the switch after executing the case block

            case 5:
                System.out.println("Friday");
                break;   // exits the switch after executing the case block
            case 6:
                System.out.println("Saturday");
                break;    // exits the switch after executing the case block
                // break yazilmazsa sonrakileri de yazar
            case 7:
                System.out.println("Sunday");
                break;    // exits the switch after executing the case block
               // sonuna default yazip  INVALID yazilabilir .
            default:   // only gets executed if none of the case block are matching
                System.out.println("Invalid");

        }













    }
}
