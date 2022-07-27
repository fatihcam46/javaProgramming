package day01_javaIntro;

import java.util.Scanner;

public class QUIZdevam {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        byte b1 = userInput.nextByte();
        byte b2 = userInput.nextByte();

        int max =(b1>b2) ? b1+2 :b2-4;
        System.out.println("max = " + max);//100>>>>15>>>  answer:102
    }
}
