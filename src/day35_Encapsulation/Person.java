package day35_Encapsulation;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    //lets generate constructor>>right click>>generate>>constructor
    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    //lets look static block >>>it has>>planet, isHuman, hasNose, numberOfWings, numberOfHead
    static{
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        numberOfWings = 0;
    }

    //lets write Methods:printPlanetName()>>>it is static method>>
    public static void printPlanetName(){
        System.out.println("Planet name is "+planet);
    }

    //these are instance method>>eat &drink>>if static I cannot write name(different name)
    //eat(String food),drink(String drink),toString()
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }


    //lets generate toString method>>>right click>>generate>>toString choose
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }
}
/*  instance: variable>>name, age, gender, language,//multiple variant
    static variable>>>planet, isHuman, hasNose, numberOfWings, numberOfHead//one option
1. Create a class named Person:
			Variables
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead
			Add a constructor to initialize all the fields
			Add a static block to initialize all the statics
			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */