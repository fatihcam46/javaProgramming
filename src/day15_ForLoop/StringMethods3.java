package day15_ForLoop;

import java.util.Locale;

public class StringMethods3 {    // isEmpty   //isBlank  method  //equals//equalsIgnoreCase
    public static void main(String[] args) {


        String str = "";  // hic birsey yoksa isEmpty
     boolean r = str.isEmpty();  // ture of false
        System.out.println(r);
        //
      boolean r1= str.isBlank();  // bosluklarda kullnlr
        System.out.println( r1);

        String str2 = "Cydeo    ";
        System.out.println(str2.isBlank());

        System.out.println("------------------------------  " );

        String s1 ="CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

// yes , YES, yES, YEs...    equalsIgnoreCase  kullanlr

        System.out.println("yEs".equals("YES"));
        System.out.println("YeS".equalsIgnoreCase("Yes"));

        System.out.println("------------------------------  " );
String sentence = "My favorite programming language is Java";
boolean hasCSharp = sentence.contains("C#");
boolean hasJava = sentence.contains("Java");
boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");  // java nasil yazilirsa yazilsin true
        boolean r3 = sentence.contains("java")|| sentence.contains("Java");
        System.out.println( hasCSharp);  //false
        System.out.println( hasJava);
        System.out.println( hasJava2);
        System.out.println( r3);
        System.out.println( hasJava3);

        System.out.println("---------------------------------------------");
String input1 = "I love jAva";
String input2 = "Java";
        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println(input1.contains("Java")); //false

        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

        System.out.println("---------------------------------------------");

        String a ="Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean xx = a.startsWith("oo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");

        System.out.println(x);
        System.out.println(xx);  //false
        System.out.println(y);
        System.out.println(z);



    }
}
