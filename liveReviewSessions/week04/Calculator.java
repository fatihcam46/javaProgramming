package week04;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //we will get two number of double from user and we will get a char

        double num1, num2, num3,result;
        result=0;
        char operator;


/*
to autoFormat code INTELIJ CTRL+ALT+L
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two double type numbers");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.println("Enter arithmetic operation you want(+,-,*,/,%)");
        operator =scanner.next().charAt(0); // to get char with scanner we are using String manipulation
        System.out.println("Is first number bigger than second number?");
boolean answer=scanner.nextBoolean(); //true or false
        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':  //this condition has a nested condition inside
                if(answer){
                    result = num1-num2;
                }else {
                    result=num2-num1;
                }
                break;
            case '/':
                if(answer && num2!=0){
                    result = num1/num2;
                }else {
                    if (num1 != 0) {
                        result = num2 / num1;
                    } else {
                        System.out.println("Unwanted number");
                    }
                }
                break;
            case '*':
                result = num1*num2;
                break;
            case '%':   // ternary operator >>>  variable =condition? trueValue:falseValue
                result = answer? num1%num2: num1%num2;
                break;
            default:
                System.err.println("Unrecognised operation");
            break;
                    }
        System.out.println("result = " + result);

    }
}
