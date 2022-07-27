package day14_StringClass2;

public class StringMethod2 {    //replace method   replacefirst method
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");  //  java yerine   python geciyor
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

String email = "JohnSmith@yahoo.com";
email = email.replace("yahoo", "gmail");
        System.out.println("email = " + email);  // yahoo  yerine  gmail  geciyor

  System.out.println("-----------------------------------");

        String sentence = "Java Java Python Python C@ C@ C++ C++  Python  Python  Python Python";
        String sentence2 = sentence.replace("Python","");
        sentence2 = sentence2.replace("   "," ");
        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

 System.out.println("-----------------------------------");
 
        String s = "Dog Dog Dog Dog Dog Dog ";
        System.out.println("s = " + s);
        String s2=s.replace("Dog", "Cat");
        System.out.println("s2 = " + s2);

        String s3 = "C@ is fun, C@ is cool";
        s3=s3.replace(" C@", " Java"); // ikinci  C@  yerine Java yazalim
        System.out.println("s3 = " + s3);
        
System.out.println("-----------------------------------");

        String s4 = "Java";
        s4 = s4.replace("a", "e"); //Jeve
        System.out.println("s4 = " + s4);
        
 System.out.println("-----------------------------------");

String s5 = "Java is fun, Java is very useful, Java everwhere.";
s5=s5.replaceFirst("Java","Python"); // ilk java yerine pyhton gecti
        System.out.println("s5 = " + s5);
        
 System.out.println("-----------------------------------");

String result = "Java";
result=result.replaceFirst("va","vo");
        System.out.println("result = " + result);

    }
}
