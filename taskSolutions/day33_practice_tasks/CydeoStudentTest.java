package day33_practice_tasks;

public class CydeoStudentTest {
    public static void main(String[] args) {
        CydeoStudentTask1 student = new CydeoStudentTask1("Ahmet",25,'M',123456,
                'B',123,123456789);

        System.out.println(student);
        student.study();
        student.attendClass();
        student.printSchoolName();
        student.printProgLanguage();
/*
CydeoStudentTask1{name='Ahmet', age=25, gender=M, id=123456, grade=B, batchNumber=123, groupNumber=123456789}
Ahmet is studying in SDET COURSE.
Ahmet is attending class in EU09.
His/Her school name is Cydeo
His/Her programmingLanguage is English
 */
    }

}
