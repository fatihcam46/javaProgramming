package day39_Recap.cydeoTask;
//Student>>>Person
public class Student extends Person  {
//2-add>>>extends Person

    //1-Extra variables: studentId, fieldOfStudy
    private int studentId;
    private String fieldOfStudy;

    //5-constructor
    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender);
        setStudentId(studentId);//this.studentId=studentId change setStudentId, better,it checks condition
        setFieldOfStudy(fieldOfStudy);
    }

    //3-generate getter&setter
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    //6-Methods:study()
    public void study(){
        System.out.println(getName()+" is studying"); //write getname method
    }

    //7-toString
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' + //getName,getAge,getGender(these are private, getter we need,)
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}

/*  6. Create a sub class of Person named Student
            Extra variables:
                studentId, fieldOfStudy
            Encapsulate all the fields
            Add a constructor to set all the fields
            Encapsulate all the fields
            Methods:study()
 */
