package day08_IfStatements;

import javax.lang.model.SourceVersion;

/*
        && Logical AND
        || Logical OR
        ! Logical NOT
 */
public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Aaron";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >=18  && citizen == "USA";
                            // 19>= 18 && "USA"="USA"
                            // true   &&  false ====> false
        System.out.println(name + " is eligible to vote: "+ isEligible);
                        System.out.println("--------creditscore-------------------------");
                String name2 = "Josh";
                int creditscore = 720;
                int age2 = 23;
                int income = 70000;
                boolean isEligible2 = creditscore >=700 && age >=21 && income>=60000;
        System.out.println(name2 + " is eligible for loan: " + isEligible2);
                    System.out.println("--------is eligible to register:----------------------");
        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >= 18 && (gender =='M' || gender =='F');
        //   21>=18 'F'=='M'
        //     true   &&  (false ||  true)
        System.out.println(name3 + " is eligible to register:"+ isEligible3);
                     System.out.println("-------is eligible to apply for US citizen:---------------");
            String name4 = "James";
            String countryofBirth = "UK";
            boolean marriedToUSCitizen =false;
            boolean isEligible4 = countryofBirth == "USA" || marriedToUSCitizen == true;
                                //false             //false
        System.out.println(name4 + " is eligible to apply for US citizen: " + isEligible4);
             System.out.println("-------------- is eligible for scholarship:------------");
        String student = "Anna";
        double gpa = 2.5;
        int familyIncome = 50000;
        boolean isEligible5 = gpa>=3.5 || familyIncome <= 60000;
        System.out.println(student + " is eligible for scholarship:" + isEligible5);
                System.out.println("------- boolean result2 = true;------------------");
        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("result3 = " + result3);
                System.out.println("-----------passed/failed-------------------------");
        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
                 System.out.println("-------------------------------------------");













    }
}
