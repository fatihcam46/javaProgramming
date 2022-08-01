package day17_While_DoWHile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        //  username="Cydeo"  password="Cydeo123"     // if correct login
        if(u.equals("Cydeo") && p.equals("Cydeo123") ){
            System.out.println("Logged in");
        }else{   // are not valid  //3 kere hakki var
            int attempts =3;  //3,2,1
            while (!(u.equals("Cydeo")&& p.equals("Cyddeo123"))&& attempts>0){
                //while credentials are invalid , and useer has attempt re enter
                if(attempts==1){
                    System.out.println("THIS IS YOUR LAST CHANCE");
                }
                System.out.println("Incorrect username or password, please re-enter:");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();
                attempts--;
            }
           if(u.equals("Cydeo") && p.equals("Cydeo123")){
               System.out.println("Logged in");
           }else{
               System.out.println("Your account is locked");
           }
        }
        scan.close();

/* You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials and
                if all three attempts are failed, then print "Your account is locked."
 */






    }
}
