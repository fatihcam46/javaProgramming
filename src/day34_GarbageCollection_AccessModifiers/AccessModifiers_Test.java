package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {
    public static void main(String[] args) {

        System.out.println( AccessModifiers.publicData );//public is visible , you can access always
        System.out.println( AccessModifiers.defaultData );//default also visible same package
        //    System.out.println( AccessModifiers.privateData ); // private is not visible outside the class
//denemek icin package utilities;  bakildi... default-public-private icin
        AccessModifiers.method1();
        AccessModifiers.method2();
        //    AccessModifiers.method3(); // private is not visible outside the class


    }

}
