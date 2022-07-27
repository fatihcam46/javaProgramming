package day23_practice_tasks;

public class EachElement {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};
        printEachElement(numbers);

    }
    public static void printEachElement(int[] numbers){
        for (int number : numbers) {
            System.out.print(number+"\t");
        }
    }
}
/*
13. create a method named printEachElement that can print each elements of an integer array
 */