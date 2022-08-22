package day44_Abstraction.animalTask;
//Animal:dog(playable),cat(playable),parrot(flyable)(playable)
public interface Playable {
    //class keyword change interface:
    boolean isFriendly = true; // static & final by default//static not necessary

    /* why it is compiler error? static & final by default
    public static void method1(){
        System.out.println(isFriendly);
    }
    */

    void play(); // abstract by default
   // public abstract void play  >>public abstract  not necessary


}
