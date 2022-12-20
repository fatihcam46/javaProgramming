package day54_2_boot_camp;

class A{   //parent (super class)
    public A(){
        System.out.println("A");
    }  //every time prints A   //A

    public int a;                          //variable
    public static int b =100;               //variable
    public void methodA(){
        System.out.println("Method A");
    }     // @Override that's why it is not printing
}   //private.protected it cannot override.
class B extends A{   //B is child (subclass)
    @Override   //it is checking override possible or not?
    public void methodA(){
        System.out.println("Method AA");
    }  //Method AA

    public B(){
        System.out.println("B");
    } //B

    public void methodB(){
        System.out.println("Method B");
    }//it is child class unique element
}

public class InheritanceReview {
    public static void main(String[] args) {
        B obj =  new B();
        obj.methodA();    // without you can print it : obj.methodA();
        obj.methodB();
        int a =1000;
        System.out.println("a = " + a);

        int b =100;
        System.out.println("b = " + b);

    }
}    //  in the console:
     //         A   : firstly always parents element prints
     //         B    :secondly itself element
     //         Method AA
     //         MethodB
    //          a = 1000
    //           b = 100