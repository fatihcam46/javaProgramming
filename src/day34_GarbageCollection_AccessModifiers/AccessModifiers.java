package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {//define accessibility
    //public, protected, default, private
    public static int publicData = 100;//public access modifier
    static int defaultData = 200; // access modifier: default(there is no default keyword)
    //public i silersek default olur.
    private static int privateData = 300;//private access modifier

    public static void method1(){//public access modifier
        System.out.println("Public");
    }

    static void method2(){//Default access modifier
        System.out.println("Default");
    }

    private static void method3(){//Private access modifier
        System.out.println("Private");
    }

    public static void main(String[] args) {
//all of them reachable. public default private
        System.out.println(publicData);//100
        System.out.println(defaultData);//200
        System.out.println(privateData);//300
    }
}
