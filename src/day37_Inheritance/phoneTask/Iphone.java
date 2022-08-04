package day37_Inheritance.phoneTask;

public class Iphone extends Phone{//automatically add, write extends Phone{ after >>alt enter

    //String brand>>i dont need to brand of Iphone>>all I phone brand is Apple
    //constractor
    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
        //add here Apple
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a Face Time with phone number: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having a Face Time with email: " + email);
    }

}
/*
 1.2 Create a subclass of Phone named IPhone:
                Variables:brand, model, size, price, color
                Methods:call(long phoneNumber)
                    text(long phoneNumber),faceTime(long phoneNumber)
                    faceTime(String email),  toString()
 */