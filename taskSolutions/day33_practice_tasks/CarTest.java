package day33_practice_tasks;

public class CarTest {
    public static void main(String[] args) {
        CarTask7 car = new CarTask7("Toyota", "Corolla", "Gray", 2021, 35000);
        System.out.println(car);
        System.out.println("Number of wheels: "+car.numberOfWheels+", Has battery: "+car.hasBattery+
                ", Has seats: "+car.hasSeats);
        car.drive();
//Car{make='Toyota', model='Corolla', color='Gray', year=2021, price=35000.0}
//Driving Toyota Corolla
 //Number of wheels: 4, Has battery: true, Has seats: true

    }

}
