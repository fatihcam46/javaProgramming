package day40_FinalKeyword;
//cat>>Animal
public final class Cat extends Animal { //Cat extends Dog//I cannot write>>compile error//
    //final class >>
    public Cat(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }
}
