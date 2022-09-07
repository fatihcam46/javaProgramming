package day49_Collections;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {
//list
        List<Integer> list = new ArrayList<>(); //List
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("list = " + list);
        //list = [10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200,
        // 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90]
        //list has all 25 elements, however Set does not have,
        System.out.println( list.get(4) );//index number 4>>90

//HashSet >>Set does not accept duplicate
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));//addAll method>>
        System.out.println("hashSet = " + hashSet);//hashSet = [200, 40, 10, 90, 300]
                                                    //randomly added
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println("hashSet = " + hashSet);//hashSet = [200, 40, 10, 90, 300]

        hashSet.addAll(Arrays.asList(null, null, null));
    //I added three null element , but it added just one>>
        System.out.println("hashSet = " + hashSet);//hashSet = [null, 200, 40, 10, 90, 300]
        //  System.out.println( hashSet.get(4) ); it is compile error>>

//LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));
   //i added same element, difference is order>>HashSet random order>>linkedHashSet insert order,keeping place
        System.out.println("linkedHashSet = " + linkedHashSet);
        //linkedHashSet = [10, 200, 300, 40, 90, null]

//TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        // treeSet.addAll(Arrays.asList(null,null,null));it will an exception
    //treeSet does not accept null

        System.out.println("treeSet = " + treeSet);//treeSet = [10, 40, 90, 200, 300]
        //sorted all numbers ascending>>
        //   String str = null;
        // System.out.println(str.charAt(0));


    }
}
