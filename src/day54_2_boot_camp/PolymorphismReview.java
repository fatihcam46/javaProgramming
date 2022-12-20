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

        Car car2 = (Car)new Audi();  // upcasting:casting smaller reference type to larger

        Car electricCar = new Tesla();
        electricCar.driver();
        electricCar.start();
        electricCar.stop();
        //electricCar.autoPilot(); i cannot call, reference type different

        ( (Tesla)electricCar ).auto_pilot();//down casting

        Car car3 = new Honda();

        // (  (Tesla)car3 ).auto_pilot();  //down casting , no error, but classCastException we have to write

        ((Tesla) electricCar).auto_pilot();
    }
}

