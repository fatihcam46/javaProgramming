package day50_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
      System.out.println("list = " + list);//list = [1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
        //  remove all the elements that are less than 4
//lets use loop>>
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4){
                list.remove(i);
            }
        }

        System.out.println(list);//[2, 4, 5, 2, 4, 5, 2, 4, 5]
//it is not removing>>
System.out.println("=========Iterator=while loop=remove from the list less than 4==============");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
    System.out.println("list2 = " + list2);//list2 = [1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
        //  remove all the elements that are less than 4

        Iterator<Integer> it = list2.iterator();
/*
        boolean r1 = it.hasNext();
        System.out.println(r1);//true
        System.out.println(it.next());//1 first element:1
        boolean r2 = it.hasNext();
        System.out.println(r2);//true
        System.out.println(it.next());//2 second element:2
*/
//while loop we can use>>over and over again
        while(it.hasNext()){
            if( it.next()  < 4 ){
                it.remove();
            }
        }

        System.out.println(list2);//[4, 5, 4, 5, 4, 5]

        System.out.println("==Iterator=for loop====remove from the list less than 4=================");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for( Iterator<Integer> i=list3.iterator() ; i.hasNext() ; ){
            if(i.next() < 4 ){
                i.remove();
            }
        }

        System.out.println(list3);//[4, 5, 4, 5, 4, 5]  remove from the list less than 4

        System.out.println("====lambda=removeIf() method===remove from the list less than 4============");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list4.removeIf( each ->  each < 4 );//-> arrow token use

        System.out.println(list4);//[4, 5, 4, 5, 4, 5]





    }
}
