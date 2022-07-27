package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
       // store teh elements: 10   20    50   70     // we know every elements
       int [] numbers = {10,20,50,70}; // size : 4
        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------we dont know what elements are?--------------------");
        // create a variable that can contain five scores
        int[] scores = new int[5];  //  [0, 0, 0, 0, 0]
       scores [1] =85;  // index number of 85 is 1
       scores[scores.length -1] = 95;   //  scores [4] = 95;  // index number of 95 is 4
       scores[3] = 75;
       scores [0] = 65;
       scores [2] = 55;
        System.out.println(Arrays.toString(scores));  // [65, 85, 55, 75, 95]

        System.out.println("-------------------months---------------------------");
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        // index             0   1        2       3       4     5      6     7     8      9     10      11
                                                                        // length  - 1
        System.out.println(Arrays.toString(months));
/*
        int numberMonths = 15;   //
        if (numberMonths < 1 || numberMonths > 12) {
            System.err.println("Invalid number");
            System.exit(0);
        }


        System.out.println(months[numberMonths - 1]);  // i represent index numbers of array starting from 0
*/
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println("-------------------backward months---------------------------");
        for(int i = months.length-1; i >= 0; i--  ){//i: represents the index numbers of array
                                                        // starting from last index
            System.out.println(months[i]);
        }

    }
}
