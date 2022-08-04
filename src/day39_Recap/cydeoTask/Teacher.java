package day39_Recap.cydeoTask;
//Teacher>>>Employee>>>Person
public class Teacher extends Employee{
//1-extends Employee
    //2-generate constructor
    public Teacher(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    //3-Employee>>right click>>generate>>>override
    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is teaching");
    }

}

/*
5. Create a sub class of Employee named Teacher
            Override the work method
 */