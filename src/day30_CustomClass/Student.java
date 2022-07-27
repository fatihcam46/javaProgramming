package day30_CustomClass;
////custom class>>>>object class is studentObjects
public class Student { //every students objects we need>>>  Attributes  after Actions:
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;  //publis student  char,names,
         public void setInfo(String name, char gender, int age, int ID, char grade) {
            this.name = name;
            this.gender = gender;
             this.age = age;
             this.ID = ID;
             this.grade = grade;
    }//right click>>>>generate>>>>
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name +" is coding");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }
}
