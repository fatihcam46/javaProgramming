package day17_While_DoWHile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {
        System.out.println("--------------for loop-----------");
        boolean a = false;
        for (int i = 0; a;) {
            System.out.println("Wooden Spoon -for loop" );
        }

      System.out.println("-----------while loop-------------");
        while (a){
            System.out.println("Wooden Spoon -while loop");
        }  //while loop: repeated if statement

        System.out.println("--------------do-while loop----------");

        do{    //do -while : JUST DO IT
            System.out.println("Wooden Spoon-- do-while loop");
        }while (a);


/*
You can use a for loop, a while loop or a do-while loop, whichever is convenient.
• A for-loop maybe used if the number of repetition is known in advance
• A while loop may be used used if the number of repetition is not fixed
• A do-while loop maybe used to replace while loop if the loop body must be
executed before the condition is checked.
 */






    }
}
