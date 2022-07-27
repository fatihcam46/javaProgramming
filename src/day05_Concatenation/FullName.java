package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Cydeo";
        String lastName = "School";
        int age = 19;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + "  " + lastName;
        System.out.println("Full name of the person is  " + fullName);

        System.out.println(fullName + " is "+ age +" years old.");
        System.out.println(fullName + " is " + jobTitle+ ", works at " + companyName
                + "fullname"+ "'s salary is $"+salary);    }


}
