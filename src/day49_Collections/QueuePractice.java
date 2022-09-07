package day49_Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("priorityQueue = " + priorityQueue);
//priorityQueue = [10, 40, 300, 200, 90]//randomly

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println("arrayDeque = " + arrayDeque);
//arrayDeque = [10, 200, 300, 40, 90]

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println("linkedList = " + linkedList);
//linkedList = [10, 200, 300, 40, 90]
        System.out.println("-------------------------------------------------");

        priorityQueue.poll();

        System.out.println("priorityQueue = " + priorityQueue);
//priorityQueue = [40, 90, 300, 200] //1st element 10 remove from priorityQueue>>poll() method>>
        arrayDeque.poll();

        System.out.println("arrayDeque = " + arrayDeque);
//arrayDeque = [200, 300, 40, 90]
        linkedList.poll();

        System.out.println("linkedList = " + linkedList);
//linkedList = [200, 300, 40, 90]
        System.out.println("-------------------------------------------------");

       //System.out.println(priorityQueue.get(1));
       // System.out.println(arrayDeque.get(1));  //compile error downcasting we need>>

        //   System.out.println( ( (List)linkedList ).get(1) );

        System.out.println(((LinkedList<Integer>) linkedList).get(1));//index number 1 >>300


    }

}