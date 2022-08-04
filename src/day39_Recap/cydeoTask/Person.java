package day39_Recap.cydeoTask;
//person//grandparent
public class Person {
 //1-write  Variables:  name, age, gender
    private String name; //I need to encapsulate,private,
    private int age;
    private char gender;
//2-getter&setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

//3- constructor  >>right click >>generate
    public Person(String name, int age, char gender) {
        setName(name); //change setName...
        setAge(age);
        setGender(gender);
    }

//4- Methods:eat()     drink()  sleep()   toString()
    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

//5-toString>>generate>>toString
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/* 1. Create a class named Person:
            Variables:  name, age, gender
            Encapsulate all the fields
            Add a constructor to set all the fields
            Methods:eat()     drink()  sleep()   toString()
 */