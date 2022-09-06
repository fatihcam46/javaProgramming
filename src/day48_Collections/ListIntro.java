package day48_Collections;

import java.util.*;//Collections is  ArrayList<>,LinkedList<>,Vector<>,Stack<>  .

public class ListIntro {

    public static void main(String[] args) {

//lets use ArrayList<>
        List<Integer> list1 = new ArrayList<>();//List<int> I cannot>> wrapper class we need
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
                                // 0   1   2    3    4   5
        System.out.println(list1.get(5));//60 >>5th index is 60  //fastest performance-retrieving and accessing

//lets use LinkedList<>
        List<Integer> list2 = new LinkedList<>();//fastest performance-inserting and deleting
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list2.get(4));//50

//lets use Vector<>
        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list3.get(2));//30

//lets use Stack<>
        List<Integer> list6 = new Stack<>();
        list6.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list6.get(5));//60

   System.out.println("-------------Stack----pop();----push()-----------------");
        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list4);//[10, 20, 30, 40, 50, 60]
//Last in first out order (LIFO)
        ((Stack) list4).pop();//action pop>>taking which is last element

        System.out.println(list4);//[10, 20, 30, 40, 50]

        ((Stack) list4).pop();

        System.out.println(list4);//[10, 20, 30, 40]
//pop();>>taking  push();>>adding
        ((Stack) list4).push("80");
        System.out.println("list4 = " + list4);//[10, 20, 30, 40,80]

        ((Stack) list4).push("5");
        System.out.println("list4 = " + list4);//list4 = [10, 20, 30, 40, 80, 5]
        
    }

    public synchronized void method1(){

    }

}