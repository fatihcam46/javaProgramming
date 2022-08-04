package day38_Inheritance.carTask;
// Toyota>>Car
public class Toyota extends Car {
//create super keyword>>>from intelj>>
//String brand, lets delete brand name directly write>>
    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }
//add methods of Toyota>>
    public void reliable() {
        System.out.println(brand + " " + model + " is reliable");

    }


////I want to see different implementation.different output.
    public void start() { //start(){car started}
        System.out.println("Twist the key to ignition to start " + brand + " " + model);
    }
}
/*
/*
1. Toyota:					extra methods:reliable(),start()
 */