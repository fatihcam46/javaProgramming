package day21_ForEachLoop;

public class Max1number {
    public static void main(String[] args) {
/*
        int[] numbers = {10,5,4,20,1,0};// find out max number
        int max = numbers[0];  //10>5>4>20>1>0  one by one control

        for (int i = 0; i < numbers.length; i++) {  // numbers.fori  yazinca otomatik cikiyor
            if(numbers[i]>max){ // if there is element in the array thats greater than current max number
                max = numbers[i];
*/
        // for each loop best way
        int[] numbers = {10,5,4,20,1,0};
        int max = numbers[0];
        for(int number:numbers){  //
           if(number>max){
               max=number;
           }
        }
        System.out.println(max);









    }
}
