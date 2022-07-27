package day10_NestedIf;

public class NameOfMonths2 {
    public static void main(String[] args) {
        int n = 15;
        String name = (n==1)?"Jan":(n==2)?"Feb":(n==3)?"Mar":(n==4)?"Apr":(n==5)?"May":(n==6)?"Jun":  // ()yazilabilir
                (n==7)?"Jul":(n==8)?"Aug":(n==9)?"Sep":(n==10)?"Oct":
                        (n==11)?"Nov":(n==12)?"Dec":"Invalid Number";  //yazilmayabilir de
        System.out.println(name);






    }
}
