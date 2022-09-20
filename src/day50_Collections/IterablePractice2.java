package day50_Collections;

import java.util.*;

public class IterablePractice2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(   "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", 
                "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"   ));

        //remove all the names "ahmed"
//Iterable we have to use>>while loop
        Iterator<String> it = names.iterator();
        
//return type String
        while(it.hasNext()){//hasNext() just Iterator`s method
            if(it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);//[John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]
//remove all Ahmed`s

        System.out.println("-----Iterator----for loop--------------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(    "Ahmed", "ahmed", "aHmEd", "John", "Ercon",
                "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris" ));
//for loop( ; ; )  >>>(variable;method; )
        for(Iterator<String> itt=names2.iterator(); itt.hasNext() ;  ){
            if(itt.next().equalsIgnoreCase("ahmed")){
                itt.remove();
            }
        }
        System.out.println(names2);//[John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]

        System.out.println("----------Iterator----lambda---------------------------------------");

        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList(   "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", 
                "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"   ));
        
//removeIf(each ->each "")  
        names3.removeIf(each -> each.equalsIgnoreCase("ahmed") );

        System.out.println(names3);//[John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]


        System.out.println("--Iterator-set-------------------------------------");

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,100, 90, 89, 79, 50));
        System.out.println("set = " + set);//set = [1, 2, 3, 4, 100, 5, 6, 7, 8, 9, 79, 50, 89, 90]
        Iterator<Integer> q = set.iterator();

        while(q.hasNext()){
            if(q.next() %2 ==0){ //even numbers remove them
                q.remove();
            }
        }
        System.out.println(set);//[1, 3, 5, 7, 9, 79, 89]

    }
}
