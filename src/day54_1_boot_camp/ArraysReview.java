package day54_1_boot_camp;
import java.util.Arrays;
public class ArraysReview {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};
        // arrays literal: if we know how many elements and what those elements are
        nums[3] = 400;//index numbers 3 rd means=40  changed 400

        int[] numbers = new int[5];//5 elements in arrays
        // new keyword: if we know how many elements need to be in the array
        numbers[2] = 25;

        System.out.println(Arrays.toString(nums) );//[10, 20, 30, 400, 50]
        System.out.println(Arrays.toString(numbers));//[0, 0, 25, 0, 0]

 System.out.println("--------------2 dimensional-----------------------------");

        String[] arr1 = {"A", "B", "C"};
        System.out.println(Arrays.toString(arr1) );//[A, B, C]
        String[] arr2 = {"D", "E", "F"};
        System.out.println(Arrays.toString(arr2) );//[D, E, F]

        String[][] arr = { arr1, arr2};


 System.out.println("---------------------------------------------");

        char[] characters = {'A', 'B', 'C', 'D', 'E'};

        /* use >>>>for loop
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

         */
//use for each loop   >>it is simple> it is easy to understand
        for (char each : characters) {
            System.out.print(each + ", "); //A, B, C, D, E,
        }

    }
}
