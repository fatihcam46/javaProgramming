package day40_FinalKeyword;
//dog>>Animal
public final class Dog extends Animal {
    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void eat(){ //lets override//public method//name of dog//we used getter
        System.out.println(getName()+" is eating dog food");
    }

    /*
    public void drink(){  // final methods can not be overridden
        System.out.println(getName()+" is drinking beer"); //drink(){ is final>>it cannot change
    }
     */

    public void bark(){ //is unique for Dog
        System.out.println(getName()+" is barking");
    }

}
