package Variables;

import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        int quiz,finall,vize;
        double ortalama;
        Scanner input =new Scanner(System.in);
        System.out.println("Quiz notunu giriniz:");
        quiz=input.nextInt();
        System.out.println("Vize notunu giriniz:");
        vize=input.nextInt();
        System.out.println("Final notunu giriniz:");
        finall=input.nextInt();

        ortalama = (quiz*0.15)+(vize*0.35)+(finall*0.5);
        System.out.println("Not ortalamaniz:"+ortalama);

        String sonuc = (ortalama>=50)?"Gectiniz":"Kaldiniz";
        System.out.println("sonuc = " + sonuc);


        System.out.println("---------------------------");
        double tutar,kdvli, kdv=0.18;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Tutari giriniz:");
        tutar = girdi.nextDouble();
        kdvli=tutar+tutar*kdv;
        System.out.println("Girdinin kdvli fiyat:"+kdvli);

    }
}
