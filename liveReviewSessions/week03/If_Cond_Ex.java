package week03;

public class If_Cond_Ex {
    public static void main(String[] args) {
        /*
        accept three number  turn great number
         */
        int num1, num2, num3;
        int maxNum;
        num1 = 4;
        num2 = 8;
        num3 = 1;
        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
        } else if (num2 > num1 && num2 > num3){
            maxNum = num2;
        }else {
            maxNum = num3;
        }

        System.out.println("maxNum = " + maxNum);

    }
}
