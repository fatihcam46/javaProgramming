package day23_CustomMethods_Void;

public class CutomMethodPractice {
    public static void main(String[] args) { // istersen basta ya da baska bir yere yazilir
// loop u yazdiktan sonra {} arasina helloWorld5Times();  yaziyoruz.
        //helloCydeo5Times();
        //evenNumbers();
        helloWorld5Times();
        System.out.println("------------------------------");
        helloCydeo5Times();// if you want to go directly inside of method: click: ctrl after click here:
        System.out.println("------------------------------");
        evenNumbers();
    }
    // create a function that can print hello world 5 times ==> helloWorld5Times()
    public static void helloWorld5Times(){ // 5 times Hello World!: we can use : loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }

    // create a function that can print hello Cydeo 5 times  ==> helloCydeo5Times
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }

    // create a function that can print all the even numbers from 1 ~ 10 ==> evenNumbers
    public static void evenNumbers(){
        for (int i = 2; i < 11 ; i+=2) {
            System.out.println(i);
        }
    }

}
