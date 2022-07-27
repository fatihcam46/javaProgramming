package day31_Constructors;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 'M', 32);
        System.out.println("person1 = " + person1);
        //person1 = Person{name='Daniel', gender=M, age=32}
        
        Person person2 = new Person("Kseniia", 'F', 28);
        System.out.println("person2 = " + person2);
        //person2 = Person{name='Kseniia', gender=F, age=28}

        //if you want to change
        person2.age = 30;
        System.out.println("person2 = " + person2);
        //person2 = Person{name='Kseniia', gender=F, age=30}


    }
}
