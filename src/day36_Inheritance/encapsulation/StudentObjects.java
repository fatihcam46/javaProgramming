package day36_Inheritance.encapsulation;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Daniel", 29, 'M', 'D', "MIT");
        System.out.println("student1 = " + student1);
  //student1 = Student{name='Daniel', age=29, gender=M, grade=D, schoolName='MIT'}

        student1.setAge(39);
        System.out.println("student1 = " + student1);
  //student1 = Student{name='Daniel', age=39, gender=M, grade=D, schoolName='MIT'}

        student1.setName("Ahmet");
        student1.setSchoolName("CYDEO");
        System.out.println("student1 = " + student1);
  // student1 = Student{name='Ahmet', age=39, gender=M, grade=D, schoolName='CYDEO'}
    }
}
