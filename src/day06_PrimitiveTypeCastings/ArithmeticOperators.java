package day06_PrimitiveTypeCastings;
// + addition   -subtraction  /division  *multiplication  %remainder
public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(10+20);
        System.out.println("12"+1);   // concatenation
        System.out.println(50-10);  // 40
        System.out.println(10*5);   //50
        System.out.println(100/3);   //  in math  10/4 = 2.5  but  in java 10/4=2   10.0/2=2.5(double)
        // 100/3=33.3333...    (in math)   but in java =33
        System.out.println(10%4); //  remainder%
        System.out.println("------------------------");

        System.out.println(10.0/4);
        System.out.println(10/4.0);
        System.out.println(10d/4);
        // integer/integer  = integer      decimal/integer=decimal      integer/decimal=decimal
                int a = 100;
                double b = a/6;  //16.0
        System.out.println(b);

        double c = a/6.0;
        System.out.println(c);
        System.out.println(100D);


    }

}
