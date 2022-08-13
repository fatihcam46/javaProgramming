package Variables;
/*9.soru
public class Test {
    public  void Test (){
        System.out.println("SDET");
    }
    public  Test(){
        System.out.println("Developer");
    }
    public static void main(String[] args) {
        Test obj = new Test ();
    }
}//developer
 *//*
public class Test {
    public   Test (){
        System.out.println("A");
    }
    public  Test(int a){
        this(2.5);
        System.out.println("B");
    }
    public   Test (double c){
        this();
        System.out.println("C");
    }

    public static void main(String[] args) {
        Test obj = new Test (100);
    }
} ACB


 */
public class Test {
    public   Test (){
        System.out.println("A");

    }
    public  Test(int a){

        System.out.println("B");
    }

    public static void main(String[] args) {
        Test obj = new Test ();
    }}