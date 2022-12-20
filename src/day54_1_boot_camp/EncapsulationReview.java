package day54_1_boot_camp;

import day35_Encapsulation.Person;

class Employee{

    private String name;
    private double salary;
    private char gender;
//-----------------------------------------------------
    /*
    public Employee(String name, double salary, char gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }

     */
//-----------------------------//right click//generate>>getter&setter create   generate >>toString

    public String getName(){         //private String name;
        if(name == null){
            throw new RuntimeException("Name has not been set");
        } // name can be ready through the getter, as long as it's not null
        return name;
    }

    public void setName(String name){
        if(name ==null){
            throw new RuntimeException("Name can not be set to null");
        }

        if(name.isEmpty()){
            throw new RuntimeException("Name can not be empty");
        }
        this.name = name;
    }
//----------------------------------
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <= 0){
            throw new RuntimeException("Salary of the employee can not be set to zero or negative");
        }
        this.salary = salary;
    }
//------------------------------
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F') ){
            throw new RuntimeException("Gender of the employee can not be set to without M(Male) or F(Female)");
        }
        this.gender = gender;
    }

}
//-------------------------------------
public class EncapsulationReview {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setName("James");   // employee1.setName("James");  Without this throw exception
        System.out.println( employee1.getName() );//James

        employee1.setSalary(100000);
        System.out.println(employee1.getSalary());//100000.0

        employee1.setGender('M');
        System.out.println(employee1.getGender());//M

        //  System.out.println(employee1.name);//if data is     public String name
        //  employee1.salary = -100000;
        // System.out.println(employee1.salary);  //if data is     public   double salary;
                                                //did we have a control?no it is public,private must be
//----------------------------------------------
 //       Employee employee2 = new Employee( "Adam", 100000, 't' );
  //      System.out.println("employee2 = " + employee2);
    }
}

