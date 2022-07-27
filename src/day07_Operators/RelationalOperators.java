package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        //  Relational Operators (>, <, >=, <=, ==, !=)
        boolean result1 = 20>40;    //false
        System.out.println("result1 = " + result1);

        boolean result2 = 300>=100;   //true
        System.out.println("result2 = " + result2);

        boolean result3 = 100>=100;   //true
        System.out.println("result3 = " + result3);

        boolean result4 = 300>=500;   //false
        System.out.println("result4 = " + result4);
        // credit score of 720
        int score = 745;
        boolean isEligibleForLoan = score >= 720;   //greater or equal
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);


        boolean result5 = 100<120;   //true
        System.out.println("result5 = " + result5);

        boolean result6 = 200<180;   //false
        System.out.println("result6 = " + result6);

        int score1 = 59;
        boolean hasFailed = score1 <=59;    //true    59<=59
        System.out.println("hasFailed = " + hasFailed);

        boolean result7 = 45<=60;   //true
        System.out.println("result7 = " + result7);
                System.out.println("-------------------------------------------------------------");
                int x = 100;
                int y = 200;
                boolean equal = x == y;  // false   100==200
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "GoodGuy";   //false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A'=='a';   //false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java";   //true     // "Hello World" == "hello World"    false
        System.out.println("result10 = " + result10);
                    System.out.println("-------------------------------------------------------------");
        
                    
                    boolean result11 = 100 !=200;    //true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break";    //true
        System.out.println("result12 = " + result12);

        boolean result13 = 300 !=300;    //false
        System.out.println("result13 = " + result13);

        
        




















    }
}
