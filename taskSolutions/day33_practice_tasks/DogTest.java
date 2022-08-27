package day33_practice_tasks;

public class DogTest {
    public static void main(String[] args) {
        DogTask6 dog = new DogTask6("Lucy","Husky","Small","Black",'M',2);
        System.out.println(dog);
        dog.eat();
        dog.play();
        dog.sleep();
     /*   DogTask6{name='Lucy', breed='Husky', size='Small', color='Black', gender=M, age=2}
        Lucy is eating.
        Lucy is playing.
        Lucy is sleeping.

      */

    }
}
