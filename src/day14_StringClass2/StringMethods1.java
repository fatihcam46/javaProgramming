package day14_StringClass2;

public class StringMethods1 {
    public static void main(String[] args) {   //trim  method
        String str1 = "     batch  25     ";  // bosluklari kaldiriyor    trim  method
      str1 =   str1.trim();  // "batch 25"
       //     System.out.println(str1);  boyle yazildiginda ilk yazili gorunecek
        System.out.println(str1);  // returns new string without white spaces

 System.out.println("------------------------------------------");
        //
        String str2 ="Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);   // 0 dan basliyor index  ler

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

String str3 = "Java Programming language";
int n3 = str3.indexOf("a");
        System.out.println("Java Programming language");
        System.out.println("n3 = " + n3);
        int n33 = str3.indexOf("a ");
        System.out.println("n33 = " + n33);
        int n333 = str3.indexOf("amm");
        System.out.println("n333 = " + n333);

        int n4 = str3.indexOf("g");
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");  // sondan sayarak g yi buluyior.
        System.out.println("n5 = " + n5);

  System.out.println("------------------------------------------");
String s = "Java Nova Cava Wawa orange";
        System.out.println("Java Nova Cava Wawa orange");
   int firstA =s.indexOf("a");
        System.out.println("firstA = " + firstA);
   int lastA =s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);
   int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);
   int thirdA =s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);
   int fourthA=s.indexOf("ava W");
        System.out.println("fourthA = " + fourthA);
   int fourthA4=s.lastIndexOf("av");
        System.out.println("fourthA4 = " + fourthA4);
   int fourthA44=s.indexOf("Ca")+1;
        System.out.println("fourthA44 = " + fourthA44);
    int fifthA=s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);
   int sixthA=s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);
    int seventhA=s.lastIndexOf("a");
        System.out.println("seventhA = " + seventhA);

    }
}
