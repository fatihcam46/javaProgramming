package day54_1_boot_camp;
import java.util.Scanner;

public class LoopsReview {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
                       if(i == 3){
                           continue;  //if I need to jump from 3  continue 3rd number jump, not print
                         //  break;  //if I need to print till  3
                           }
            System.out.println("EU09 " + i);//EU09 0 EU09 1 EU09 2
        }

        System.out.println("----------while-----------------");
        Scanner scan = new Scanner(System.in);
        int num = 0;

        while (num < 100) {
            System.out.println("Enter a number:");
            num = scan.nextInt();
            System.out.println("You entered: " + num);//user enters a number <100 if >100 stop, if not repeat always
        }
    }
}
