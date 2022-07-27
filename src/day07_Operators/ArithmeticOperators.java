package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        /*        20 / 6 = 3
		           20.0 / 6 = 3.333....		10/2 = 5
		                                    10/3 = 3.3333...
		remainder = numerator -(denominator * integer result)
				     10      - (3 * 3) = 1
				     1/3 = 0.3333....
				     -------------------------------
   remainder%       10 % 3 ==> 1
 45 / 8 = 5.625     45 - (8 * 5 ) =5		 45 % 8 ===> 5		 100 % 15 ==> 10
                                                            		 100 / 15 = 6.66.....
		                                                             100 - (15 * 6) = 10
         */
        int num1 = 10;
        int num2 =3;   // 10/3=3 remainder is 1
        int division = num1/num2;   //
        int remainder =num1%num2;   // remainder variable contains of
        // result  :  10 divided by 3 is equal to 3 with remainder of 1
        System.out.println(num1 + " divided by "+num2+" is equal to "+division +" with remainder of "+remainder);
        // What is the remainder of 25 divided 4
        System.out.println(25%4);
            // What is the remainder of 25 divided 5
             System.out.println(25%5);











    }




}
