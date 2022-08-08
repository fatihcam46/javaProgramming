package TurkceJava;
import java.util.Scanner;
//faktoriyel//harmonik//uslu sayilar//
public class WhileOrnekler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Faktoriyel sayisini giriniz:");
        int f = scan.nextInt();
        int sonuc =1;
            while (f > 0) {
                sonuc *= f;
                f--;
            }
        System.out.println("sonuc = " + sonuc);

        System.out.println("------------harmonic sayilar---------");
        Scanner scann = new Scanner(System.in);
        System.out.println("Harmonik sayisini giriniz:");
        double h = scann.nextDouble();
        double harmonic = 0.0;
        while(h>0){
            harmonic = harmonic + 1/h; 
            h--;
        }
        System.out.println("harmonic = " + harmonic);

        System.out.println("------------uslu sayilar---------");
        Scanner scanUslu = new Scanner(System.in);
        int sayi1,sayi2,sonucUslu=1;
        System.out.println("Ussu alinacak sayi:");
        sayi1 = scan.nextInt();

        System.out.println("Us olacak sayi:");
        sayi2 = scan.nextInt();

        int i=1;
        while (i<= sayi2){
            sonucUslu = sonucUslu*sayi1;
            i++;
        }
        System.out.println("sonucUslu = " + sonucUslu);

    }
}
