package day44_Abstraction.animalTask;
//interface>>if you want to additional things of common things of parrot&eagle flyable
//Animal:parrot(flyable)(playable),eagle(flyable)(wildAnimal)
public interface Flyable {
    //abstract class I cannot write, because after I cannot add
    //class keyword change interface:
//I am writing every class ,I am writing just here:parrot(flyable),eagle(flyable)
    boolean canFly = true;

    void fly();
}
