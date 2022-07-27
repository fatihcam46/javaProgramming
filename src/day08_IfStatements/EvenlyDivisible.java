package day08_IfStatements;
public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 100;
        boolean DivisibleBy2 = number % 2 ==0;  // if the remainder a number divided by2 then its EvenlyDivisible
        boolean DivisibleBy3 = number % 3 ==0;
        boolean DivisibleBy5 = number % 5 ==0;

        System.out.println(number + " is divisible by 2 " + DivisibleBy2);
        System.out.println(number + " is divisible by 3 " + DivisibleBy3);
        System.out.println(number + " is divisible by 5 " + DivisibleBy5);

                System.out.println("--------------------isLeapYear----------------");

        int year = 2000;
        boolean isLeapYear = year % 4 == 0;
        System.out.println(year + " isLeapYear = " + isLeapYear);

     /*       Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:		number = 65;
			output:	65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
      */
    }
}
