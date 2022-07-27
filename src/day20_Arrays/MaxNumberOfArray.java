package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {
        int[] numbers = {10,5,4,20,1,0};// find out max number
        int max = numbers[0];  //10>5>4>20>1>0  one by one control

        for (int i = 0; i < numbers.length; i++) {  // numbers.fori  yazinca otomatik cikiyor
            if(numbers[i]>max){ // if there is element in the array thats greater than current max number
                max = numbers[i];

            }
        }
        System.out.println("10,5,4,20,1,0: find out max number?");
        System.out.println("max = " + max);











    }
}
