package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        System.out.println("----------------Dog()----------------------");
        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "White");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        // dog.hunt();  I cannot do, dog HAS NOT HUNT method.hunt is method of tiger
        // dog.scratch();scratch is method of cat

        System.out.println(dog);
//Max is eating//Max is drinking//Max is sleeping//Max is moving//Max is barking
//Animal{name='Max', breed='Husky', gender=M, age=2, size='Small', color='White'}
        System.out.println("----------------Cat()----------------------");
        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        // cat.bark();
        //  cat.hunt();
        cat.scratch();
        System.out.println(cat);
//Tarcin is eating//Tarcin is sleeping//Tarcin is drinking//Tarcin is moving//Tarcin is scratching
//Animal{name='Tarcin', breed='British', gender=M, age=3, size='Small', color='brown'}
        System.out.println("--------------Tiger()------------------------");
        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();
//  tiger.bark();
        System.out.println(tiger);
       /*
       Sher Khan is eating  Sher Khan is sleeping  Sher Khan is drinking  Sher Khan is moving
Sher Khan is roaring  Sher Khan is hunting
Animal{name='Sher Khan', breed='Bengal', gender=M, age=4, size='Large', color='Orange'}
        */
    }
}
