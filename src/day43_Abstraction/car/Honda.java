package day43_Abstraction.car;
//child class(Honda)>>parent class(Car)
public final class Honda extends Car  { //here also we cannot write abstract
//1-constructor
    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }
    //2- abstract method>>it cannot have >>it is child class>>
    //I need to override>>
    //right click>>generate>>
    public void start(){//return type must be same of Car class
        System.out.println("Twist the key to ignition");
        //I cannot write stop() method,it is not abstract
    }
}