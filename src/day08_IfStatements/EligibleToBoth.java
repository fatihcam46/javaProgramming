package day08_IfStatements;

public class EligibleToBoth {
    public static void main(String[] args) {
        String name = "Josh";
        int age = 38;
        String citizen = "USA";
         //Eligible
        boolean isEligible = age >=21 && citizen == "USA";   // true
        if(isEligible){   //true
            System.out.println("Eligible");
        }
        // Not eligible
        if(!isEligible) {
            System.out.println("Not eligible");
        }

    }
}
