package day31_Constructors;

public class Student {
    //Attributes
    public String name;
    public int age;
    public char gender;
    public char grade;
    public int id;

//right click  generate>>>>constructor>> choose all>>>
    public Student(String name, int age, char gender, char grade, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.id = id;
    }
    //right click  generate>>>>string()>> choose all>>>
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }

}
