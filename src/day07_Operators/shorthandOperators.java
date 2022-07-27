package day07_Operators;

public class shorthandOperators {
    public static void main(String[] args) {
        // assignment:  =
        int number = 100;
        System.out.println("number="+number);   //100

        number =200;
        System.out.println("number="+number);  //200    // it cannot be a text =cydeo  it cannot
        System.out.println("-------------------------------------------------------");
        String word = " Java Programming";
        System.out.println("word="+word);   //Java Programming

        word = "Wooden Spoon";
        System.out.println("word="+word);   // Wooden Spoon

        word = "Cydeo";
        System.out.println("word="+word);   // Cydeo
                                            // word = 123;  it cannot  123 is not equals to String
        System.out.println("-----------addition Assignment------------------------------");

        // addition Assignment
        int x = 100;
        System.out.println("x="+x);
        System.out.println(x+200);  //300
        //x = x +200;
        x+=200;
        System.out.println("x="+x);
        System.out.println("-------------------------------------------------------");
        String str = "Wooden";
        str = " Spoon";
        System.out.println("str="+str);
        System.out.println("---------double-----------------------------");
        double num1=2.5;
        System.out.println("num1"+num1);  //2.5
            num1 += 5.5;
        System.out.println("num1"+num1);  //8.0
        System.out.println("---------- double avaliableBalance------------------");
        double avaliableBalance = 1000.50;
        // deposit 300$
        avaliableBalance += 300;    // avaliableBalance = 1000.50+300
        System.out.println("avaliableBalance = " + avaliableBalance); //1300.5

        System.out.println("---------addition Assignment  withdrawing 500$--------------------");

        // addition Assignment  withdrawing 500$
        avaliableBalance -= 500;    //  avaliableBalance = 1300.5-500
        System.out.println("avaliableBalance = " + avaliableBalance);

// withdrawing 200$ then depositing 400$
        avaliableBalance -=200;  // 600.5
        avaliableBalance +=400;  // 1000.5
        System.out.println("avaliableBalance = " + avaliableBalance);
             System.out.println("----double salary = 50000.50---salary = salary *2-----------------------------");
             double salary = 50000.50;
             salary *=2;  // salary = salary *2
        System.out.println("salary = " + salary);

        double dodge = 0.00000001;
        dodge *= 1000000;
        System.out.println("dodge = " + dodge);
        
        System.out.println("-------------------------------------------------------");
        
        double num2 = 25000;
        num2 /=2;     //num2 = num2 /2;
        System.out.println("num2 = " + num2);

        System.out.println("-------------------------------------------------------");
            double num3 = 100;
            num3  %= 3;  // %=
        System.out.println("num3 = " + num3);
                System.out.println("------int --amount127--------------------------------");
        
        int amount = 127;   // cents
        int quarters = amount/25;
        int cents = amount%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
                 System.out.println("------int cents2 = 127;-----------------------------------");
        
        int cents2 = 127;
        cents %= 25;
        System.out.println("cents2 = " + cents2);
                 System.out.println("-----int y=300;-- y %=16;---------------------------------");
        
        int y=300;
        y %=16;
        System.out.println("y = " + y);
             System.out.println("-----int balance = 3500;   // insurance fee=153$------");

        int balance = 3500;   // insurance fee=153$
        balance %=153;

        System.out.println("balance = " + balance);
                System.out.println("-------------------------------------------------------");

    }
}
