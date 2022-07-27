package day32_Constructors;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");
        System.out.println("employee1 = " + employee1);//toString method we need
        //employee1 = Employee{name='Aaron', gender= , jobTitle='null', salary=0.0}

        Employee employee2 = new Employee("Yuliya", 'F');
        System.out.println("employee2 = " + employee2);
        //employee2 = Employee{name='Yuliya', gender=F, jobTitle='null', salary=0.0}

        Employee employee3 = new Employee("Olga", 'F', "SDET");
        System.out.println("employee3 = " + employee3);
        //employee3 = Employee{name='Olga', gender=F, jobTitle='SDET', salary=0.0}

        Employee employee4 = new Employee("Ali", 'M', "QA",56000);
        System.out.println("employee4 = " + employee4);
        //employee4 = Employee{name='Ali', gender=M, jobTitle='QA', salary=56000.0}

    }
}
