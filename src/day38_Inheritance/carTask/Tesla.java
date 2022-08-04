package day38_Inheritance.carTask;
// Tesla>>Car
public class Tesla extends Car{

    public Tesla( String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" in autopilot mode");
    }

    //I want to see different implementation.different output.
    @Override  //@Override  check is it override or not?
    public void start() { //start(){car started}
        System.out.println("Say \"Start\" to start "+brand+" "+model);
        //(Say "Start" to start Tesla Model S)
    }

}
