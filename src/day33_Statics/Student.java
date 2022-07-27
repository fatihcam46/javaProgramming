package day33_Statics;

public class Student {
    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;
//we need constructor//short cut//right click//generate//constrctr//just  name we need>>
    public Student(String name) { // 1. name
    this.name = name;
}
    public Student(String name, char gender) {//2. name and gender
        this(name);
        this.gender = gender;
    }
    public Student(String name, int studentID) {//3. name and studentID
        this(name);
        this.studentID = studentID;
    }
    public Student(String name, int studentID, char grade) {//4. name , studentID,grade
        this(name, studentID);
        this.grade = grade;
    }
    public Student(String name, char gender, int age) {//5.name ,gender,age
        this(name, gender);
        this.age = age;
    }
    public Student(String name, char gender, int age, int studentID) {//6.name ,gender,age,studentID
        this(name, gender, age);//onceki nasilssa paranteze alip yapariz olabilcekleri//control and space>>this()
        this.studentID = studentID;
    }
    public Student(String name, char gender, int age, int studentID, char grade) {//7.name ,gender,age,studentID,grade
        this(name, gender, age, studentID);
        this.grade = grade;
    }

//lets generate string>>>right click//generate//
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
/*
1. Create a class called Student:
				Attributes:		name, gender, age, studentID, grade
        1.Add a constructor that allows user to create object by setting the name of student
		2.Add a constructor that allows user to create object by setting the name and gender of the student
		3.Add a constructor that allows user to create object by setting the name and studentID of the student
		4.Add a constructor that allows user to create object by setting the name, studentID and grade of the student
		5.Add a constructor that allows user to create object by setting the name, gender and age of the student
		6.Add a constructor that allows user to create object by setting the name, gende, age and studentID of the student
		7.Add a constructor that allows user to create object by setting the name, gende, age, studentID and grade of the student
		Actions:	toString()			study()
 */