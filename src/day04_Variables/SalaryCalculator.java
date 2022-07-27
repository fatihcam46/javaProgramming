package day04_Variables;
public class SalaryCalculator {
    public static void main(String[] args) {
        // hourly rate , weekly hours
        // integer
        int hourslyRate = 65;
        int weeklyRate = 45;
        int numberofWeeks = 52;

        int salary =   hourslyRate * weeklyRate * numberofWeeks;
         // salary nin disina " yazmiyoruz
        System.out.println("hourslyRate =$"+hourslyRate);  // soutv shortcut  kisa yol kullaniyoruz.
        System.out.println("weeklyRate ="+weeklyRate);
        System.out.println("numberofWeeks ="+numberofWeeks);
        System.out.println("salary =$"+salary);

    }

}
