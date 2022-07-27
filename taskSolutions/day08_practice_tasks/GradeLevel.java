package day08_practice_tasks;

public class GradeLevel {
    public static void main(String[] args) {
        byte level = -9;
        boolean elementary = level>= 1 && level <= 5;
        boolean middle = level>= 6 && level <= 8;
        boolean high = level>= 9 && level <= 12;
        boolean college = level>= 13 && level <= 16;
        boolean grad = level>= 17 && level <= 18;
        boolean invalid = level >18 || level<1;

        if(elementary){
            System.out.println("Elementary School");
        }if(middle){
            System.out.println("Middle school");
        }if(high){
            System.out.println("High school");
        }if(college ){
            System.out.println("College");
        }if(grad) {
            System.out.println("Grad School");
        }if (invalid){
             System.out.println("Invalid Number");
        }




        /*
        Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
         */


    }
}
