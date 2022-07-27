package day02_practice_tasks.day11_Switch_Scanner;

public class NumberOdDays {
    public static void main(String[] args) {
        int year = 2000;
        int number = 15;
        if (number >= 1 && number <= 12) {
            switch (number) {
                case 2:
                    if(year%4==0) {
                        System.out.println("29 days");
                    }else {
                        System.out.println("28 days");
                    }
                    break;
                case 4:    case 6:  case 9:   case 11:
                    System.out.println("30 days");
                    break;
                default:  //1,3,5,7,8,10,12  . aylar olabilir
                    System.out.println("31 days");
            }
        } else {
            System.out.println("Invalid Number");
        }

        System.out.println("---------------------------------------------------");

        int year2 = 1776;
        int number2 = 11;
        String result = "";
        if (number2 >= 1 && number2 <= 12) {
            switch (number2) {
                case 2:
                   result = (year2%4== 0)? "29 days":"28 days";
                   break;
                case 4:    case 6:  case 9:   case 11:
                    result="30 days";
                    break;
                default:  //1,3,5,7,8,10,12  . aylar olabilir
                    result="31 days";
            }
        } else {
            result="Invalid Number";
        }
        System.out.println( result);








    }
    }
