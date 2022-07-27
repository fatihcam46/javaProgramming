package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        System.out.println("-------------toString method---------------------------");
        int[] nums = {1,2,3,4,5};

        System.out.println( nums); //hashcode [I@27f674d
        System.out.println(Arrays.toString(nums));//[1, 2, 3, 4, 5]
        //toString(array): converts the array object (single dimensional) to string, returns string
        System.out.println(nums[0]);//1

        /*
        String str ="Java";
        System.out.println(str);
        System.out.println(str.toString());
                */
        System.out.println("------------------sort() method----------------------------");
        int[] scores = {95,100,55,65,85,78};
        System.out.println(Arrays.toString(scores));//[95, 100, 55, 65, 85, 78]
        Arrays.sort(scores);//ascending order
        System.out.println(Arrays.toString(scores));//[55, 65, 78, 85, 95, 100]
        System.out.println("Min scores = " + scores[0]);//55
        System.out.println("Max scores = " + scores[scores.length-1]);//100

        String[] names ={"Anna","Gunay","Zuhal","Ahmet","Maria","Sinem"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));//[Ahmet, Anna, Gunay, Maria, Sinema, Zuhal]

        String[] words = {"Anna","ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));//[ANNA, Anna]  uppercase letter after lowercase letter
//ascending order  want to do  descending order reverse it
        System.out.println("------------------equals() method----------------------------");
        
        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};
        boolean r1 =  Arrays.equals(arr1,arr2);
        System.out.println(r1);

        Arrays.sort(arr1);//
        Arrays.sort(arr2);
        boolean r2 =  Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("------------------equals() method-------char array---------------------");

        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'a', 'b','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);

    }
}
