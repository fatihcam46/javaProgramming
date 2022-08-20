package day43_Abstraction.car;
//car>>honda,tesla,audi
public abstract class Car {
    /*    Car Task:
	abstract Car:		make, model, color, year, price....
		start();	(start is different thing we will use abstract class)	stop()
	Honda extends Car:		start(): twist the key to ignition
	Audi extends Car:		start(): push the start button
	Tesla extends Car:		start(): Say "Start"
     */
    //1-write
    private final String brand, model;//i added final keyword>>these are unchangeable>>brand,model,year
    private String color;
    private final int year;
    private double price;
//4-constructor
    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);
//add setcolor`s    //add if
        if(year < 1886){
            throw new RuntimeException("Invalid Year: "+year); //add throw keyword
        }
        this.year = year;
        setPrice(price); //add setprice
    }
//2-getter
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
//3-setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {

        if(price <= 0){
            throw new RuntimeException("Invalid price: "+price);
        }

        this.price = price;
    }
//5-stop method:one implementation all cars
    public  void stop(){
        System.out.println("Press the brake");
    }
//6-start method: I should add abstraction,cars have different details
    public abstract void start();//if I write here abstract, I have to write>> public abstract class Car
//with abstract>>I cannot use>> private,static,final
//7-toString
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


}
