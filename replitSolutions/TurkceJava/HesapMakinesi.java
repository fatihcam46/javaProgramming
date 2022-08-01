package TurkceJava;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("ilk Sayiyi giriniz:");
        int sayi1 = scan.nextInt();

        System.out.println("ikinci Sayiyi giriniz:");
        int sayi2 = scan.nextInt();

        System.out.println("Yapmak istediniz islemi seciniz:(+ - * /)");
        char ch= scan.next().charAt(0);

        if(ch=='+'){
            System.out.println("Toplam:"+(sayi1+sayi2));
        }else if(ch=='-'){
            System.out.println("Fark:"+(sayi1-sayi2));
        }else if(ch=='/') {
            System.out.println("Bolum:"+(sayi1 / sayi2));
        }else if(ch=='*') {
            System.out.println("Carpim:" + (sayi1 * sayi2));
        }else{
            System.out.println("Gecersiz islem, tekrar giriniz");
        }


    }
}
