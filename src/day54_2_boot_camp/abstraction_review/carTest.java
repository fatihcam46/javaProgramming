package day54_2_boot_camp.abstraction_review;


public class carTest {
    public static void main(String[] args) {

//    Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000);
// we can not create object from Abstract class, because abstract class is not concrete

        Honda honda = new Honda();
        System.out.println(honda);
        honda.driver();
        honda.start();
        honda.stop();
    }
}
