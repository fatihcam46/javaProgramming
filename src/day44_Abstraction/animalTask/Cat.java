package day44_Abstraction.animalTask;
//child class Cat extends Animal
public final class Cat extends Animal implements Playable{ //right click create>>override
    //implements Playable
//abstract>>there is no object I can write>>so it cannot abstract
//2-constructor
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
//1-override>>right click
    @Override
    public void eat() {
        System.out.println(getName()+" is eating biryani");
    }
//3-
    public void meow(){
        System.out.println(getName() + " is Meowing");
    }


    @Override
    public void play() {
        System.out.println(getName() + " is playing");
    }

}
