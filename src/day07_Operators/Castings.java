package day07_Operators;
/*          Arithmetic Operators (%)        ------- Done
			Unary Operators (+, -, ++, --)  ------- Done
			Shorthand Operators (=, +=, -=, *=, /=, %=)
			Relational Operators (>, <, >=, <=, ==, !=)        */
/*          create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
 */
public class Castings {
    public static void main(String[] args) {
float averagescore = 20.5f;
        byte num1 = (byte)averagescore ;  //explicit casting
        short num2= (short)averagescore;    //explicit casting
        int num3 = (int)averagescore;       //explicit casting
        long num6 = (long)averagescore;
        float num4=averagescore;     //no casting
        double num5 =  (double)averagescore; //implicit casting


        System.out.println("num1 = "+ num1 );
        System.out.println("num2 = "+ num2 );
        System.out.println("num3 = "+ num3 );
        System.out.println("num6 = "+ num6 );
        System.out.println("num4 = "+ num4 );
        System.out.println("num5 = "+ num5 );








    }


}
