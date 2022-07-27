package day23_practice_tasks;

public class BuyAlcohol {
    public static void main(String[] args) {
        int age =20;
        eligible(age);
    }

    public static void eligible(int age){

        if(age >= 21){
            System.out.println("You are eligible");
        }else{
            System.out.println("You are not eligible");
        }

    }

}
/*
3. create a method that can check if a person is eligible to buy alcohol
 */