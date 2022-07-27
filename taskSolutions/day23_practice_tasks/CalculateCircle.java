package day23_practice_tasks;

public class CalculateCircle {
    public static void main(String[] args) {
        double radius = 12;
        areaOfCircle(radius);
    }
    public static void areaOfCircle(double radius){
        double area = radius * radius * 3.14;
        System.out.println("Area = " + area);
    }
}
/*
6. create a method that can calculate the area of a circle
 */