package day44_Abstraction.animalTask;
//(child) class>>Dog>>(parent) Animal
public final class Dog extends Animal implements Playable{
    //add implements Playable>>
    //
    //3-constructor>>
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);//super keyword>>
    }
    //1-bark
    public void bark(){
        System.out.println(getName()+" is barking");
    }
//2-eat>>create >>generate>>overrride
    public void eat() {
        System.out.println(getName()+" eats Pizza");//name>>>I cannot write directly >>getName
    }

    //3-override: play() need to body>>{  } >> public void play()  (public :I need to write)
    @Override
   public void play(){
        System.out.println(getName() +" is playing with ball");
    }
    //private>>getName I used
}
