package week03;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
        System.out.println("--------------------logical OPERATor------------------");
        //   &    &&      |    ||    ^   !
        //bitwise  and         or 
         //INTERVIEW QUESTION
         */
        int A =20,   O=30,   P=30;
        boolean comp=A<O || --O>=P;  //true|| false  :logical first true secand does not compile
        System.out.println("comp = " + comp);
        System.out.println("O = " + O);
        

        boolean compTwo=A>O || O-- >=P;    //false ||true  O=29
        System.out.println("compTwo = " + compTwo);
        System.out.println("O = " + O);

        boolean compThree = A>O  &&  ++O>=P; // false&&complier does not check
        System.out.println("compThree = " + compThree);
        System.out.println("O = " + O);

 System.out.println("--------------------logical OPERATor------------------");
        int b=2;
        boolean res= ++b == 2 || --b == 2 && --b == 2;
        // false&& does not check/matter
        System.out.println("res = " + res);
        System.out.println("b = " + b);


    }
}
