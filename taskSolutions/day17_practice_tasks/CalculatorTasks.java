package day17_practice_tasks;

import java.util.Scanner;

public class CalculatorTasks {
    public static void main(String[] args) {
        /*
 3. write a program to ask user to enter two number and math operator, and return the result.
		if the operator is invalid operator, ask user to re-enter the
		operator until user provides a valid operator (+, -, *, /)
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number");
        int num2 = scan.nextInt();
        System.out.println("Enter your math operator");
        char ch = scan.next().charAt(0);

        while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
            System.err.println("Invalid Operator, please re-enter:");
            ch = scan.next().charAt(0);
        }

        double result = 0;
        if (ch == '-') {
            result = num1 - num2;
        } else if (ch == '+') {
            result = num1 + num2;
        } else if (ch == '*') {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }
        System.out.println(result);
        scan.close();
    }
}
