package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {//outer class
    int a;

    class class1{//inner class
    }

    public static int num = 100;

    public static void method(){
    }

    static{
    }

}


class A { // outer class//it can never be static . it is outer class

    static class B { // inner class//it  is member of A

        public static void method1() {//
        }
    }
}

class C{
    public static void main(String[] args) {
        A.B.method1();//
    }
}


class X{//
}

class Y{
}

class Z{//only inner class can be static.it has to be nested class
    static class Q{

    }
}
//static is applicable for the following>>>variables>methods>blocks>class