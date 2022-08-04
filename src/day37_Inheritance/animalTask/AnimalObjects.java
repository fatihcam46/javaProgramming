package day37_Inheritance.animalTask;
//printing animals>>objects
public class AnimalObjects {
    public static void main(String[] args) {

      Dog dog1 = new Dog("Alex", "Husky", 'M',1,"Small","White");

    System.out.println(dog1);//Animal{name='Alex', breed='Husky', gender=M, age=1, size='Small', color='White'}
        dog1.bark();//Alex is barking//it is just Dog1, unique method
        dog1.eat();//Alex is eating
        dog1.sleep();//Alex is sleeping
        dog1.drink();//Alex is drinking
        dog1.move();//Alex is moving
        //dog1.scratch();//I cannot add
        //dog1.sing();//I cannot add

        Cat cat1 = new Cat("Love", "Siamese",'F',2,"Large","Black");
        System.out.println(cat1);
        //Animal{name='Love', breed='Siamese', gender=F, age=2, size='Large', color='Black'}
        cat1.scratch();//unique method
        cat1.eat();//Love is eating
        cat1.sleep();//Love is sleeping
        cat1.drink();//Love is drinking
        cat1.move();//Love is moving
        //  cat1.bark();//I cannot add
        //  cat1.sing();//I cannot add


        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small", "Blue","Blue");
        System.out.println(parrot1);
        //Animal{name='King', breed='Macaw', gender=M, age=3, size='Small', color='Blue'}
        parrot1.sing();//unique method
        parrot1.eat();//King is eating
        parrot1.sleep();//King is sleeping
        parrot1.drink();//King is drinking
        parrot1.move();
        //  parrot1.bark();//I cannot add
        //  parrot1.scratch();//I cannot add


    }
}
