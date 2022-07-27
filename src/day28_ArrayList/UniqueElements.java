package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java"); //0
        list.add("Java"); //1
        list.add("Java"); //2
        list.add("Python"); //3
        list.add("C#"); //4
        list.add("C#"); //5
        list.add("C#"); //6
        list.add("Ruby"); //7
        list.add("C++"); //8
        list.add("C++"); //9

        System.out.println(list);//[Java, Java, Java, Python, C#, C#, C#, Ruby, C++, C++]

        ArrayList<String> uniqueElement = new ArrayList<>();
// fro each loop we use-->
        for (String each : list) {
            if( list.indexOf(each) == list.lastIndexOf(each) ){//find unique element after add method use-->
                uniqueElement.add(each);//unique==first and last index numbers same, appear array list
            }
        }
        System.out.println(uniqueElement);//[Python, Ruby]
    }
}
