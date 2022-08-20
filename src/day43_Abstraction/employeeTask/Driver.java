package day43_Abstraction.employeeTask;
//child class`s Driver>>Employee>>person
public final class Driver extends Employee{

//constructor
    public Driver(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }
//1-work and sleep
    @Override
    public void work() {
        System.out.println(getName()+" is driving");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 10 hours");
    }

}