package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {
        int[] numbers ={100, 500, 30, 40, 600, 80, 90};
        int min = numbers[0]; // 100<500<... ilk sayidan baslayarak kontrol ediliyor
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) { // if there is element in the array thats smaller than current min number
                min = numbers[i];  // smaller number will be assigned to the variable
            }
        }
        System.out.println("100, 500, 30, 40, 600, 80, 90: find out min number?");
        System.out.println("min = " + min);
    }
}
