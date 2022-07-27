package day01_javaIntro;

public class QUIZ1 {
    public static void main(String[] args) {
        //What is the correct order for the following in a java file: package, import, class
        //The name of a java file must be the same as the name of the public class:TRUE
        //What is the correct order of precedence for these operators?*, /, % FIRST +, -SECOND <, >, <=, >=THIRD
        //By default, any whole number will be taken as an int value TRUE
        //By default, any decimal number will be taken as a float value FALSE
        //Which is the following is not a valid variable name? 1one
        //Which of the following is not a valid datatype for a switch statement? long double float boolean
        //In a switch statement, the keywords break and default are optional  true

        System.out.println("---------QUIZ 1 EX 8---------------");
        int a = -5;
        System.out.println(a++ + ",");//-5
        System.out.println(a = 0);//0
        System.out.println("," + --a);// 0-1=-1

        System.out.println("----------QUIZ 1 EX 9---------------");
        short s = 13 - 9 / 3 * 10;
        s += -10;
        System.out.println("s = " + s);

        System.out.println("----------QUIZ 1 EX 10---------------");
        boolean one = ('a' != 'z') && false;
        boolean two = one || 0 == (9 - 10 + 1);
        System.out.println("two = " + two);
        System.out.println("----------QUIZ 1 EX 10---------------");
        long l = 100;
        short ss = (short) l;
        System.out.println(ss + 10);
        System.out.println("----------QUIZ 1 EX 11---------------");
        int b = 10;
        b = --b + b++ + b-- + b++;
        //
        System.out.println("b = " + b);
        System.out.println("----------QUIZ 1 EX 11---------------");
        short sh = 13 + 3 * (10 - 6) & 2;
        boolean b2 = sh != 25;
        System.out.println("b2 = " + b2);// true 13
        System.out.println("----------QUIZ 1 EX 17---------------");
        byte b3 = 104;
        boolean check = b3 < 100;
        if (check) {
            b3 -= 100;
        } else {
            b3 = 50;
        }
        System.out.println("b3 = " + b3);//50
        System.out.println("----------QUIZ 1 EX 18---------------");
        if (183 == 13 + 50 * 2 + 70) {
            System.out.println("Java");
        } else {
            System.out.println("Soft skills");
        }
        System.out.println("----------QUIZ 1 EX 19---------------");
        int cookies = 10;
        String day = "tuesday";
        switch (day) {
            case "sunday":
                cookies++;
            case "monday":
                cookies += 5;
                break;
            case "tuesday":
            case "wednesday":
                cookies += 10;
            case "thursday":
                cookies += 5;
                break;
            case "friday":
                break;
            case "saturday":
                cookies--;
            default:
                cookies = 0;
        }
        System.out.println("cookies = " + cookies);

        System.out.println("----------QUIZ 1 EX 20---------------");
        String str = "";
        int num = 20;
        switch (num) {
            case 0:
                str = "C~";
                break;
            case 10:
                str += "is ";
            case 15:
                str = "fun ";
            case 20:
                str += "java ";
            case 25:
                str += "is ";
                break;
        }
        System.out.println(str);
        System.out.println("----------QUIZ 1 EX 21---------------");
        double pi = 3.14;
        boolean b4 = (119 % 5) == 0;
        int num4 = 0;
        if (pi > 3.14 && !b4) {
            num4 += 50;
        } else {
            num4 -= 50;
        }
        if (b4) {
            num4 += 50;
        }
        System.out.println("num4 = " + num4);  //-50
        System.out.println("----------QUIZ 1 EX 22---------------");
        double decimal = 13.142;
        int whole = decimal < 20 ? 20 : 10;
        System.out.println("whole = " + whole);//20
        System.out.println("----------QUIZ 1 EX 23---------------");

        String name = "Jimmy";
        boolean check1;
        if (name == "James") {
            check1 = false;
        } else {
            check1 = true;
        }
        String str5 = check1 ? "5" : "10";
        System.out.println(str5);//5
        System.out.println("----------QUIZ 1 EX 24---------------");
        int check6 = 132;
        String str6 = "";
        if ((check6 & 2) == 0) {
            str6 += check6;
            if ((check6 & 5) == 0) {
            } else {
                str6 = "500";
            }
        } else {
            str6 += "123";
        }
        System.out.println("str6 = " + str6);//500

        System.out.println("----------QUIZ 1 EX 25---------------");
        int num7 = 2;
        boolean b7 = true;
        switch (num7) {
            case 0:
                b7 = false;
                case1:
                System.out.println(1);
            case 2:
                if (b7) {
                    System.out.println(2);
                } else {
                    b7 = false;
                }
            case 3:
                if (b7) {
                    System.out.println(3);
                    b7 = false;
                } else {
                    break;
                }
            case 4:
                System.out.println(4);
            case 5:
                if (!b7) {
                    break;
                }
                System.out.println(5);
        }



    }
}
