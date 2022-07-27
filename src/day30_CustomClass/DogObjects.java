package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1  = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";
//
        System.out.println(dog1);//nothing,hashcode//we need to write Dog`s class public String toString()
        //or from Dog`s class:right click.>>generate>>toString()
//Dog{name='Lucy', breed='Husky', age=5, gender=F, size='Small', color='White'}

        Dog dog2 = new Dog();
        dog2.name = "ACE" ;
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        System.out.println("dog2 = " + dog2); //without any information null>>>
        //dog2 = Dog{name='null', breed='null', age=0, gender= , size='null', color='null'}
// after:  dog2 = Dog{name='ACE', breed='Husky', age=5, gender=M, size='Large', color='White & Black'}

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2,
                'M', "Large", "Black");
       //one by one writing is so long: Dog `s class lets write setInfo>>
        System.out.println("dog3 = " + dog3);
//dog3 = Dog{name='Jack', breed='German Shepard', age=2, gender=M, size='Large', color='Black'}

        dog1.eat();//Lucy is eating

        dog2.bark();//ACE is barking
        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3,
                'M', "Extra Large", "Yellow");
        System.out.println("dog4 = " + dog4);
 //dog4 = Dog{name='Bullet', breed='Labrador', age=3, gender=M, size='Extra Large', color='Yellow'}

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6,
                'M', "Large", "Black");
        System.out.println("dog5 = " + dog5);
//dog5 = Dog{name='Sully', breed='Pit-Bull', age=6, gender=M, size='Large', color='Black'}
        System.out.println("---------------ArrayList---------------");
        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs =new ArrayList<>();
        ArrayList<Dog> maleDogs =new ArrayList<>();

    }
}
