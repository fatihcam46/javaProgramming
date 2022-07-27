package day08_practice_tasks;

public class isEligibleCigarette {
    public static void main(String[] args) {
        byte age = 0;
        boolean eligible = age>=21;
        if(eligible){
            System.out.println("Age:"+ age + " is eligible to buy Cigarettes.");
        }if(!eligible) {
            System.out.println("Age:" + age + " is not eligible to buy Cigarettes.");

        }
       /*
       Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes

        */
    }
}
