package week10_11;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperClassExamples {
    public static void main(String[] args) {
        int i1 = 100; // primitive

        Integer i2; // object   Scanner scan = new Scanner...

        // auto-boxing Examples
        i2= i1; // automatically the data enlarge itself from primitive to Object
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(i1);// automatically the data enlarge itself from primitive to Object
        arrayList.add(i2);
        System.out.println("---Arraylist---");       // i1=100 and i2=100,
        System.out.println("arrayList = " + arrayList);//arrayList = [100, 100]

        Integer n1 = 300;
        int n2 = n1; // un-boxing to primitive
        n2 = arrayList.get(1); // getting an Object from arrayList and assigning to primitive : un-boxing

        String searchResult = "1-48 of over 6000 results for java";
        String[] arr = searchResult.split(" ");
        System.out.println(Arrays.toString(arr));//[1-48, of, over, 6000, results, for, java]

        int resultAsPrimitive = Integer.parseInt(arr[3]);//parseInt//primitive type
        System.out.println("resultAsPrimitive = " + resultAsPrimitive);//6000
        // you can NOT use Wrapper Classes Methods with primitive

        Integer resultAsObject = Integer.valueOf(arr[3]);//wrapper type
        System.out.println("resultAsObject = " + resultAsObject);//6000


    }
}
