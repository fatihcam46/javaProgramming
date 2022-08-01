package TurkceJava;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String kullaniciAdi, parola;
        System.out.print("Kullanici adi giriniz:");
        kullaniciAdi = scan.nextLine();

        System.out.print("Parolanizi giriniz:");
        parola = scan.nextLine();

 if (kullaniciAdi.equalsIgnoreCase("Fatih") && parola.equalsIgnoreCase("123")) {
            System.out.println("Basarili bir sekilde giris yaptiniz");
        } else {
            System.out.println("Kullanici adi veya parola hatali");
        }

    }

    }
