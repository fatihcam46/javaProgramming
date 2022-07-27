package day23_practice_tasks;

public class ConvertKgToLb {
    public static void main(String[] args) {
        double kg = 100;
        kgToLb(kg);
    }
    public static void kgToLb(double kg){
        double lb = kg * 2.205;
        System.out.println(kg+" kg equal to "+lb+" pounds.");

    }
}
/*
10. create a method that can convert kg to lb
 */