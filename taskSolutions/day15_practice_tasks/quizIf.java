package day15_practice_tasks;

public class quizIf {
    public static void main(String[] args) {
        int num = 9;
        if(num++==10){
            System.out.println("num = " + num);
        }else {
            System.out.println("nummmmm");}

        System.out.println("---------------------");
        int score = 0;
        if(score==0){
            score+=50;
        }if(score!=0){
            score+=50;
        }
        System.out.println("score = " + score);
        System.out.println("---------------------");

        boolean A=true, B=!false;
        if(B){
            System.out.println("B");

        }else if(A){
            System.out.println("A");
        }else{
            System.out.println("C");
        }
        System.out.println("---------------------");
        boolean result = true;
        if(result){
            System.out.println("It is true");
        }else if(result){
            System.out.println("false");
        }else {
            System.out.println("none of them");
        }
        System.out.println("-----------------------");

        float f1 =(12_345.1>123_45.0)? 12_456:124_56.02f;
        float f2 = f1 + 1024;  //13480
        System.out.println("f2 = " + f2);

        float f3 = (1_560.00>12_60.00)? 10:20;
        System.out.println("f3 = " + f3);   //10.0



    }
}
