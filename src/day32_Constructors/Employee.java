package day32_Constructors;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;
//i used just Name`s constructor
    public Employee(String name) {
        this.name = name;
    }
                    //parameters it has to be different
    public Employee(String name, char gender) {
        this(name); //this.name = name;//calls before
        this.gender = gender;
    }
    public Employee(String name, char gender, String jobTitle){
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);
        this.salary = salary;
    }
//total 4 constrctr we have>>>
  /*
    public void method1(){
        this("Aaron");
    }
*/


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
 /*
    public void method1(){
        System.out.println("Method 1");
    }
    public void method2(){
        method1();
    }
    */