package day35_Encapsulation.encapsulation;

public class Person { //private tan cikartmak icin getName  ve setName kullaniyoruz
    private String name;
    private int age;
//1st lets do>>>name
    //name and age >> lets use public >> getName
    public String getName(){
        return name;
    }
    //after use>> setName >>
    public void setName(String name){
        this.name = name;
    }

//2nd lets do>>age
    //firstly getAge write
    public int getAge(){
        return age;
    }
    //after setAge write >> void write>>
    public void setAge(int age){
        if(age <= 0 || age > 150){
            System.err.println("Invalid Age: "+age);
            System.exit(0);
        }
        this.age = age;
    }


}
