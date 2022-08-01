package day37_Inheritance.animalTask;
//printing animals>>objects
public class AnimalObjects {
    public static void main(String[] args) {

      Dog dog1 = new Dog("Alex", "Husky", 'M',1,"Small","White");

    System.out.println(dog1);//Animal{name='Alex', breed='Husky', gender=M, age=1, size='Small', color='White'}
        dog1.bark();//Alex is barking
        dog1.eat();//Alex is eating
        dog1.sleep();//Alex is sleeping
        dog1.drink();//Alex is drinking
        dog1.move();//Alex is moving
        //dog1.scratch();
        //dog1.sing();



    }
}
