package week10_11;

public class TVtest {
    // create object or instance of TV class
    public static void main(String[] args) {

        TV samsung = new TV();

        System.out.println("samsung.volumeLevel = " + samsung.volumeLevel);//1

        samsung.volumeLevel = 6;
        System.out.println("samsung.volumeLevel = " + samsung.volumeLevel);//6


        TV sony = new TV(); // creating a new object from TV class

        System.out.println("sony.volumeLevel = " + sony.volumeLevel); // 1

        System.out.println("sony.on = " + sony.on);//false
        sony.turnOn();
        System.out.println("sony.on = " + sony.on);//true




    }
}
