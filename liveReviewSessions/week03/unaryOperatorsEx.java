package week03;

public class unaryOperatorsEx {
    public static void main(String[] args) {
        
        int a=50;
        a= --a + a++  + a-- + a++; // 49+  49  +  50 + 49;
        System.out.println("a = " + a);  //197
        
        a=1;                            //
        a= -a--  + a++  / -a--  *  --a;  //-1+ -2 / +1*0  =-1
        System.out.println("a = " + a);

        int x = 4, y=x*4-x++;  //
        System.out.println("y = " + y);

        boolean b1= true;
        System.out.println(!b1);  // unary not operator  false

        System.out.println("----------------------------------------------");

        
        
        
        
        
        
        
    }
}
