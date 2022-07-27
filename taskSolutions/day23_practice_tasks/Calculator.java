package day23_practice_tasks;

public class Calculator {
    public static void main(String[] args) {
        double num1 = 26;
        double num2 = 95;
        char operator= '+';
        calculator(num1,num2,operator);
    }

    public static void calculator(double num1, double num2, char operator) {
        String result = "Invalid!";
        if (operator == '-' || operator == '+' || operator == '*' || operator == '/') {
            if (operator == '-') {
                result = "Subtraction: " + (num1 - num2);
            } else if (operator == '+') {
                result = "Addition: " + (num1 + num2);
            } else if (operator == '*') {
                result = "Multiplication: " + (num1 * num2);
            } else {
                result = "Division: " + (num1 / num2);
            }
        }
        System.out.println(result);
    }
}
/*
14. create a method named calculator that passes three arguments
 (num1, num2, mathOperator), prints the calculation result
 */