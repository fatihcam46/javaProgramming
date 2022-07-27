package day17_While_DoWHile;

public class LoopPractices {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("----------------------------------------");

        int j = 0;
        while (j<=10){
            //  j++;    buraya yazilsaydi  2 den baslayarak ilerliyor   2 3 4 5 6...
            System.out.println(j);
            j++;  //  0 1  2  3 ...
        }

        System.out.println("----------------------------------------");
            int k = 1;
            do{
               System.out.println(k);
               }while (k<=10);

        System.out.println("----------------------------------------");



    }
}
