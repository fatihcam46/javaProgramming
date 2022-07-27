package day10_practice_tasks;

public class GradeLevel {
    public static void main(String[] args) {
byte level = 25;
String result = "";
boolean validNumber = level >=1 && level <=18;
if(validNumber){    // 1~18 ise
    if(level>=17){
        result = "Grad School";
    }else if(level>=13){
        result="College";
    }else if(level>=9){
        result="High school";
    }else if(level>=6){
        result="Middle school";
    }else if(level>=1){
        result="Elementary school";
    }
}else{result = "Invalid grade level given";
}
        System.out.println("result = " + result);
/*
Create a class called GradeLevel,
Given a number(byte) grade level determine and print
which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                                        For Any Other grade: Invalid grade level given
            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */












    }
}
