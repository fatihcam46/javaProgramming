package TurkceJava;

public class Karsilastirma {
    public static void main(String[] args) {

        int a = 10,b=5;
        System.out.println(a==b);//false
        
        int c=10,d=15;
        boolean sonuc1 = c>d;
        System.out.println("sonuc1 = " + sonuc1);//sonuc = false

        // && ve her iki kosulda dogru
        // || veya bir tanesi dogruda sonuc dogru
        //! degil demek.
        
        int e=10,f=20,g=5,h=50;
        boolean kosul1= e<f;
        boolean kosul2 = g<h;
        boolean sonuc = (kosul1&&kosul2);
        boolean sonuc2 = (kosul1 || kosul2);
        System.out.println("sonuc = " + sonuc);//sonuc = true
        System.out.println("sonuc2 = " + sonuc2);//sonuc2 = true


    }
}
