package day35_Encapsulation.encapsulation;

public class Employee {
    //variables
    private String name;
    private char gender;
    private int age;
    private double salary;

 //1st  constructor>>  normally this.name=name>>change   setName(name);
    public Employee(String name, char gender, int age, double salary) {
        setName(name);//we used setName>>why>>right data it will be set..otherwise not
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }
 //2nd
    //lets generate getter>>>right click>>> generate >>generate>>choose
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
//3rd
    //lets generate setter>>>right click>>> generate >>generate>>choose//otomatik yazdiriyor.aralara istdgn yaz
    public void setName(String name) {
        if(name.isEmpty()){ //make inside something//
            return;
        }
        this.name = name;
    }

    public void setGender(char gender) {
        if(  !(gender == 'M' || gender == 'F')  ){ //write something>>
            return;
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if(age < 16 || age > 90){
            return;
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if(salary <=0){
            return;
        }
        this.salary = salary;
    }

//4th generate toString>>allows to print
//generate toString>>>right click>> generate>> toString
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
/*
1. Create an Employee Class:
			private variables:
				name, gender, age, salary
			Encapsulate all the private fields
				1. Name can not be empty
				2. gender can not anything other than female or male
				3. age can not be less than 16, and greater than 90
				4. salary can not be zero or negative
 */