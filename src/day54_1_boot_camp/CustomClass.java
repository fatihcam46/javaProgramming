package day54_1_boot_camp;

class Person{

    public String name;

    public static int number_of_head;

    static{
        number_of_head = 1;
    }


    public Person(String name) {
        this.name = name;
    }

    public String toString() {   //toString method>>converting object
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}


public class CustomClass {

    public static void main(String[] args) {

        Person person1 = new Person("Cydeo");
        // person1.name = "Cydeo";

        Person person2 = new Person("Java");
        //  person2.name = "Java";

        Person person3 = new Person("Selenium");
        //    person3.name = "Selenium";


        //  System.out.println(person1.name);  //Cydeo
        //   System.out.println(person2.name); //Java Java
        //  System.out.println(person3.name);//Selenium Selenium  Selenium


        System.out.println(person1);//Person{name='Cydeo'}  System.out.println(person1.name);
        System.out.println(person2);//Person{name='Java'}
        System.out.println(person3);//Person{name='Selenium'}

        //  System.out.println(Person.name);error  not through to class
        System.out.println(person3.name);  //Selenium  it must be called through to object

        System.out.println(Person.number_of_head);//1       through the class
        //  System.out.println(person1.number_of_head);     //through to object possible


    }

}