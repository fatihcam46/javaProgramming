package day37_Inheritance.phoneTask;

public class Phone {// parent class: only contains the common features of all the subclass
    public String brand;// public static String brand;I cannot write,it is changeable , instance must be.
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery = true;//it is all the phone
//1-constructor
    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

//2-Methods
    public void call(long phoneNumber){
        System.out.println(brand + " "+model+" is calling "+phoneNumber);
    }
    public void text(long phoneNUmber){
        System.out.println(brand + " "+model + " is texting "+phoneNUmber);
    }

//3-toString
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +//don't forget extra thing
                '}';
    }
}

/*
1.1 Create a class named Phone:
				Variables:brand, model, size, price, color
                Add Constructor to set all the fields
				Methods:call(long phoneNumber) ,text(long phoneNumber),toString()
 */