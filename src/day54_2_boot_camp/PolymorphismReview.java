package day54_2_boot_camp;



import day54_2_boot_camp.abstraction_review.*;

public class PolymorphismReview {

    public static void main(String[] args) {

        // Car car = new Audi();
        //  Car car = new Tesla();
        //  Car car = new Honda();
        Car car = new Toyota();


        //AutoPilot autoPilot = new Tesla();
        AutoPilot autoPilot = new AirPlane();


        Car car2 = (Car)new Audi();  // upcasting

        Car electricCar = new Tesla();
        electricCar.driver();
        electricCar.start();
        electricCar.stop();
        //electricCar.autoPilot();

        ( (Tesla)electricCar ).auto_pilot();

        Car car3 = new Honda();

        // (  (Tesla)car3 ).auto_pilot();

        ((Tesla) electricCar).auto_pilot();





    }

}

