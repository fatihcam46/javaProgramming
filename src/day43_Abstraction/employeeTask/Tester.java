package day43_Abstraction.employeeTask;
//child class`s tester>>employee>>person
public final class Tester extends Employee {
//
//3-constructor
    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

//1-work >>>write body`info>>is testing the application
    @Override
    public void work() {
        System.out.println(getName()+" is testing the application");
    }
//2-sleep>>>sleeps 8 hours
    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 8 hours");
    }

//4-unique tester>>bugReport
    public void bugReport(){
        System.out.println(getName()+" is creating bug reports");
    }
}
