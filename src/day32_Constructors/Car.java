package day32_Constructors;

public class Car {
    //instance variables:
    public String brand, model;
    public int year;
    public double price;
    public String color;

    public Car (String brand){
        this.brand = brand;
    }

    public Car(String brand,String model){
        this(brand);//it means 1st constrctr
        this.model=model;
    }
    public Car(String brand,String model,int year) {
        this(brand,model);//it means 2nd constrctr
        this.year = year;
    }
    public Car(String brand,String model,int year,double price) {
        this(brand, model, year);//it means 4th constrctr
        this.price = price;
    }
    public Car(String brand,String model,int year,double price,String color) {
        this(brand, model, year,price);//it means 5th constrctr
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= $" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
class name: Car
		 instance variables:
		 		brand, model, year, price, color
 		1st constructor: initializes the brand ONLY
 		2nd constructor: initializes brand & model
 				(MUST use constructor call to set the make)
		3rd constructor: initializes brand, model, year
				(MUST use constructor call to set the brand, model)
		4th constructor: initializes brand, model, year, price
				(MUST use constructor call to set the brand, model, year)
		5th Constructor: initializes all the instances
				(MUST use constructor call to set the brand, mode, year, price, color)
		instance methods: toString
 */