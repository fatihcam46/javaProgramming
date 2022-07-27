package day32_Constructors;

public class Test {
    public Test(){ //A
        System.out.println("A");
    }

    public Test(int a){ //A  B
        this();
        System.out.println("B");
    }
    public Test(double a){ //A B C
        this(10);//10 int
        System.out.println("C");
    }
    public Test(String str){ // A B C D
        this(2.5);//2.5 double
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test("Java"); // Java--String
        //1st link 2nd --linked 3rd--linked--4th == printed all==
    }
}
