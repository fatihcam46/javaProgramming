package day37_Inheritance.phoneTask;

public class Samsung extends Phone{


//lets delete brand
    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }
//unique samsung >>>
    public void freeze() {
        System.out.println(brand + " " + model + " is freezing");
    }


}


/*
Create a subclass of Phone named Samsung:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    freeze()
                    toString()
 */
