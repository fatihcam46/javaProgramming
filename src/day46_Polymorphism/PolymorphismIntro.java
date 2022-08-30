package day46_Polymorphism;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day45_Abstraction.shape.*;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day44_Abstraction.animalTask.Playable;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {
        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double n2 = 5.5;

        Boolean r1 = true;//I want to store all of them,I need to write object

        Object[] array = {str, n1, n2, r1, new Circle(4) , new Square(7)};
//String[] array = ,if I use , but I cannot use, int,boolean.

         /*    WebDriver driver;I want to use both of them,I need to use polymorphism
              driver = new ChromeDriver();
             driver = new FireFoxDriver();      */
        System.out.println(Arrays.toString(array));
//[Wooden Spoon, 2, 5.5, true,
// Circle{name='Circle', area='50.24', perimeter='25.12', radius=4.0},
// Square{name='Square', area='49.0', perimeter='28.0'side=7.0}]
        System.out.println("-------------2ndEXAMPLE-----person connect-cydeoEmployees-------------");

        Employee tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Employee developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Employee teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Employee driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        ArrayList<Person> cydeoEmployees = new ArrayList();
        //I cannot write just tester or  teacher or driver, I must write all, i reference employee or person

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);
        System.out.println("cydeoEmployees = " + cydeoEmployees);
//cydeoEmployees = [Employee{name=Ali, age=30, gender=M, id=42, jobTitle='SDET', salary=145000.0},
// Employee{name=Alex, age=28, gender=M, id=32, jobTitle='Web Developer', salary=155000.0},
// Employee{name=Angel, age=28, gender=F, id=22, jobTitle='English Teacher', salary=85000.0},
// Employee{name=Jhon, age=34, gender=M, id=42, jobTitle='Lyft Driver', salary=75000.0}]

        System.out.println("-----------3RdEXAMPLE-------------------------");
        //bugReport() only tester >>is doing >>Employee employee = new Tester(...>>I cannot write>>
        //I can call just work() method it is including also Employee
        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);
        employee.work();
//Ali is testing the application

       // employee.bugReport();  >>compile error

        System.out.println("-----------4thEXAMPLE-------animal-day44------------");
/*
            WebDriver driver1 = new ChromeDriver();
            WebDriver driver2 = new ChromeDriver();
            driver1.get(amazon)
            driver2.get(google)
            */
        /*
            Animal animal = new Dog();
            animal.drink()
            Animal animal = new Cat()
            animal.drink()
            Animal animal = new Tiger()
            animal.drink()
 */
        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        animal.drink();
        animal.eat();
       // animal.play(); it cannot
        //  animal.bark(); it cannot


        Playable animal2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        System.out.println(animal2.isFriendly);
        animal2.play();
        //  animal2.drink(); it cannot
        //  animal2.eat(); it cannot


        Animal animal3 = new Cat("Max", "Husky", 'M', 3, "Small", "White");
        //Animal , all common thing I can call.
        System.out.println("-----------5thEXAMPLE-------animal-day44------------");
        Shape shape = new Circle(5);
        shape.area();//

        //  System.out.println( shape.getRadius()); //every circle has>>but all shape has not
        // System.out.println( shape.PI);
        System.out.println("---------------instanceof keyword--------------");

        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare);//false   //Shape shape = new Circle(5); reference is circle
        System.out.println("isTriangle = " + isTriangle);//false
        System.out.println("isRectangle = " + isRectangle);//false
        System.out.println("isCircle = " + isCircle);//true     Shape shape = new Circle(5);



        /*
        WebDriver driver:  //reference WebDriver : it could be Chrome or firefox or ...
            if(driver instanceof Chrome){
                Chrome browser will open
            }else if(driver instanceof firefox){
                Firefox browser will open
            }
            ...
         */


    }

}
