package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        System.out.println("list = " + list);//list = [10, 10, 10, 20, 20, 20, 30, 30, 30]
//I need arraylist after use for each loop
        ArrayList<Integer> result = new ArrayList<>(); //{10, 20, 30} skip dublicate elements
        for (Integer each : list) {
            if(result.contains(each)){
                continue;
            }
            result.add(each);
        }
        System.out.println("result = " + result);//result = [10, 20, 30]
        
    }
}
