package Statements;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String in = s.next();
        double burger_chicken_price=10.0;
        double soda=2.0;
        double fries=3.5;
        //your code here
        switch(in)        {
            case "burger":
            case "chicken":
                System.out.println(burger_chicken_price);
                break;
            case "soda":
                System.out.println(soda);
                break;
            case "fries":
                System.out.println(fries);
                break;
        }


    }
}
