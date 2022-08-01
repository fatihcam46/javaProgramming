package TurkceJava;

public class whileDoWhile {
    public static void main(String[] args) {

        int i = 1;

        while(i<=5){
            System.out.print(i+", ");
            i++;
        }//sonu bilinmeyen durumlarda while kullanilir.sonsuz sayida devam eder
        System.out.println("-----do while------");


        System.out.println("-----for loop------");

        for (int j = 1; j < 6; j++) {
            System.out.println(j+", ");//sonu bilinen durumlarda while kullanilir
        }
        System.out.println("-----break ve continue------");
        int e=1;
        while (e<=50){
            if(e % 2 ==0){
                System.out.print(e+", ");
            }
            e++;
        }

    }
}
