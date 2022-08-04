package day37_Inheritance.scrumTask;
//Developer>>Employee>>Person
public class Developer extends Employee {
    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }
//own method of developer
    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }


}
