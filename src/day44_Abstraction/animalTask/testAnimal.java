package day44_Abstraction.animalTask;

public class testAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat( "Puffy", "Siamese", 'M',3,"Large","blue");
        System.out.println("cat = " + cat1);
          //cat = Cat{name='Puffy', breed='Siamese', gender=M, age=3, size='Large', color='blue'}
        cat1.eat();//puffy is eating biryani
        cat1.meow();//puffy is Meowing
        cat1.play();//Puffy is playing

        System.out.println("-------Dog----------------------------");
       Dog dog1 = new Dog("Alexis", "Husky", 'F',2,"Small","White");
        System.out.println("dog = " + dog1);
        //dog1 = Animal{name='Alexis', breed='Husky', gender=F, age=2, size='Small', color='White'}
        dog1.eat();//Alexis is eating
      //  dog1.meow();
         dog1.play();//Alexis is playing with ball
        dog1.bark();//Alexis is barking
        System.out.println("---------Eagle--------------------");
        Eagle eagle = new Eagle("Adam","Puff", 'M', 2, "Small", "Black");
        System.out.println("eagle = " + eagle);
        //eagle = Eagle{name='Adam', breed='Puff', gender=M, age=2, size='Small', color='Black'}
        eagle.eat();//Adam is eating snake
        eagle.hunt();//Adam is eating snake

        System.out.println("---------Parrot--------------------");
        Parrot parrot = new Parrot("Tom","Thin", 'M', 3, "Mid", "blue/orange");
        System.out.println("parrot = " + parrot);
     //   parrot = Parrot{name='Tom', breed='Thin', gender=M, age=3, size='Mid', color='blue/orange'}
        parrot.eat();//Tom is eating chocolate
       // parrot.hunt();
        parrot.play();//Tom is playing
        parrot.fly();//Tom can fly 20km/h
        System.out.println("---------Tiger--------------------");
        Tiger tiger = new Tiger("Tim","Tif", 'F', 5, "Large", "White");
        System.out.println("Tiger = " + tiger);
        //eagle = Eagle{name='Adam', breed='Puff', gender=M, age=2, size='Small', color='Black'}
        tiger.eat();//Tim is eating deer
        tiger.hunt();//Tim hunts deer


    }
}
