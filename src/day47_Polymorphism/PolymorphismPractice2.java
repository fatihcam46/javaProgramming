package day47_Polymorphism;
import day38_Inheritance.carTask.Car;
import day43_Abstraction.employeeTask.Developer;
import day43_Abstraction.employeeTask.Employee;
import day43_Abstraction.employeeTask.Tester;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismPractice2 {

    public static void main(String[] args) {
//array is given
        Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        };


        List<Employee> scrumMembers = new ArrayList<>();
//list of employee??for each loop
        for (Employee employee : employees) {
            if(employee instanceof Tester || employee instanceof Developer){//|| means or
                scrumMembers.add(employee);
            }
          
        }  System.out.println("scrumMembers = " + scrumMembers);

        //scrumMembers = [Employee{name=Sherali, age=32, gender=M, id=1, jobTitle='QA', salary=110000.0},
        // Employee{name=Zuhal, age=27, gender=F, id=2, jobTitle='Java Developer', salary=128000.0},
        // Employee{name=George, age=28, gender=M, id=3, jobTitle='SDET', salary=120000.0},
        // Employee{name=Cristina, age=23, gender=F, id=4, jobTitle='Software Developer', salary=135000.0},
        // Employee{name=Cihad, age=30, gender=M, id=5, jobTitle='SDET', salary=105000.0},
        // Employee{name=Gulistan, age=26, gender=F, id=6, jobTitle='Web Developer', salary=130000.0},
        // Employee{name=Yuliya, age=28, gender=F, id=7, jobTitle='QE', salary=120000.0},
        // Employee{name=Cassendra, age=29, gender=F, id=8, jobTitle='Front-end Developer',
        // salary=140000.0}, Employee{name=Aygu, age=25, gender=F, id=9, jobTitle='SDET', salary=130000.0},
        // Employee{name=Sophie, age=26, gender=F, id=10, jobTitle='Back-end Developer', salary=150000.0},
        // Employee{name=Timur, age=29, gender=M, id=11, jobTitle='SDET', salary=115000.0},
        // Employee{name=Fady, age=26, gender=F, id=12, jobTitle='Full Stack Developer', salary=142000.0},
        // Employee{name=Iryna, age=24, gender=F, id=13, jobTitle='QE', salary=125000.0},
        // Employee{name=Enes, age=26, gender=M, id=14, jobTitle='Full Stack Developer', salary=142000.0},
        // Employee{name=Mikael, age=30, gender=M, id=15, jobTitle='SDET', salary=105000.0}]
        System.out.println("-------------------------------------------------------");

        List<Tester> testers = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();

        for (Employee scrumMember : scrumMembers) {
            if(scrumMember instanceof Tester){
                testers.add((Tester) scrumMember);
            }

            if(scrumMember instanceof Developer){
                developers.add((Developer) scrumMember);
            }

        }


        System.out.println("-------------------------------------------------------");

        Tester testerWithMaxSalary = testers.get(0);
        System.out.println("testerWithMaxSalary = " + testerWithMaxSalary);
        Developer developerWithMaxSalary = developers.get(0);
        System.out.println("developerWithMaxSalary = " + developerWithMaxSalary);
//find these???
    }

}

/*
2. Given the following array that contains Employee objects:
			Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        	};
    		(import them from day43 package)
	   	2.1 store all the developers & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();
        2.2 store all the testers into the following List of testers:
        		List<Tester> testers = new ArrayList<>();
        2.3 store all the developers into the following List of developers:
        		List<Developer> developers = new ArrayList<>();
        2.4 which tester has the maximum salary?
        2.5 which developer has the maximum salary?
 */