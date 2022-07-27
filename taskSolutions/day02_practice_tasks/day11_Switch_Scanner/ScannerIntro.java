package day02_practice_tasks.day11_Switch_Scanner;


import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // in input  out output// kisayoldan yazmak icin  Scan yazilir

        System.out.println("Enter an integer");
        int num1 =  input.nextInt();

        System.out.println("Enter a decimal:");   // sayi yaziliyor enter a basinca cikiyor
        double num2 =  input.nextDouble();

        System.out.println( num1);
        System.out.println( num2);
        System.out.println("Multiplication:" + num1* num2);

        input.close();  // close the scanner  bundan sonra scanner kullanilmaz






    }

}
