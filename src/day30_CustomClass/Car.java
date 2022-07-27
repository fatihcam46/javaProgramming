package day30_CustomClass;
////custom class>>>>object class is CarObjects
public class Car {//custom class there is no printing:main method there is no
    //Attributes
    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

//call use >> setInfo method:
    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice) {
// after we need to asign
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }
//right click>>>generate>>>toString
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    //Actions
    public void drive(){
        System.out.println("Driving "+brand+" "+model);
    }
    public void start(){
        System.out.println(brand+" "+model+" has started");
    }

    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }
}
