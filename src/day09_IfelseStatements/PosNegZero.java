package day09_IfelseStatements;

public class PosNegZero {
    public static void main(String[] args) {
        int n = -55;
        if(n>0){
            System.out.println("Positive");
        }
        if(n<0){
            System.out.println("Negative");
        }
        if(n ==0){
            System.out.println("Zero");
        }   // bu islem uzun ve sistemi yoracagindan yazilmamali.  multi branch if yazilmali
        System.out.println("-------------------------------------------------");

        //multi branch if
             boolean positive = n>0;
            boolean negative = n<0;
        if (n > 0) {
            System.out.println("Positive");
        }else if(n<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        System.out.println("-------------------------------------------------");
        // if and else   we can NEVER apply

    }

}
