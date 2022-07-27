package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees =new ArrayList<>();
   employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

   employees.retainAll( Arrays.asList("Ahmed", "David") );//keep just Ahmed&David  retainAll method

   System.out.println(employees);//[David, Ahmed, Ahmed, David]

        System.out.println("--------------------------------------------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};
//firstly convert to ArrayList
        ArrayList<String> list = new ArrayList<>( Arrays.asList(names) );
        //   object ArrayList       -------------collection :asList method
//starting without M,remove
        list.removeIf( p -> p.charAt(0) == 'M' );
        System.out.println("list = " + list);//list = [Sumeyra, Hasan, Beril]
        //this is ArrayList. convert to Array
        //what kind of array?String Array
        names = list.toArray(new String[0]);//

        System.out.println(Arrays.toString(names));//[Sumeyra, Hasan, Beril]




    }
}
