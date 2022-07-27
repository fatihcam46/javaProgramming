package day23_practice_tasks;

public class ConvertDollarToEuro {
    public static void main(String[] args) {
        double dollar = 100;
        dollarToEuro(dollar);
          }
        public static void dollarToEuro(double dollarAmount){
            double euro = dollarAmount * 1.13;
            System.out.println(dollarAmount+" dollars equal to "+euro+" euro");
    }
}
/*
8. create a method that can convert dollar to euro
 */