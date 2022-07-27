package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {   // 20 times
            System.out.println("WoodenSpoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("WoodenSpoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("WoodenSpoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("WoodenSpoon");
        }


        System.out.println("------------inner loop 20 times----4*5----------");
        for (int j = 0; j < 4; j++) {   //j:0 1 2 3
            for (int i = 0; i < 5; i++) {   //  i:  0  1 2 3 4
                System.out.println("WoodenSpoon");
            }
        }
/*      Nested loop:  loop inside another loop (inner & outer loops)
        one iteration of the outer loop, executes all the iteration of the inner loop
 */


    }
}
