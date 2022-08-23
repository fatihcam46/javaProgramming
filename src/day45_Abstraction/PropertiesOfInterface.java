package day45_Abstraction;

public interface PropertiesOfInterface {
//1- I can create static & final with interface
    int a = 100;  // static & final by default // private,I cannot
    static int b = 200; // final by default

    /* ////2- I cannot create constructor with interface
    public PropertiesOfInterface(int a){
        this.a =a;
    }
    */

    /*//I cannot create static block with interface
    static{
        b = 100;
    }
    */

    /* //3- I cannot create Instance method with interface
    public void method1(){
        System.out.println("Instance method");
    }
     */
//4- I can create static method
    static void method2(){
        System.out.println("Static method");
    }
//5- I can create abstract method with interface
    void method3();//public abstract , i can write
//6- I can create default method with interface
    default void method4(){ //public  , i can write
        System.out.println("Default method");
    }
}

//7- test class: I need to override one default :ex:method3
class Test implements PropertiesOfInterface{
    @Override
    public void method3() {
    }

    //8-method4
    public static void main(String[] args) {
        new Test().method4();//Default method
    }

}
