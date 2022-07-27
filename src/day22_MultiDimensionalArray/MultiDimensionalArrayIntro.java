package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        // single dimensional array: container for the elments===>10   20   30     int[]={10,20,30}
        // multi dimensional array:container for the arrays, array of arrays
        // int [] [] array2D = new int[3] [];
        /*
        String [] group1= {"Jon", "James","Joes"};
        String [] group2= {"Jon", "James","Joes"}
        String [] group3= {"Jon", "James","Joes"}
         */
        String [] group1= {"Jon", "James","Joes"};
        String [] group2= {"Aaron", "Shay","Brenna"};
        String [] group3= {"Cassandra", "Tahir","Aygun"};
        String[][] groups = new String[3][];// index:0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

       // System.out.println(Arrays.toString(groups));//toString is for one dimensional method
        System.out.println(Arrays.deepToString(groups));
        //[[Jon, James, Joes], [Aaron, Shay, Brenna], [Cassandra, Tahir, Aygun]]
        System.out.println("----------------------------------------------------");
        //{1,2,3}  {4,5,6,7}  {8,9,10,11,12}
        //index of elements:0 1 2    0 1 2 3     0 1 2  3  4
        int [][] arr2D= { {1,2,3} , {4,5,6,7} , {8,9,10,11,12}};
 // index of arrays:          0             1           2      :lenght is count the arrays:
        System.out.println(Arrays.deepToString(arr2D));
        //[[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]
        System.out.println(Arrays.toString(arr2D[1]) );//[4, 5, 6, 7]
        System.out.println(arr2D[2][3]);//11  // tek tek  yazilmaz  ==> loop ile yapilacak:














    }
}
