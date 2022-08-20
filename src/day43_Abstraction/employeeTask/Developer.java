package day43_Abstraction.employeeTask;
//child class`s Developer>>Employee>>person
public final class Developer extends Employee{
//if I write here abstract>>i cannot change after

    //1-constructor
    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    //2-create work and sleep>>generate>>right click>>
    @Override
    public void work() {
        System.out.println(getName()+" is developing application");
    }

//3-sleep
    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 6 hours");
    }
//4-unique developer
    public void unitTest(){
        System.out.println(getName()+" is unit testing");
    }

}
