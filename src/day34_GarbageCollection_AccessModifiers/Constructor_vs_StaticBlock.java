package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {


    static{ ///it can run itself
        System.out.println("Static Block");//will be printd 1st
    }
    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");//it will not print until>>it needs object
        //lets write object from main method
    }

    public static void main(String[] args) {
//main method it does not run itself
  //      System.out.println("Main method");//will be 2nd printed
        new Constructor_vs_StaticBlock(); //1
        new Constructor_vs_StaticBlock(); //2
        new Constructor_vs_StaticBlock(); //3
        new Constructor_vs_StaticBlock(); //4
        new Constructor_vs_StaticBlock(); //5
        /* Static Block>>printed one time
        Static Block
Constructor
Constructor
Constructor
Constructor
Constructor >>ptinted 5times.
         */
    }

}
