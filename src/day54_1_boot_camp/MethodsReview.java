package day54_1_boot_camp;


public class MethodsReview {
    public static void main(String[] args) {
      //  MethodsReview obj = new MethodsReview();  we can create this constructor, if not default can do

        String str1 = "Cydeo"; //display each character ,print each character of the string
        printEach(str1);  //look >>> public static void printEach(String str){
        //C
        //y
        //d
        //e
        //o
 System.out.println("------------------------------------");
        String str2 = "Java";//look >>> public static void printEach(String str){
        printEach(str2);

 System.out.println("---------String------------------------");
        String str3 = "WoodenSpoon";//look >>> public static void printEach(String str){
        printEach(str3);

 System.out.println("---------int-------------------");

        int[] numbers = {10, 20, 30, 40};//look >>>private static void printEach(int[] arr){
        printEach(numbers);                //it is array variable

System.out.println("---------double---------------------");

        double[] double1 = {10.5, 200.3, 30.4, 40.7};//look >>>private static void printEach(double[] arr){
        printEach(double1);                //it is double variable

System.out.println("------------String---------------------");
        String[] str6 = {"adam", "jim", "james", "john"};//look >>>private static void printEach(String[] arr){
        printEach(str6);                //it is String variable

 System.out.println("------------char---------------------");

       char[] char1 = {'#', ']', '$', '@'};//look >>>private static void printEach(char[] arr){
       printEach(char1);                //it is char variable

System.out.println("------------------------------------");
    }

    public static void printEach(String str){  //void means there is no data return
        for (int i = 0; i < str.length(); i++) {//we need to group to code>>for loop to get each character
            System.out.println(str.charAt(i));
        }
    }
//-----------------------overloading---2methods same name but different parameter---------------------
    private static void printEach(int[] arr){  //it is array variable
        for (int each : arr) {
            System.out.println(each);
        }
    }
//---------------------double----------------
    public static void printEach(double[] arr){   //it is double variable
        for (double each : arr) {
            System.out.println(each);
        }
    }
//----------------------String-------------------
    public static void printEach(String[] arr){//it is String variable
        for (String each : arr) {
            System.out.println(each);
        }
    }
//----------------------char-------------------
    public static int printEach(char[] arr){//it is char variable   //static I added
        for (char each : arr) {
            System.out.println(each);
        }
        return 0;
    }

}
