package day15_ForLoop;

public class ForLoopPracticies {
    public static void main(String[] args) {   //15  16   17   18  19  ....45

        System.out.println(15);
        System.out.println(16); // time consuming  so long  ... tek tek yazmak

        for(int i =15; i<=45 ; i++){     // i++  birer birer artiyor  15  16  17   18  ...45
            System.out.print(i+" ");  // yan yana yazilmasi icin
        }
        System.out.println();
        System.out.println("Hello");
        System.out.println("-----------------------------------------");
// 100  to 50   100  99  98  97  ...50
        for(int i =100; i>=50 ; i--) {     // i--  birer birer azaliyor  100  to 50   100  99  98  97  ...50
            System.out.print(i + " ");    // (>=  <=   <   >  kullanilir
        }
        System.out.println();
        System.out.println("-----------------------------------------");
        // print all the even number between   1~55
        for(int i=1 ; i<=55; i++){
            if( i % 2 ==0){
                System.out.print(i + " ");
            }
          }
        System.out.println();  // sonraki ile ayni satirda olmamasi icin
        System.out.println("-----------------------------------------");

        // print all the even number between   1~55    2 4 6 8 ..54
        for(int i=2 ; i<=54; i+=2){   // ikiser ikiser ilerleme
                System.out.print(i + " ");
            }

        System.out.println();
        System.out.println("-----------------------------------------");









    }
}
