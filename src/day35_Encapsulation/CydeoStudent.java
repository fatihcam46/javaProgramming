package day35_Encapsulation;

public class CydeoStudent {

    //instance>> name, gender, age, batchNumber, groupNumber, schoolName
    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;

    //static>>schoolName,programmingLanguage,secretCode
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

//1-variables write
    //lets generate constructor>>right click>>>constructor
    public CydeoStudent(String name, char gender, int age, int batchNumber,
                        int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    //lets write static>>
    static{
        schoolName = "CYDEO";
        programmingLanguage = "JAVA";
        secretCode = "Wooden Spoon";
    }

 //2-methods>>
 //static>>printProgrammingLanguage, printSchoolName, printSecretCode
    public static void printProgrammingLanguage() {
        System.out.println("language is " + programmingLanguage);
    }

    public static void printSchoolName() {
        System.out.println("school is " + schoolName);
    }

    public static void printSecretCode() {
        System.out.println("code is " + secretCode);
    }

    //instance>>attendClass,study
    public void attendClass() {
        System.out.println(name + " is attending class. ");
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    //lets generate toString>>generate right click>>
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +              //lets add
                ", programming language='" + programmingLanguage + '\'' +  //lets add
                '}';
    }
}
/*
2. create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy,
                programmingLanguage, secretCode
            Add a constructor to initialize all the fields
            Add a static block to initialize all the statics
            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */
