package day54_2_boot_camp.abstraction_review;

public abstract class Car {  //parent all class

    public String brand, model;
//    public final void driver (){  if it will change don't use final
//    System.out.println("Driving" + brand+" "+model);
//    }


    public abstract void driver();//static private and final keyword cannot be

    public abstract void start();

    public abstract void stop();

   // public void auto_pilot() {    }  I cannot write here, it means all cars have this method

}