package day39_Recap.cydeoTask;
//Tester>>>Employee>>>Person
public class Tester extends Employee {
//2-add>>>extends Employee

//3-generate constructor
    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    //1- Extra methods:   createTicket()
    public void createTicket(){ // 4- add >>getJobTitle() +" "+getName()+
        System.out.println(getJobTitle() +" "+getName()+" is creating ticket");
    }
    //5-from Employee>>right click>>geenrate>>>override
    @Override
    public void work() {  //add here
        System.out.println(getJobTitle()+" "+getName()+" is testing the application");
    }

}
/*
3. Create a sub class of Employee named Tester
            Override the work method
            Extra methods:   createTicket()
 */