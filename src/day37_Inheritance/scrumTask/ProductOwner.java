package day37_Inheritance.scrumTask;
//ProductOwner>>Employee>>Person
public class ProductOwner extends Employee {

    //delete String jobTitle, after write down>> we dont need to write here
    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }
}
