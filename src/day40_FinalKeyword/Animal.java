package day40_FinalKeyword;

public class Animal {
    private String name;
    private final String breed;//stays unchangeable//lets use final
    private final char gender;//final also
    private final String color;//final also
    private String size;//size it can change/final it cannot
    private int age;//age it can change/final it cannot



 //1-constructor//generate>>right click>>
    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }

//2-getters
    ////----------getters-right click>>generate>>--------------------
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public char getGender() {
        return gender;
    }
    public String getColor() {
        return color;
    }
    public String getSize() {
        return size;
    }
    public int getAge() {
        return age;
    }

//3-setters
    //----------Setters---------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //----------Setters---------------------
    public void eat(){
        System.out.println(name+" is eating");
    } //it can be change
    public final void drink(){
        System.out.println(name+" is drinking water");
    }
    //final keyword:it will not change
}
