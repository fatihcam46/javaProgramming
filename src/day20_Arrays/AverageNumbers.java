package day20_Arrays;

public class AverageNumbers {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60}; // average=sum/how many
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double averageNumber = sum/numbers.length;
        // 10/3=3.3
        System.out.println("10,20,30,40,50,60");
        System.out.println("averageNumber = " + averageNumber);









    }
}
