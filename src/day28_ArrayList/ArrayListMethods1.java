package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        //you need to declare arraylist

    ArrayList<Integer> numbers = new ArrayList<>(); //araylist object created
        System.out.println("numbers = " + numbers);//[] no numbers
 System.out.println("-------------add() method------------------------");
        //add(Data): adds the data after the last index of the ArrayList
        numbers.add(10); //[10] index 0
        numbers.add(20); //[10,20] index1
        numbers.add(30); //[10,20,30] index3
        numbers.add(40); //[10,20,30,40] index4
        numbers.add(50); //[10,20,30,40,50] index6
        numbers.add(60); //[10,20,30,40,50,60] index7
        System.out.println("numbers = " + numbers); //numbers = [10, 20, 30, 40, 50, 60]

 System.out.println("-------------add(index, Data): method------------------------");
        //add(index, Data): inserts the data at the given index
        numbers.add(2, 25); //index number 2, add 25
        numbers.add(5, 45); //index number 5, add 45
        System.out.println("numbers = " + numbers);//numbers = [10, 20, 25, 30, 40, 45, 50, 60]
System.out.println("-------------size(): method------------------------");
        // size(): returns the total number of elements
        System.out.println( numbers.size() );//8
        int lastIndex = numbers.size() - 1;
        System.out.println("lastIndex = " + lastIndex); //lastIndex = 7

System.out.println("-------------get(index): method------------------------");
//get(index): returns the element at the given index
        Integer num = numbers.get(3);//index 3
        System.out.println("num = " + num);//30

 System.out.println("-----------get method------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print( numbers.get(i) + " " );
        }  //10 20 25 30 40 45 50 60
        System.out.println();
 System.out.println("------------set(index,  Data): method------------------------");
      //  set(index,  Data): replaces the element at given index with the new element.

        ArrayList<String> list = new ArrayList<>(); //new araylist object created
        list.add("Java");  //add() method used==>
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println("list = " + list);//list = [Java, Python, Java, C#, Ruby]
        list.set(2, "JavaScript"); // replace  index2 replace==>JavaScript
        list.set(3, "C++");// replace  index3 replace==>C++
        System.out.println("list = " + list);//list = [Java, Python, JavaScript, C++, Ruby]

 System.out.println("------------remove(int index): method------------------------");
//remove(int index): removes the element at the given index
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

     System.out.println("employees = " + employees);//employees = [Suat, Aygun, Olga, Neira, Ali, Hulya, Kaloyan]
        employees.remove(0); // remove Suat
     System.out.println("employees = " + employees);//employees = [Aygun, Olga, Neira, Ali, Hulya, Kaloyan]
        employees.remove(0);// remove Aygun
     System.out.println("employees = " + employees);//employees = [Olga, Neira, Ali, Hulya, Kaloyan]
        employees.remove(0);// remove Olga
     System.out.println("employees = " + employees);//employees = [Neira, Ali, Hulya, Kaloyan]
        employees.remove(1);// remove Ali
      System.out.println("employees = " + employees);//employees = [Neira, Hulya, Kaloyan]
        employees.remove( employees.size() -1 ); //last element==>Kaloyan
      System.out.println("employees = " + employees);//employees = [Neira, Hulya]

        //remove(Object) method: removes the given object from arraylist, returns boolean

     //   employees.remove("Hulya"); //remove object
        boolean r1 = employees.remove("Hulya");
        System.out.println("employees = " + employees);//employees = [Neira]
        System.out.println("r1 = " + r1);//true

      //  employees.remove("Neira");
        boolean r2 = employees.remove("Neira");
        System.out.println("employees = " + employees);// []
        System.out.println("r2 = " + r2);//true



    }
}
