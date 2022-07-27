package day12_Scanner;

// import java.util.*;        //wild import: imports everything from the package  butun paketleri yapar
import java.util.Scanner;      //regular import : import one class

public class ScannerPractice {
    public static void main(String[] args) {
                            // DAYS  //
        Scanner scan = new Scanner(System.in);    //   new scanner(System.in).nextInt();
        System.out.println("Enter a number between 1 to 7 : ");
        int num = scan.nextInt();

        String result = "";    //temporary value
        if(num>=1  &&  num<=7){   // between 1~7         //tenaries lets use  // we use if  else  or  case
            result = (num==1)? "Monday" :  (num==2)? "Tuesday"  : (num==3)? "Wednesday"
                    : (num==4)? "Thursday" : (num==5)? "Friday" : (num==6)? "Saturday" : "Sunday";
        }else{
            result = "Invalid Number";
        }

        System.out.println("result = " + result);
        scan.close();   // scan den sonra  close yapinca tekrar kullanilmaz







    }
}
