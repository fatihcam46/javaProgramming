package day08_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 6;   // 1----12  between ~~~
        boolean has28days = number ==2;
        boolean has30days = number ==4 || number ==6 || number ==9 || number ==11;
     // boolean has31days = number ==1 || number ==3 || number ==5 || number ==7 || number ==8 || number ==10 || number ==12;
        boolean has31days= !has28days && !has30days;

        if (has28days) {   // if the month has 28 days
            System.out.println("28 days");              }
        if (has30days) {            // if the month has 30 days
            System.out.println("30 days");              }
        if (has31days) {            // if the month has 31 days
            System.out.println("31 days");              }


    }
}
