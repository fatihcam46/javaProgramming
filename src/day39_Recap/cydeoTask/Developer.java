package day39_Recap.cydeoTask;
//Developer>>>Employee>>>Person
public class Developer extends Employee {
//2- write>>extends Employee

//3-generate constructor
    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    //1- Extra methods: fixingBugs()
    public void fixingBugs(){
        System.out.println(getJobTitle()+" "+getName()+" is fixing the bug");
    }

    //from employee right click>>generate>>>override
    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is developing the application");
    }


}

/*
4. Create a sub class of Employee named Developer
            Override the work method
            Extra methods:
                fixingBugs()
 */