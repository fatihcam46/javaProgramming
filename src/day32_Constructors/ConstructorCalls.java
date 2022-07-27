package day32_Constructors;

public class ConstructorCalls {
    public ConstructorCalls(){
        System.out.println("Default Constructor");
        //Default Constructor
    }
    public ConstructorCalls(int a){//second
        this(); // Default Constructor
        System.out.println("Constructor with int argument");
        //Default Constructor
        //Constructor with int argument
    }

    public ConstructorCalls(String str){
        //this(); I Cannot write. just one constructor
        this(10); //Default Constructor ,  Constructor with int argument
        System.out.println("Constructor with String argument");
        //Default Constructor
        //Constructor with int argument
        //Constructor with String argument

    }

    public static void main(String[] args) {
        System.out.println("-------------Default Constructor---------------");
        ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("------------Constructor with int argument----------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);

        System.out.println("-----Default Constructor ,  Constructor with int argument------------");

        ConstructorCalls obj3= new ConstructorCalls("Java");

    }
}
