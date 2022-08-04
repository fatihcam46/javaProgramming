package day37_Inheritance.scrumTask;
//employee child class>> Person , parent class
//Employee>>Person
public class Employee extends Person{// Employee IS A Person

    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;
//1-constructor add>>super(name, age, gender); keyword automatically added
    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }
//method
    public void work(){
        System.out.println(jobTitle+" "+name + "is working");
    }
//toString>>>right click>>
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
    }


/*
name, gender, age, jobTitle, id, salary, companyName
 work(), toString()
 */