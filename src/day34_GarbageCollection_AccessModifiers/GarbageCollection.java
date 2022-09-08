package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;
//Garbage collection
public class GarbageCollection {//1st way>> use null keyword//2ng way >>creating a new object
    public static void main(String[] args) {
        /*
         int n = null;
         String str = null;if you want to remove anything use null>>>
         System.out.println( str.toUpperCase() );//we need object.there is no object.null pointer exception
         */

        String str = "Wooden Spoon"; //  "Wooden Spoon" will be eligible for garbage collection
        str = null;//using null keyword>>>Wooden Spoon removed,destroyed, str=null ,

        System.out.println( str );
        System.out.println("------------2----null---------------");

        Car car1 = new Car("Toyota");//package 32>>import day32_Constructors.Car;
        car1 = null;//

        System.out.println(car1);//null

        System.out.println("---------------3--2nd way unreferenced object----------------");
        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        new Dog();//isimleri ust uste yazip onceki silinmesi
        System.out.println("dog1 = " + dog1);//dog1 = Dog{name='Lucy', breed='null', age=0, gender= , size='null', color='null'}
        dog1.name = "Max";
        System.out.println("dog1 = " + dog1);//dog1 = Dog{name='Max', breed='null', age=0, gender= , size='null', color='null'}

        System.out.println("---------------4----------------");
        String language = "Python";
        language    =   "Java";//after that time Python garbage collection//one name

        System.out.println(language);//Java

        System.out.println("-------------5----ArrayList---------");
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);//list1 has 100

        ArrayList<Integer> list2 = list1 ;//list2=list1

        list2.addAll(Arrays.asList(200, 300, 400));//you added list2 3 elements. list1 also is taking 3elements

        System.out.println(list1);//[100, 200, 300, 400]
        System.out.println(list2);//[100, 200, 300, 400]

        System.out.println(list1 == list2 );//true

        System.out.println("---------------6----------------");
        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';//after that time grade B changed A

        Student student2 = student1;//after that time student1=student2
        student2.name = "Ahmet";//Tahir changed Ahmet

        System.out.println(student1);//Student{name='Ahmet', age=30, gender=M, grade=A, id=14}
        System.out.println(student2);//Student{name='Ahmet', age=30, gender=M, grade=A, id=14}
        System.out.println("------------7--ArrayList-----------");
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");//l1 added Java

        ArrayList<String> l2 = l1;//l2 = l1
        l2.add("Python");//l2 and l1 added Python


        System.out.println("l1 = " + l1);//l1 = [Java, Python]
        System.out.println("l2 = " + l2);//l2 = [Java, Python]


    }
}
