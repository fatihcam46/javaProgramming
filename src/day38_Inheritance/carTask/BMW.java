package day38_Inheritance.carTask;
// BMW>>Car
public class BMW extends Car{
    //String brand, lets delete brand name directly write>>
    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
        //write here BMW
    }
    //lets add methods of BMW
    public void breaksDown(){
        System.out.println(brand + " "+ model +" is breaking down");
    }
    public void racing(){
        System.out.println(brand + " "+ model +" is a racing car");
    }

    //I want to see different implementation.different output.
    public void start(){//start(){car started}
        System.out.println("Call mechanic to jump start "+brand+" "+model);
    }


}
/*
2. BMW:	extra methods:	breaksDown()	racing()
 */