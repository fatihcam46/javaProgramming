package day07_Operators;
public class Unary_Operator {
    public static void main(String[] args) {
        int num1 = +25;  // positive+ write or not it does not matter
        int num2 = -25;
        System.out.println(num1 <0); //false
        System.out.println(num2<0); // true
            System.out.println("--------pre increment--- increases--------------------");
        int a = 5;
        ++a; //pre increment: increases the value by 1 right away
        System.out.println(a);  //6
        System.out.println("---------pre increment: decreases ---------------------------");
        int a1 = 5;
        --a1;  //pre increment: decreases the value by 1 right away
        System.out.println(a1);  //4
            System.out.println("---------pre increment: increases2 ---------------------------");
        int b = 100;
        System.out.println(++b);   // pre increment: increases the value by 1 right away
        System.out.println("---------post increment: ---increases----------------");
        int c =100;
        System.out.println(c++);  // post increment: first passes the current value,increases the value by 1
        System.out.println(c); // 101
         System.out.println("---------------pre decrement :--------------------------");
        int x = 200;
        System.out.println(--x);  // pre decrement : increases the value by 1 right away   //199
        System.out.println("---------------post decrement :--------------------------");
        int y = 200;
        System.out.println(y--); // post decrement : first passes the current value,decreases the value by 1   //
              System.out.println("-----------exercises-++++++-------------------------");
        int z = 45;
        System.out.println(++z);//46
        System.out.println("z = " + z);//z=46
        System.out.println(z++);   // 46
        System.out.println(z);      // 47
                System.out.println("-----------exercises-  --   --------------------");
        int q = 30;
        System.out.println(--q);  //29   q=29
        System.out.println(q--);  //29, q=28
        System.out.println(q);  // q=28



    }
}
