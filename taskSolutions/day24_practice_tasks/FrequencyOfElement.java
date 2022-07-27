package day24_practice_tasks;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};
        System.out.println(frequencyOfElement(array, 1));//5
    }
    public static int frequencyOfElement(int[] array, int element){

        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }
}
/*
5. create method that accepts one integer array and one integer number and returns the frequency of the number
                    Ex:
                        int[] array ={1,1,1,1,1,2,2};
                        frequency(array, 1) ==> 5
 */