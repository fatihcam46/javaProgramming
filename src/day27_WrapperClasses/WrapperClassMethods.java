package day27_WrapperClasses;

public class WrapperClassMethods {
    // 	    1. parse methods: converts String to primitive
    //		2. valueOf methods: converts String to wrapper class
    //1. parse methods:
    public static void main(String[] args) {
        String str = "123";
       int num =  Integer.parseInt(str); //int
        System.out.println("num = " + num);
        System.out.println( num+1);//124
        System.out.println( str+1);//1231
 System.out.println("---------------double-----------------------------");
        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); // double
        System.out.println("num2 = " + num2);//num2 = 10.5
        System.out.println(num2 + 1);//11.5
  System.out.println("----- int---------MAX_VALUE----MIN_VALUE----------------------");
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);//max = 2147483647
        System.out.println("min = " + min);//min = -2147483648
System.out.println("----- long---------MAX_VALUE----MIN_VALUE----------------------");
        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);//max2 = 9223372036854775807
        System.out.println("min2 = " + min2);//min2 = -9223372036854775808

System.out.println("-------String-boolean------------------------------------");
        String s1 = "maybe";//without "true" always false

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);//false
//2. valueOf methods:
 System.out.println("----String-convert --> int---------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2); //Integer
        int y = Integer.valueOf(s2);// integer unboxing

        System.out.println(x);//123
        System.out.println(y);//123
 System.out.println("----String-convert -->Double---------------------------------------");
        String s3 = "1.5";
        Double z = Double.valueOf(s3);// Double

        System.out.println(z);//1.5

System.out.println("--------char--convert -->boolean--------------------------------------------");

        char ch1 = '!';

        //isDigit()
        boolean r2 = Character.isDigit(ch1);//isDigit
        System.out.println(r2);//false

        //isLetter()
        boolean r3 = Character.isLetter(ch1);
        System.out.println(r3);//false

        // special char
        boolean r4= !Character.isLetterOrDigit(ch1);//not letter or digit (isLetterOrDigit)means special chrctr
        System.out.println(r4);//true

        // upperCase
        boolean r5 = Character.isUpperCase(ch1);
        System.out.println(r5);//false

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);
        System.out.println(r6);//false

 System.out.println("-----String--int-find sum of digit--------------------------");

        String s = "ab1cde2efg3hi4";
// convert String to integer
        int sum = 0;
//for each loop we need
        for (char each : s.toCharArray()) {
            if( Character.isDigit(each) ){// character wrapper class we use
                sum +=  Integer.parseInt(""+each);
                //   sum+=each  we cannot use // sum = 202
            }
        }

        System.out.println("sum = " + sum);//sum = 10

    }
}
