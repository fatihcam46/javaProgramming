package day23_practice_tasks;

public class ConvertDollarToLira {
    public static void main(String[] args) {
        double dollar = 100;
        dollarToLira(dollar);
    }
    public static void dollarToLira(double dollarAmount){
        double lira = dollarAmount * 13.85;
        System.out.println(dollarAmount+" dollars equal to "+lira+" lira");
    }
}
/*
9. create a method that can can convert dollar to lira
 */