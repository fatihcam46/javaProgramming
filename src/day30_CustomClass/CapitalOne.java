package day30_CustomClass;

import java.util.Arrays;
 //public class Employee connection:
public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John",'M',25,2237,"Developer",100000,true);
        employee2.setInfo("Anna",'F',28,2287,"QA",85000,true);
        employee3.setInfo("David",'M',35,2256,"QA",45000,false);
        employee4.setInfo("Lina",'F',45,2290,"Manager",80000,true);
        employee5.setInfo("Kevin",'M',35,2298,"Senior QA", 110000,true);


        Employee[] employees = { employee1, employee2, employee3, employee4, employee5 };

        /* System.out.println(Arrays.toString(employees));
        [Employee{name='John', gender=M, age=25, id=2237, jobTitle='Developer', salary= $100000.0,
        isFullTime=true},
        Employee{name='Anna', gender=F, age=28, id=2287, jobTitle='QA', salary= $85000.0,
        isFullTime=true},
        Employee{name='David', gender=M, age=35, id=2256, jobTitle='QA', salary= $45000.0,
        isFullTime=false},
        Employee{name='Lina', gender=F, age=45, id=2290, jobTitle='Manager', salary= $80000.0,
        isFullTime=true},
        Employee{name='Kevin', gender=M, age=35, id=2298, jobTitle='Senior QA', salary= $110000.0,
        isFullTime=true}]

         */
        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {
            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }
            if(employee.salary > max){
                max = employee.salary;
            }
            if(employee.salary < min){
                min = employee.salary;
            }
        }

        System.out.println("countPartTime = " + countPartTime);//countPartTime = 1
        System.out.println("countFullTime = " + countFullTime);//countFullTime = 4
        System.out.println("min = " + min);//min = 45000.0
        System.out.println("max = " + max);//max = 110000.0
    }
}
/*
CapitalOne Class:
	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary
 */