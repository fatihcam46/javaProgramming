package day52_Map_FunctionalInterface;
// lambda:  () -> {}  syntax
public class Test {
    public static void main(String[] args) {
//we need to write 3 costume method>>but more possible>>, lets define FunctionalInterface
// function1: create a function that can display a number is odd or even

                                        //void apply(int n);  from MyFirstFunctionalInterface  Interface(I)
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {  //using lambda expression
            if (n % 2 == 0) {
                System.out.println(n + " is even number");
            } else {
                System.out.println(n + " is odd number");
            }
        };

        oddOrEvenNumber.apply(20);//20 is even number
 System.out.println("---------------------------------------------------------------");
// function2: create a function that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol;

        eligibleToBuyAlcohol = (age) -> {//(age) without parenthesis possible
            if(age >= 21){
                System.out.println(age+" is Eligible to buy alcohol");
            }else{
                System.out.println(age+" is Not eligible to buy alcohol");
            }
        };
//look>>>>void apply(int n);  from MyFirstFunctionalInterface  Interface(I)
        eligibleToBuyAlcohol.apply(18);//18 is Not eligible to buy alcohol
System.out.println("---------------------------------------------------------------");
 //function3: create a function that can display the cube of a number

        MyFirstFunctionalInterface printCube;
// lambda:  () -> {}  syntax   without parenthesis possible  if one
        printCube = n ->  System.out.println("Cube of "+n+" is "+ n*n*n+".");

        printCube.apply(3);//Cube of 3 is 27.   ////look>>>>void apply(int n);  from MyFirstFunctionalInterface  Interface(I)
 System.out.println("---------------------------------------------------------------");
 //function4: create a function that can check if a number is evenly divisible by  3 & 5

        MyFirstFunctionalInterface divisibleBy3And5 =  n -> {
            if(n % 15 ==0){
                System.out.println(n+" is divisible by 3 and 5");
            }else{
                System.out.println(n+" is not divisible by 3 and 5");
            }
        };
        divisibleBy3And5.apply(30);//30 is divisible by 3 and 5
        //30 is reference name is divisibleBy3And5. others cannot,printCube,eligibleToBuyAlcohol...
    }
}
