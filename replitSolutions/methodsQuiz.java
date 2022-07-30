public class methodsQuiz {
    public static void main(int[] args) {
        System.out.println("int main");

    }
    public static void main(double[] args) {
        System.out.println("double main");

    }
    public static void main(char[] args) {
        System.out.println("char main");
    }
    public static void main(String[] args) {
        System.out.println("String main");
        System.out.println("***********************************");
        int x= 7;
        if(available(x)) {                // Line 1
            System.out.println("Java SE");
        }else {
            System.out.println("Java EE");
        }
        System.out.println("***********************************");

        dosum( 10, 20 );
        dosum( 10.0, 20.0 );
    }



    public static void dosum(double x, double y) {
        System.out.println("double sum is "+(x+y));
    }

    public static void dosum(float x, float y) {
        System.out.println("float sum is "+(x+y));
    }

    public static void dosum(int x, int y) {
        System.out.println("int sum is "+(x+y));
    }
    public static boolean available(int x) {
        return x > 1 ? true : false;


    }

}
