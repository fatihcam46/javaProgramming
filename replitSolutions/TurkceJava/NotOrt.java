package TurkceJava;

import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        int mat,turkce,fen,sosyal,beden;
        Scanner scan =new Scanner(System.in);

        System.out.print("Matematik notunu giriniz:");
        mat=scan.nextInt();
        System.out.print("Turkce notunu giriniz:");
        turkce=scan.nextInt();
        System.out.print("Fen notunu giriniz:");
        fen=scan.nextInt();
        System.out.print("Sosyal notunu giriniz:");
        sosyal=scan.nextInt();
        System.out.print("Beden notunu giriniz:");
        beden=scan.nextInt();

        int ortalama = (mat+turkce+fen+beden+sosyal)/5;
        System.out.println("ortalamaniz = " + ortalama);
        if(ortalama>=50){
            System.out.println("gectiniz");
        }else{
            System.out.println("kaldiniz.");
        }

    }
}
