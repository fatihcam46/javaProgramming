package day43_Abstraction.car;
//child class(Audi)>>parent class(Car)
public final class Audi extends Car  {//final means that Audi cannot copy other class

    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }
//unique start: Push the start button
    public void start() {////2- abstract method>>it cannot have >>it is child class>>
        System.out.println("Push the start button");
    }

    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");
    }

}