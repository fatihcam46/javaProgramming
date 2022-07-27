package week04;

import java.util.Scanner;

public class AdaireApartments {
    public static void main(String[] args) {
        System.out.println("------------------if else statement--------------" );
        int floorNumber;   //declaring my variable no value
        Scanner input = new Scanner(System.in);
        System.out.println("Which floor are you leaving?");

        floorNumber = input.nextInt();
        if(floorNumber==1){
            System.out.println("You are leaving at first floor");
        }else if(floorNumber==2) {
            System.out.println("You are leaving at second floor");
        }else if(floorNumber==3) {
            System.out.println("You are leaving at third floor");
        }else {
            System.err.println("There is no such floor");
        }

        System.out.println("------------------switch statement--------------" );
        /*
        ##it can only perform====comperison ><
        ##byte,char,int,String,short variables type
        ## break to get out of switch
        ##data type of case and condition should be same
         */
        switch (floorNumber){
            case 1:
                System.out.println("You are leaving at first floor"); //action
                break;
            case 2:
                System.out.println("You are leaving at second floor");//action
                break;
            case 3:
                System.out.println("You are leaving at third floor");//action
                break;
            default:
                System.out.println("There is no such floor");
                break;
        }
        input.close();

    }
}
