package day37_Inheritance.animalTask;

public class Parrot extends Animal {

    //if you want to add unique like that you are adding>>
     public String parrotWingColor;                                                       // String parrotWingColor
    public Parrot(String name, String breed, char gender, int age, String size, String color,String parrotWingColor) {
        super(name, breed, gender, age, size, color);
        this.parrotWingColor = parrotWingColor;//add unique method
    }
    public void sing() {
        System.out.println(name + " is singing");
    }
}
