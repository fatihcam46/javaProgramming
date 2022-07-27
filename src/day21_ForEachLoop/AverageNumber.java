package day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60}; // average=sum/how many
        double sum = 0;
        // for each loop best way
        for (int number : numbers) {  // numbers.for hit the enter
            sum +=number;
        }
        double average = sum/numbers.length;
        System.out.println("average = " + average);








    }
}
