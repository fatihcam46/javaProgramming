package Strings;

public class test {
    public static void main(String[] args) {
        System.out.println("-------1-----------");
        String str =" ";
        str.trim();
        boolean A = str.isEmpty();
        System.out.println("A = " + A);
        System.out.println("-----2-------------");

        String ta = "A ";
        ta =ta.concat("B ");
        String tb = "C ";
        ta = ta +tb;
        System.out.println("ta = " + ta);
        ta.replace('C','D');
        System.out.println("ta = " + ta);
        ta = ta + tb;
        System.out.println("ta = " + ta);
        System.out.println("-----------3------------");
        String str1 ="Hello World";
        str1.trim();
        int z = str1.indexOf(" ");
        System.out.println("z = " + z);
        System.out.println("---------5-----------");
        String str2 ="Batch 21";
        int Z =str2.trim().length();
        System.out.println("Z = " + Z);
        System.out.println("--------6--------------");

        String s1 ="abc";
        String s2 ="abc";
        System.out.println("s1==s2 is" + s1==s2);

        System.out.println("--------7--------------");
        /*
        which method used to read string input?
        nextLine()   and   next()
         */
        System.out.println("--------8--------------");
        /*
        which package do you need to import to use Scanner ?
       java.util
         */
        System.out.println("--------9--------------");
        /*
        which of the following is valid import?
        package tests;
        import java.util.Scanner
        public class test{
        }

         */
    }
}
