package day43_Abstraction.employeeTask;
//grandparent class>>>Person
public abstract class Person {
    /*    Employee task:		abstract Person:			name, age, gender(final)
			eat();			sleep();
		abstract Employee extends Person:
			 id(final), jobTitle, salary...
			work();
		Tester			work(): testing
		Developer		work(): developing
		Teacher			work(): teaching
		Driver			work(): driving
     */
    //1-create name,age,gender
    private String name;
    private int age;
    private char gender;
//6- set to name age gender>>generate>>constructor>>
    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }
//4-getter setter>>>right click>>generate
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
//5-write age>>creating RuntimeException>>>negative numbers
    public void setAge(int age) {
        if(age <= 0){
            throw new RuntimeException("Invalid age: "+age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //2-sleep method            // I have to write Person class also abstract
    public abstract void sleep();//why I made abstract?this parent`s method , just created, after details
//sleeping will be change,could be different hours,7,8,9 hours.
    //3- eat()
    public void eat(){
        System.out.println(name+" is eating baklava");
    }
    //it is common class, all child classes,

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
