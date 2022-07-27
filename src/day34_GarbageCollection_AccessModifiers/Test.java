package day34_GarbageCollection_AccessModifiers;

import static utilities.MathUtility.*;//int r1 = sum(10, 20); ve digerleri icin Mathut..gectik

//from Circle class>>>static set>>
public class Test {

    public static void main(String[] args) {

        System.out.println(Circle.pi);//3.14
        System.out.println(Circle.name);//Circle
        System.out.println(Circle.numbers);//[10, 20]
/*

 */
        System.out.println("----------------------------");
    // find the sum of 10, 20
        int r1 = sum(10, 20);//import static utilities.MathUtility.*; all import we took
        System.out.println("r1 = " + r1);//r1 = 30

        // find the sum of 100, 200
        int r2 = sum(100, 200);
        System.out.println("r2 = " + r2);//r2 = 300

        int r3 = subtract(100,50);
        System.out.println("r3 = " + r3);//  r3 = 50

        int r4 = max(1000, 2000);
        System.out.println("r4 = " + r4); //  r4 = 2000


    }

}
