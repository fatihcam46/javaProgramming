package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable thats capable enough to contain 5 names
        String[] myGroup4 = new String[5];  // String myGroup[];  it is possible also
        //  System.out.println("myGroup = " + myGroup); // hashcode
        System.out.println(Arrays.toString(myGroup4));  // [null, null, null, null, null]

        System.out.println("--------------------int----------------------------");
        int[] myGroup2 = new int[5];
        System.out.println(Arrays.toString(myGroup2));  //[0, 0, 0, 0, 0]

        System.out.println("----------------------double-----------------------");
        double[] myGroup3 = new double[5];
        System.out.println(Arrays.toString(myGroup3));  //[0.0, 0.0, 0.0, 0.0, 0.0]

        System.out.println("-----------------one by one ---name by name------------------------");
        String[] myGroup = new String[5];  // "Gunay"  "Neira"  "Suat"  "Hulya"  "Mikail"   0~4 index numbers
        myGroup[0] = "Gunay";       // sadece 5 kisi yazabiliriz  String[5]
        myGroup[1] = "Neira";   // index numbers cannot be negative -1
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";  // numaralar ayni olursa en son olani yazilir
        myGroup[4] = "Mikail";
        System.out.println(Arrays.toString(myGroup));   //  if we dont know this way we are using

        System.out.println("-------------------days---------------------------");
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // index             0           1            2         3           4       5          6

        System.out.println(Arrays.toString(days));

        int number = 5;   //
        if (number < 1 || number > 7) {
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number - 1]);

        System.out.println("-------------------months---------------------------");
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        // index             0   1        2       3       4     5      6     7     8      9     10      11

        System.out.println(Arrays.toString(months));

        int numberMonths = 15;   //
        if (numberMonths < 1 || numberMonths > 12) {
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(months[numberMonths - 1]);




    }
}
