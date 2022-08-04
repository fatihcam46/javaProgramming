package day37_Inheritance.scrumTask;
//Tester,Developer,ScrumMaster,BusinessAnalyst,ProductOwner>>Employee>>Person
public class Person {

    public String name;
    public int age;
    public char gender;
//1-constrctr
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //2-methods
    public void eat(String food){
        System.out.println(name + " is eating "+food );
    }
    public void drink(String drink){
        System.out.println(name + " is drinking "+drink);
    }
    //3-toString

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

/*
Create a class named Person
            variables:  name, age, gender
            methods:  eat(String food)        drink(String drink)     toString()
 */