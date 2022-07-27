package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");
        System.out.println("student1 = " + student1);//student1 = Student{name='Ahmet', gender= , age=0, studentID=0, grade= }

        Student student2 = new Student("Ahmet",'F');
        System.out.println("student2 = " + student2);

        Student student3 = new Student("Nigara", 11);
        System.out.println("student3 = " + student3);

        Student student4 = new Student("Mert",12,'M');
        System.out.println("student4 = " + student4);

        Student student5 = new Student("Cihad",'M',28);
        System.out.println("student5 = " + student5);

        Student student6 = new Student("Suhaib",'M',27,15);
        System.out.println("student6 = " + student6);

        Student student7 = new Student("Ali",'M',42,16,'A');
        System.out.println("student7 = " + student7);
//student7 = Student{name='Ali', gender=M, age=42, studentID=16, grade=A}

        System.out.println(student1 == student2);//FALSE

        Student[] students = { student1, student2, student3, student4, student5, student6, student7};

        System.out.println(Arrays.toString(students) );
//[Student{name='Ahmet', gender= , age=0, studentID=0, grade= },
// Student{name='Ahmet', gender=F, age=0, studentID=0, grade= },
// Student{name='Nigara', gender= , age=0, studentID=11, grade= },
// Student{name='Mert', gender= , age=0, studentID=12, grade=M},
// Student{name='Cihad', gender=M, age=28, studentID=0, grade= },
// Student{name='Suhaib', gender=M, age=27, studentID=15, grade= },
// Student{name='Ali', gender=M, age=42, studentID=16, grade=A}]

    }
}
