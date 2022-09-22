package day52_Map_FunctionalInterface;

public class Test2 {
    public static void main(String[] args) {
                                    //String int type any possible
        MySecondFunctionalInterface<String> printEach = s -> {  // lambda:  () -> {}  syntax
            for (String each : s.split("")) {
                System.out.print(each+",");
            }
        };
//void test(T data);  from MySecondFunctionalInterface
        printEach.test("Wooden Spoon");//W,o,o,d,e,n, ,S,p,o,o,n,

        System.out.println("----------------------------------------------------");
                                 //String int type any possible
        MySecondFunctionalInterface<Integer> cube = n -> System.out.println("Cube of "+n+" is "+ n*n*n+".");

        cube.test(5);//Cube of 5 is 125.


    }
}
