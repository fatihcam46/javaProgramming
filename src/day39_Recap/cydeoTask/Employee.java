package day39_Recap.cydeoTask;
//Employee>>>Person
public class Employee extends Person{
//4- add extends Person>>after
//1-Extra variables:employeeId, jobTitle, salary
    private int employeeID;
    private  String jobTitle;
    private  double salary;

    public Employee(String name, int age, char gender,int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);//change this.>>>setEmployeeID>>>
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    //2-getter&setter
    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//  3- Methods:     work()
    public void work(){
        System.out.println(getName()+" is working");
    }


    //5-toString>>right click generate>>>
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +//change getName,getAge,getGender
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';

}}
/*
2. Create a sub class of Person named Employee:
            Extra variables:employeeId, jobTitle, salary
            Encapsulate all the fields
            Add a constructor to set all the fields
            Methods:     work()  toString()
 */