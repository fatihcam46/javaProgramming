package day33_practice_tasks;

public class IPhoneTask4 {
    public static String brand = "Apple";
    public static String OS = "iOS";
    public static String madeIn = "China";
    public String model;//model can change, it cannot static
    public double price;//
    public String color;
    public String size;

    public IPhoneTask4(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }
    public void faceTime(long phoneNumber){
        System.out.println(model+" is face timing with  number "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(model+" is face timing with email "+email);
    }

    public void call(long phoneNumber){
        System.out.println(model+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model+" is texting to "+phoneNumber);
    }

    public String toString() {
        return "IPhoneTask4{" +
                "model='" + model + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

/*
Create a class named IPhone:Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn
				Add a constructor that can set All the fields (instances)
				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */