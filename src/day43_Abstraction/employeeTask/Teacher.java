package day43_Abstraction.employeeTask;
//child class`s Teacher>>Employee>>person
public final class Teacher extends Employee {

//1-constructor
    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }
//2-work and sleep
    @Override
    public void work() {
        System.out.println(getName()+" is teaching.");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is slepping 8 hours.");
    }

}
