package day33_practice_tasks;

public class PersonTest {
    public static void main(String[] args) {
        PersonTask3 person = new PersonTask3 ("Adam",25,'M');
        System.out.println("person = " + person);
        //person = PersonTask3{name='Adam', age=25, gender=M}
        System.out.println("Number of Head:"+ person.numberOfHead +", Number of Eyes:"+ person.numberOfEyes
        +", Is Human:"+ person.isHuman+", Has Nose:"+ person.hasNose+", Can breath:"+ person.canBreath
        +", Has wings:"+ person.hasWings);
//Number of Head:1, Number of Eyes:2, Is Human:true, Has Nose:true, Can breath:true, Has wings:false

    }
}
