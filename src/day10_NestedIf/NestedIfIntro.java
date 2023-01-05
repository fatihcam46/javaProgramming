package day10_NestedIf;

public class NestedIfIntro {   // if in altinda baska bir if olmasi
    public static void main(String[] args) {
        int score = 52;
        if(score>=0 && score<=100){   // if the score is valid
            if (score>=60){
                System.out.println("Passed");    // if student passed the exam
            }else{
                System.out.println("Failed");  // if student failed the exam
            }
        }else{   // if the score is not valid
            System.out.println("Invalid score");
        }
        System.out.println("------------Eligible to buy alcohol-------------------------------");
        int age = 25;
        boolean hasID = true;
        if(hasID){  //if the person has ID
            if (age >= 21) {   // if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            }else{   // if the person is less then 21 years old
                System.out.println("Not eligible to buy alcohol");
            }
        }else{   // if the person does not have ID
            System.out.println("You must have an ID to buy alcohol");
        }
        System.out.println("----------DAYS--------------------------");
        int number = 9;
        if(number>=1  && number<=7){       // if the number is valid number  1~7   // 7options
            if(number ==1){
                System.out.println("Monday");
            }else if(number ==2) {
                System.out.println("Tuesday");
            }else if(number ==3) {
                System.out.println("Wednesday");
            }else if(number ==4) {
                System.out.println("Thursday");
            }else if(number ==5) {
            System.out.println("Friday");
            }else if(number ==6) {
            System.out.println("Saturday");
            }else {
            System.out.println("Sunday");
            }

        }else{   // if the number is not valid
            System.out.println("Invalid Number");
        }

    }
}
