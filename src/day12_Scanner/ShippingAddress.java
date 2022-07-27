package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   //enter

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();      //javaprogramming

        System.out.println("Enter your building number:");
        String building = scan.nextLine();     ///7925A

        System.out.println("Enter your Street name:");
        String street = scan.nextLine();       //  street name after>>> enter

        System.out.println("Enter your City name:");
        String city = scan.nextLine();

        System.out.println("Enter your State name:");
        String state = scan.nextLine();

        System.out.println("Enter your Zip Code:");
        String zipCode = scan.nextLine();

        System.out.println("Enter your Country name:");
        String country = scan.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);

        System.out.println("The shipping address:" + "\n" + fullName + "\n" + building + "," + street + "," +
                "\n"+ city+ "\n"+ zipCode+ "\n"+ country );
        
        scan.close();
/*
1.Enter your full name    (nextLine)
2.bulding number   (next)
3.street name     (nextLine)
4.city name     (nextLine)
5.state    (next)
6.zip code  (next)
display the shipping address
 */




    }
}
