package day39_Recap.cydeoTask;
//person//grandparent  //Developer,Teacher,Tester>>>Employee>>>Person    //Student>>>Person
public class Cydeo {
    public static void main(String[] args) {

        Developer developer = new Developer("Korkmaz", 29, 'M', 1, "Java Developer", 125000);
        System.out.println(developer);
        //Employee{name='Korkmaz', age=29, gender=M, employeeID=1, jobTitle='Java Developer', salary=125000.0}

        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 110000);
        System.out.println(tester);
        //Employee{name='Olga', age=27, gender=F, employeeID=2, jobTitle='SDET', salary=110000.0}

        Teacher teacher = new Teacher("Daniel", 32, 'M', 3, "Math Teacher", 100000);
        System.out.println(teacher);
        //Employee{name='Daniel', age=32, gender=M, employeeID=3, jobTitle='Math Teacher', salary=100000.0}

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET" );
        System.out.println(student);
        //Student{name='Suhaib', age=30, gender=M, studentId=8, fieldOfStudy='SDET'}
        //employeeID  and salary there are not.
 System.out.println("-------------------developer----------------------------------------------");

        developer.setAge(39);// developer.age  directly we cannot access.write setAge
        System.out.println(developer.getAge());//39 >>>change age 39

        System.out.println(developer);
//Employee{name='Korkmaz', age=39, gender=M, employeeID=1, jobTitle='Java Developer', salary=125000.0}
 System.out.println("----------------------work-------------------------------------------");

        developer.work();//Java Developer Korkmaz is developing the application
        tester.work();//SDET Olga is testing the application
        teacher.work();//Math Teacher Daniel is teaching
        ///student.work(); student does not have work method

 System.out.println("-----Developer-----eat----------drink------------sleep----------------------------");

        developer.eat();//Korkmaz is eating
        developer.drink();//Korkmaz is drinking
        developer.sleep();//Korkmaz is sleeping

        developer.fixingBugs();//Java Developer Korkmaz is fixing the bug

System.out.println("-----tester--------------eat----------drink------------sleep-------------------");

        tester.eat();//Olga is eating
        tester.drink();//Olga is drinking
        tester.sleep();//Olga is sleeping

        // tester.fixingBugs();i cannot write,
        tester.createTicket();//SDET Olga is creating ticket

 System.out.println("-----teacher---------eat----------drink------------sleep-----------");

        teacher.eat();//Daniel is eating
        teacher.drink();
        teacher.sleep();

        // teacher.fixingBugs();  i cannot write,
        //  teacher.createTicket();  i cannot write,
  System.out.println("---------student---------------------------------------------------");

        student.eat();//Suhaib is eating
        student.drink();//Suhaib is drinking
        student.sleep();//Suhaib is sleeping

        // student.fixingBugs();  i cannot write,
        // student.createTicket();  i cannot write,
        student.study();//Suhaib is studying,

    }
}
