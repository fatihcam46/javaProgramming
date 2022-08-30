package day47_Polymorphism;

import day43_Abstraction.employeeTask.Employee;
import day43_Abstraction.employeeTask.Person;
import day43_Abstraction.employeeTask.Tester;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;
public class ReferenceTypeCastings {
    public static void main(String[] args) {

         Shape shape = (Shape)new Circle(4);  //upcasting
        //             super type    sub type

        Shape shape2 = new Circle(5);

        // WebDriver driver = (WebDriver) new ChromeDriver();

  //      Dog  dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");;
 //     Dog dog3 = dog2;

       Animal animal = new Dog("Maxxx", "Huskyyy", 'M', 4, "Small", "White");
   //    Dog dog = (Dog)animal; // downcasting
  //     dog.bark();
        System.out.println( animal.getName() ); //Maxxx
  //      System.out.println( dog.getName() ); //Maxxx
        (  (Dog)animal  ).bark(); // downcasting


        Shape shape1 = new Square(5);
        System.out.println( ((Square) shape1).getSide()  );//shape1).getSide()  write this>>after>>without compile error>>right click


        System.out.println("--------------downcasting------------------------------");

        Animal animal2 = new Cat("Jim", "Scottish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal2;  //
        // cat.meow();    //unique of Cat//   animal2.meow(); >>i cannot write

        ( (Cat) animal2 ).meow();   //downcasting

      //  ( (Dog) animal2 ).bark();  //there is no compile error but ClassCastException>>there is no relationship

        System.out.println("---------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        ( (Tester)employee ).bugReport();//unique method is bugReport//

       // ( (Tester)employee ).unitTest();  //tester does not have unitTest()

       //  ( (Developer)employee ).unitTest();//no compile error but Tester no relationship Developer

        //  Driver driver = (Driver) employee;  // line 1//no compile error but Tester no relationship Driver
        Person person = (Person) employee; // line 2//grandparent is possible
        //    Teacher teacher = (Teacher) employee; // line 3//no compile error but Tester no relationship Teacher

        System.out.println("----------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();
        // s1.volume();//there is no volume method

        //  ( (Cube)s1 ).volume();//no compile error but Circle no relationship Cube//ClassCastException

    }
}
