package TurkceJava;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);//1   2  3
        System.out.println("Sayi giriniz:");
        int sayi = scan.nextInt();

        switch (sayi){
            case 1 :
                System.out.println("Sayi 1 e esittir");break;//durdur
            case 2:
                System.out.println("Sayi 2 e esittir");break;
            case 3:
                System.out.println("Sayi 3 e esittir");break;
            default:
                System.out.println("Gecersiz sayi girdiniz.");
        }



    }
}
