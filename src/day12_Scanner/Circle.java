package day12_Scanner;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // scanner scan actiktan sonra input a cevirdik
        System.out.println("Enter the radius of the circle:");
        double r = input.nextDouble();

        double area = r * r * 3.14;
        double perimeter = 2 * r * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        input.close();                            // input.close yapip dirmasini sagladik




/*          Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */



    }
}
