package day24_CustomMethod_Return;

import java.util.Locale;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Wooden", "Spoon"); // W.S
        System.out.println("---------------------------------------------");
        domain("Cydeo.School@amazon.com");
        System.out.println("--------------emails-----------------------");
        String[] emails = { "josh@gmail.com", "jima@yahoo.com", "Elminur@cydeo.com", "Gulsen@mynet.com"};
       //  domain(emails[0]);  for loop using easy way: every element
        for (String email: emails) {
            domain(email);
        }
        System.out.println("----------nameOfMonth----------------------");
        nameOfMonth(6);
        System.out.println("-----------nameOfDay---------------------");
        nameOfDay(7);
        System.out.println("---------------------------------------------");
        daysInMonth(28);
    }
//1. Create a method that can display the initials of the person ===>> initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName){
        String initial =firstName.charAt(0)+"."+lastName.charAt(0);// index 0 : ilk harflerini al
        System.out.println(initial);
        // initial=initial.toUpperCase();  if wooden, spoon  ==>> convert W.S
            }

//2. Create a method that can display the domain of the email  ===>> domain(String email)
    public static void domain(String email) {  //Cydeo@gmail.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

//3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){
        String name = "";
        if(number>=1 && number<=12){ // tenary  multi branch  swicth  we can use: tenary we will use
            name = (number==1)?"Jan":(number==2)?"Feb":(number==3)?"Mar":(number==4)?"Apr":(number==5)?"May":
                    (number==6)?"Jun":(number==7)?"Jul":(number==8)?"Aug":(number==9)?"Sep":(number==10)?"Oct":
                            (number==11)?"Nov":"Dec";
        }else{
            name="Invalid Number";
        }
         System.out.println("Month name = " + name);
    }

//4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        String name = "";
        if(number>=1 && number<=7){ // tenary  multi branch  swicth  we can use: tenary we will use
            name = (number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursday":
                    (number==5)?"Friday":(number==6)?"Saturday":"Sunday";
        }else{
            name="Invalid Number";
        }
        System.out.println("Day name = " + name);
        /*         if(number < 1 || number > 7){ // if the number is invalid
            System.out.println("Invalid");
            return ; // exits nameOfDay method
        }
        if(number == 1){
            System.out.println("Monday");
        }else if(number == 2){
            System.out.println("Tuesday");
        }else if(number == 3){
            System.out.println("Wednesday");
        }else if(number == 4){
            System.out.println("Thursday");
        }else if(number == 5){
            System.out.println("Friday");
        }else if(number == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }
   */

    }
//5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){
    String name = "";
        if(number==30){
          System.out.println("Apr or "+"Jun or "+"Sep or "+"Nov");
        }else if(number==31){
            System.out.println("Jan or "+"Mar or "+"May or "+"Jul or "+"Aug or "+"Oct or "+"Dec or ");
        }else if(number==29 || number==28){
          System.out.println("Feb");
        }else{
          System.out.println("Invalid Number");
        }
    }

        /*
        Warmup tasks:
	1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
         */





}
