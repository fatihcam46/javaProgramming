package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
                 int hourlyRate = 12,  // int devam etmesi icin , kullanilabilir
                     weeklyHours = 29;
                double stateTaxRate = 0,
                       federalTaxRate = 0;
       //----------------------------------------------------
        int salaryBeforeTax = hourlyRate * weeklyHours * 52;  // salary = week*52
        double stateTax = salaryBeforeTax * stateTaxRate /100;
        double federalTax = salaryBeforeTax * federalTaxRate /100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;


        System.out.println("Gross pay = $ "+salaryBeforeTax );
        System.out.println("State tax = $"+ stateTax);
        System.out.println("Federal tax = $"+ federalTax);
        System.out.println("Total tax = $"+ totalTax);
        System.out.println("Net income = $" + salaryAfterTax);

    }

}
