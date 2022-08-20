package day43_Abstraction.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        //Person person = new Person("Josh", 35, 'M');
        //Employee employee = new Employee("Ali",30,'M',42,"SDET",145000.00);

        Tester tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Developer developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Teacher teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Driver driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        System.out.println(tester);
        //Employee{name=Ali, age=30, gender=M, id=42, jobTitle='SDET', salary=145000.0}
        System.out.println(developer);
        //Employee{name=Alex, age=28, gender=M, id=32, jobTitle='Web Developer', salary=155000.0}
        System.out.println(teacher);
        //Employee{name=Angel, age=28, gender=F, id=22, jobTitle='English Teacher', salary=85000.0}
        System.out.println(driver);
        //Employee{name=Jhon, age=34, gender=M, id=42, jobTitle='Lyft Driver', salary=75000.0}

        tester.work();//Ali is testing the application
        tester.sleep();//Ali sleeps 8 hours
        tester.bugReport();//Ali is creating bug reports
        tester.eat();//Ali is eating baklava

System.out.println("------------------developer-------------------------------------------");

        developer.work();//Alex is developing application
        developer.sleep();//Alex sleeps 6 hours
        // developer.bugReport();
        developer.eat();//Alex is eating baklava
        developer.unitTest();//Alex is unit testing

 System.out.println("----------------teacher---------------------------------------------------");

        teacher.work();//Angel is teaching.
        teacher.sleep();//Angel is slepping 8 hours.
        teacher.eat();//Angel is eating baklava

    }
}
