package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {
        System.out.println("------------------copyOf() method----------------------------");
        String[] students= {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students,3);//ilk 3unu yaz

        System.out.println(Arrays.toString(earlyBirds));//[Elif, Sinem, Gunay]

        String[] earlyBirds2 = Arrays.copyOf(students,10);//ilk 10unu yaz,bosluklara null
        System.out.println(Arrays.toString(earlyBirds2));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));//[1, 2, 3, 4, 5]

        System.out.println("------------------copyOfRange() method----------------------------");

        char[] ch1 = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};// 3. DEN 7.YE
        //              0     1    2   3    4   5    6    7    8
        char[] ch2 = Arrays.copyOfRange(ch1,2,6+1);
        System.out.println(Arrays.toString(ch2));// [C,D,E,F,G]

        int[] scores = {10,20,30,40,50,60,70,80,90,100};// 3rd~7th
        //              0  1   2  3  4  5  6  7  8  9
        int[] result = Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(result));// [40, 50, 60, 70, 80]

        int[] result2 = Arrays.copyOfRange(scores,5,10);
        System.out.println(Arrays.toString(result2));

        int[] result3 = Arrays.copyOfRange(scores,5,scores.length);
        System.out.println(Arrays.toString(result3));







    }
}
