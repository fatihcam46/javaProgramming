package Loops;

public class loopsShortQuiuz {
    public static void main(String[] args) {
        System.out.println("---------1--------------------");
/*
While loop executes the body of the loop first, before checking the condition?true
 */System.out.println("---------2--------------------");
        /*
        What does break statement do in loops?
Correct!
  it exits the loop immediately         */
        System.out.println("-------3--6+2=8----------------");

        int a =0;
        while(a<=6){
           a+=2;
            }
        System.out.println("a = " + a);//8

        System.out.println("------4-----------------------");
        int i =0;
        int j=7;
        for (i = 0;  i< j-1; i+=2) {
            System.out.println(i+""); //024
        }
        System.out.println("-------5-----------------------");
        for (int k = 0; k <= 4;) {
            k++;System.out.println(k+"");//12345
        }
        System.out.println("--------6---------------------");

        for (int k = 0; k < 5; k++) {
            System.out.println("Hello Cydeo");//5times 

        }
        System.out.println("-----------7------------------");
        int z=5;
        for (int k = 5; k >0 ; k--) {
            z+=k;
        }
        System.out.println("z = " + z);

        System.out.println("---13---??????-----------");
        int number =5;
        while(number<100){
            number+=number;//5-10-20-40-80-160
        }
        System.out.println("number = " + number);

    }


}
/*
Which of the following loop is best to use when the number of iteration is fixed?For Loop
Which of the following loop is best to use when the number of iteration is not fixed?While Loop
 */