package day44_Abstraction.animalTask;
//Animal:eagle(flyable)(wildAnimal),tiger(wildAnimal)
public interface WildAnimal {
    //class keyword change interface:
    boolean isWild = true; // static & final by default

    void hunt(); // abstract by default}
}