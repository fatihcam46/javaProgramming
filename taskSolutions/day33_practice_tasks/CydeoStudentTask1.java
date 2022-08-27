package day33_practice_tasks;

public class CydeoStudentTask1 {
    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "English";
    public String name;//model can change, it cannot static
    public int age;//
    public char gender;
    public int id;
    public char grade;
    public int batchNumber;
    public int groupNumber;

    public CydeoStudentTask1(String name, int age, char gender, int id,
                             char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    public void study(){
        System.out.println(name+" is studying in SDET COURSE. ");
    }
    public void attendClass(){
        System.out.println(name+" is attending class in EU09. ");
    }
    public void printSchoolName(){
        System.out.println("His/Her school name is "+ schoolName);
    }
    public void printProgLanguage(){
        System.out.println("His/Her programmingLanguage is "+programmingLanguage);
    }

    public String toString() {
        return "CydeoStudentTask1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
    /*
    Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

     */
}
