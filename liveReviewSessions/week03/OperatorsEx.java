package week03;

public class OperatorsEx {
    public static void main(String[] args) {
        //Assignment operators
        int x= 10;
        x+=2;
        System.out.println("x = " + x);  //12  addition

        x-=2;
        System.out.println("x = " + x);  //10   subtrctn

        x*=2;
        System.out.println("x = " + x);   //20  mulpilctn

        x/=2;
        System.out.println("x = " + x);   //10  division

        x%=2;
        System.out.println("x = " + x);   //2  remainder

 System.out.println("--------------------relational OPERATor------------------");
       //  >    <   >=   <=
       int num1=10, num2=5;
       boolean b = num1 > num2;  //true
        System.out.println("First number greater than sevcond number = " + b);






    }
}
