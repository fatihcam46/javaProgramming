package day37_Inheritance.scrumTask;
//ScrumMaster>>Employee>>Person
public class ScrumMaster extends Employee {

    //delete String jobTitle, after write down>>"Scrum Master"
    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }

}
