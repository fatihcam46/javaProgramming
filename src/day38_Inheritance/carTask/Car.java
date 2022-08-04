package day38_Inheritance.carTask;
//Tesla,BMW,Toyota>>Car
public class Car {
    public String brand, model;
    public int year;
    public double price;
    public String color;
    public int miles; //these are instance variable not static

    //1-constructor >>>right click>>generate>>
    public Car(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    //2- methods>>>start(), drive()
//start(){car started}>>
    public void start(){
        System.out.println(brand +" "+ model + " is starting");
    }

    public void drive(){
        System.out.println(brand +" "+ model + " is driving");
    }
  /*
    public void fly(){    }
    fly() is not common for all the cars, and parent class should
    only contain the common feature of all the subclasses                   */
    //3-,toString()

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= $" + price +   //lets add $ sign
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
//parent class `s methods are common things
/*
Create a class called Car
			instance variables:
				brand, model, year, price, color, miles
				add a constructor to set all the fields
			instance methods:
				start(), drive(),toString()
 */