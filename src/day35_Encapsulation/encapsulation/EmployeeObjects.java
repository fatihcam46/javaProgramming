package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Tahir", 'M', 30, 120000);
        System.out.println(employee1);//Employee{name='Tahir', gender=M, age=30, salary=120000.0}

        employee1.setAge(32);//new age is 32
//employee1.age>>I cannot write it. it is private.we need setAge

        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);
        System.out.println(employee2);//Employee{name='Aygun', gender=F, age=31, salary=115000.0}

        employee2.setName("Elvira");//new name Elvira
        employee2.setSalary( employee2.getSalary() + 15000 );//new salary+15000=130000
            //firstly original salary getSalary after +15000

        System.out.println(employee1);
        //Employee{name='Tahir', gender=M, age=32, salary=120000.0}
        System.out.println(employee2);
        //Employee{name='Elvira', gender=F, age=31, salary=130000.0}


    }

}
