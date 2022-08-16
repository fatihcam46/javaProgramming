package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

    int[] arr = {1,2,3};
      //  System.out.println(arr[10]);  exception
    try {
        System.out.println(arr[10]);
        System.out.println("Try Block");
    }catch (RuntimeException e){  //if I write ArithmeticException, it will jump finally block
        System.out.println("Catch Block");
        e.printStackTrace();
        System.exit(0);//this is only time stop to finally block
    }finally {
        System.out.println("Finally Block");
    }


}
}
