package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "Gray", 123456);
        System.out.println("toyota = " + toyota);
 //toyota = Car{brand='Toyota', model='Camry', year=2020, price= $20000.0, color='Gray', miles=123456}

        Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 0);
        System.out.println("tesla = " + tesla);
//tesla = Car{brand='Tesla', model='Model S', year=2022, price= $94990.0, color='Red', miles=0}

        BMW bmw = new BMW("X5", 2020, 67350, "black", 12000);
        System.out.println("bmw = " + bmw);
//bmw = Car{brand='BMW', model='X5', year=2020, price= $67350.0, color='black', miles=12000}

        //normally toyota is starting,tesla,bmw all same>>>
//I want to see different implementation.different output.
// I need override.lets write every sub class different thing
        toyota.start();//Twist the key to ignition to start Toyota Camry
        tesla.start();//Say "Start" to start Tesla Model S
        bmw.start();//Call mechanic to jump start BMW X5

        toyota.drive();//Toyota Camry is driving
        tesla.drive();//Tesla Model S is driving
        bmw.drive();//BMW X5 is driving

    }
}

