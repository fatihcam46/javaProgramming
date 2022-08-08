package day40_FinalKeyword;
//final keyword>>becames constant.cannot be modified.
public class FinalVariable {
    final String birthDay;
    //I need constructor//generate//right click>>
      public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }


    final static String name1;//I need to write static block
    static{
        name1 = "Batch 25";
    }


    public final static void main(String[] args) {

        final double pi = 3.14; //double pi = 3.14; without final, you can change
        //pi = 4.14; final variables can not be reassigned
        // pi = 5.4;

        final String name;
        name = "Java";
        //   name = "Wooden Spoon"; // after that I cannot change//it is final
        System.out.println(name);//Java

System.out.println("--------------birthDay---------------------");

        FinalVariable obj = new FinalVariable("May/01");
        //obj.birthDay = "June/01"; // final variables can not be reassigned
        System.out.println(obj.birthDay);//May/01


 System.out.println("-----------------name1------------------");

        //  FinalVariable.name1 = "Python";//we decleared final, it cannot change
        System.out.println(FinalVariable.name1);//Batch 25
System.out.println("-----------------int------------------");
   final int num =100;
   // int num =200;  compile error
        System.out.println("num = " + num);

    }
}
